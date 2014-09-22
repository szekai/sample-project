#!/bin/sh

if [ -z $APP_PATH ]; then
  APP_PATH=.
fi


CLASSPATH=.:$APP_PATH/lib/*
#LOG_CONF=$APP_PATH/conf/logback.xml
LOG_CONF=$APP_PATH/conf/log4j.xml
#JAVA_OPTS="-classpath $CLASSPATH -Dlogback.configurationFile=$LOG_CONF -DAPP_PATH=$APP_PATH"
JAVA_OPTS="-classpath $CLASSPATH -Dlog4j.configuration=$LOG_CONF -DAPP_PATH=$APP_PATH"
java $JAVA_OPTS sky.logger.MyApp1