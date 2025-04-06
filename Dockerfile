FROM eclipse-temurin:17-jdk-alpine

# Copia o projeto inteiro pro container
COPY . /app

# Vai pra pasta do projeto
WORKDIR /app

# Instala o Maven e compila o projeto
RUN ./mvnw clean package -DskipTests

# Copia o JAR gerado
COPY target/*.jar app.jar

# Roda o app
ENTRYPOINT ["java", "-jar", "app.jar"]
