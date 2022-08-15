FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

FROM openjdk:17-alpine
COPY --from=build /app/target/user-register-0.0.1-SNAPSHOT.jar /app/user-register-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/user-register-0.0.1.jar"]