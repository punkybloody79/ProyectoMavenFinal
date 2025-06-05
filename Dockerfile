FROM eclipse-temurin:22-jdk

WORKDIR /app

COPY target/ProyectoMavenFinal-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]