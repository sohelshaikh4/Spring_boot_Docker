FROM openjdk:17
COPY target/sb_docker.jar /usr/app/


WORKDIR usr/app
ENTRYPOINT [ "java","-jar","sb_docker.jar"]
