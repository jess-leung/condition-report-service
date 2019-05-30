FROM gradle:4.5-jdk8-alpine as builder
USER root
WORKDIR /builder
COPY . /builder
RUN ls
RUN ./gradlew build

FROM openjdk:8-jdk-alpine
WORKDIR /api
EXPOSE 8080
COPY --from=builder /builder/build/libs/*.jar .
RUN ls
RUN mv ./*.jar ./app.jar
CMD ["java", "-jar", "app.jar"]