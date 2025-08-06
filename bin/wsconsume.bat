@echo off

@if not "%ECHO%" == ""  echo %ECHO%
@if "%OS%" == "Windows_NT"  setlocal

set DIRNAME=.\
if "%OS%" == "Windows_NT" set DIRNAME=%~dp0%
set PROGNAME=run.bat
if "%OS%" == "Windows_NT" set PROGNAME=%~nx0%

if "x%JAVA_HOME%" == "x" (
  set  JAVA=java
  echo JAVA_HOME is not set. Unexpected results may occur.
  echo Set JAVA_HOME to the directory of your local JDK to avoid this message.
) else (
  set "JAVA=%JAVA_HOME%\bin\java"
  if exist "%JAVA_HOME%\lib\tools.jar" (
    set "JAVAC_JAR=%JAVA_HOME%\lib\tools.jar"
  )
)

if "%JBOSS_HOME%" == "" set JBOSS_HOME=%DIRNAME%\..

rem Setup the java endorsed dirs
set JBOSS_ENDORSED_DIRS=%JBOSS_HOME%\lib\endorsed

rem Shared libs
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JAVAC_JAR%
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/activation.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/getopt.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/wstx.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/wstx-lgpl.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossall-client.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/log4j.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/mail.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-spi.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-common.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-framework.jar

rem Shared jaxws libs
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jaxws-tools.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jaxws-rt.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/stax-api.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jaxb-api.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jaxb-impl.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jaxb-xjc.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/streambuffer.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/stax-ex.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jaxws-api.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jsr181-api.jar

rem Stack specific dependencies
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/javassist.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jboss-xml-binding.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossxb.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-native-client.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-native-core.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-native-jaxws.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-native-jaxws-ext.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-native-jaxrpc.jar
set WSCONSUME_CLASSPATH=%WSCONSUME_CLASSPATH%;%JBOSS_HOME%/client/jbossws-native-saaj.jar

rem Execute the command
"%JAVA%" %JAVA_OPTS% -Djava.endorsed.dirs="%JBOSS_ENDORSED_DIRS%" -classpath "%WSCONSUME_CLASSPATH%" org.jboss.wsf.spi.tools.cmd.WSConsume %*
