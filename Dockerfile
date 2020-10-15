FROM scratch
COPY target/Web.API-0.0.1-SNAPSHOT.jar target
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Web.API-0.0.1-SNAPSHOT.jar"]