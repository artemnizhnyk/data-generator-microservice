FROM gradle:7.3.3-jdk17 AS build

COPY /src /home/gradle/src
COPY build.gradle settings.gradle /home/gradle/

WORKDIR /home/gradle

RUN gradle build --no-daemon

FROM openjdk:17-jdk-slim

COPY --from=build /home/gradle/build/libs/*.jar application.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "application.jar"]