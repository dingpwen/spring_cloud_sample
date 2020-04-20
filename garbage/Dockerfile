FROM java:8-jre
MAINTAINER Wenpd <dingpwen@gmail.com>

ADD ./target/garbage.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/garbage.jar"]

EXPOSE 8089