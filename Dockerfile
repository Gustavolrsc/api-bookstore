FROM eclipse-temurin:17-jdk-alpine

# Copia o projeto inteiro pro container
COPY . /app

# Vai pra pasta do projeto
WORKDIR /app

# Dá permissão de execução ao mvnw (evita erro 126)
RUN chmod +x mvnw

# Instala o Maven e compila o projeto (sem rodar testes)
RUN ./mvnw clean package -DskipTests

# Copia o JAR gerado para a raiz da imagem como app.jar
COPY target/*.jar app.jar

# Define o comando de entrada da aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
