FROM openjdk:8u322-jre-slim-bullseye

#RUN rm -f /etc/localtime \
#&& ln -sv /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
#&& echo "Asia/Shanghai" > /etc/timezone
RUN timedatectl set-timezone Asia/Shanghai
COPY target/demoAction.jar /app/app.jar

ENTRYPOINT ["java", "-jar","app/app.jar"]