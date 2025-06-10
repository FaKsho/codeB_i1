FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/codeB_I1-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} appCodeBI_1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "appCodeBI_1.jar"]