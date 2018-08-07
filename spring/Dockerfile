FROM openjdk:10-jdk
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} spring-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-1.0-SNAPSHOT.jar"]