FROM amazoncorretto:21-alpine
COPY target/encryptor-utility-cli.jar /encryptor-utility-cli.jar
ENTRYPOINT ["java", \
            "-jar", \
            "/encryptor-utility-cli.jar"]