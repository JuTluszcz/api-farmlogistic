# Usar uma imagem do OpenJDK como base
FROM openjdk:17-jdk-slim

#Diretório de trabalho no container
WORKDIR /app

# Copia JAR gerado para dentro do container
COPY target/*.jar app.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Variável de ambiente do db
ENV DB_URL="postgresql://logisticdb_owner:voCNtruOK43P@@ep-crimson-snow-a5my0lyn-pooler.us-east-2.aws.neon.tech/logisticdb?sslmode=require"

# Comando para rodar a API
CMD ["java", "-jar", "app.jar"]

