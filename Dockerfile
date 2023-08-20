FROM openjdk:8
EXPOSE 9090
ADD target/jenkins-automation.jar jenkins-automation.jar
ENTRYPOINT ["java", "-jar","/jenkins-automation.jar"]