FROM fabric8/java-alpine-openjdk8-jre

RUN rm -f /etc/localtime \
&& ln -sv /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
&& echo "Asia/Shanghai" > /etc/timezone

ADD target/demoAction.jar /app/app.jar

ENTRYPOINT ["java", "-jar","app/app.jar"]