FROM openjdk:8-jdk-alpine

WORKDIR /usr/api

COPY target/hospital-management-0.0.1-SNAPSHOT.jar /usr/api/backEnd.jar

RUN chmod +x /usr/api/*.jar

EXPOSE  8085

#CMD /bin/bash
CMD ["java", "-jar", "/usr/api/backEnd.jar"]