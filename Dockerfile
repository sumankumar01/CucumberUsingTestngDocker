FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

# Workspace
WORKDIR /usr/share/suman

ADD /target/container-test-tests.jar container-test.jar
ADD  /target/libs libs

# in case of any other dependency like .csv / .json / .xls
# please ADD that as well

# ADD suite files
# ADD testng.xml				not using
# ADD testng1.xml					not using

# ADD health check script
ADD healthcheck.sh  healthcheck.sh

# BROWSER
# HUB_HOST
# MODULE

ENTRYPOINT sh healthcheck.sh