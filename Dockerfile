FROM openjdk:21-jdk-slim
EXPOSE 8080
ENTRYPOINT ["java", "-jar","target/codeB_I1-0.0.1-SNAPSHOT.jar"]
