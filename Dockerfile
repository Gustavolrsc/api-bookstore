FROM eclipse-temurin:17-jdk-alpine

COPY . /app
WORKDIR /app

# Dá permissão de execução pro mvnw
RUN chmod +x mvnw

# Instala dependências e gera o JAR
RUN ./mvnw clean package -DskipTests

# Agora o JAR deve existir em /app/target/
COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
