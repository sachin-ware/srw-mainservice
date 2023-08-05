FROM openjdk:17
WORKDIR /opt
ENV port 8080
EXPOSE 8085
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec  java $JAVA_OPTS -jar app.jar
