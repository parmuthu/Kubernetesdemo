FROM eclipse-temurin:17
EXPOSE 8080
WORKDIR /app
COPY target/springboot-k8s-demo.jar /app/springboot-k8s-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-k8s-demo.jar"]

