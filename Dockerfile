FROM maven:3.9.5-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn package -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

# Mở port 80 theo yêu cầu server trường
EXPOSE 80

# Chạy app trên port 80
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=80"]