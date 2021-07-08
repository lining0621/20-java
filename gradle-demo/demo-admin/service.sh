#***************************************************************************
## Author: li-ning
## Company: IBM
## Date:    2021-04-20
## FileName: service.sh
## Description: 启动、停止或查看java服务
## Format: sh service.sh *.jar [start | stop | status] [dev | tst | pre | prd]
## Example:
##        sh service.sh demo-biz-1.0.0.0.jar start dev
##        sh service.sh demo-biz-1.0.0.0.jar stop
##        sh service.sh demo-biz-1.0.0.0.jar status
#***************************************************************************
RUN_TYPE = $1
JAR_NAME = $2
RUN_ENV = $3

case $RUN_TYPE in
  "start")
    ECHO "service starting ......"
    nohup java -jar $JAR_NAME --spring.profiles.active=$RUN_ENV >> nohup.out 2>$1 &
    echo $! > $JAR_NAME.pid
    ECHO "\033[41;37mservice started. \033[0m"
    ;;
  "stop")
    ECHO "service stoping......"
    PID=$(cat $JAR_NAME.pid)
    kill -9 $PID
    ECHO "\033[41;37mservice stoped. \033[0m"
    ;;
  "status")
    ECHO "service status: "
    ps -ef | grep $JAR_NAME
    ;;
  *)
    ECHO "\033[41;37margs is invalid. \033[0m"
    ;;
esac
exit 0;