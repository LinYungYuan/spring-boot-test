FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/practice-*.jar
COPY ${JAR_FILE} practice.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/practice.jar"]