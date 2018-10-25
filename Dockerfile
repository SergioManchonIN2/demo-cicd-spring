FROM openjdk:8-jre-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ./build/libs/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080