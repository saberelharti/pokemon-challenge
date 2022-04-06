FROM gradle:jdk11 AS builder
WORKDIR /app
COPY . .
RUN gradle --no-daemon assemble  --stacktrace

FROM openjdk:11.0.11-jre-slim-buster
WORKDIR /app
COPY --from=builder /app/build/libs/pokemon-*-SNAPSHOT.jar /app/app.jar
EXPOSE 5656

CMD ["java", "-jar","/app/app.jar"]
