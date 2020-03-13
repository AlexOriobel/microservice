FROM openjdk:11.0.6-jdk-buster
MAINTAINER Alex

VOLUME /tmp
ADD ../target/gs-spring-boot-docker-0.1.0.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]