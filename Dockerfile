FROM openjdk:8-jre-slim

# Add the jar with all the dependencies
ADD  target/framework-2.0-SNAPSHOT.jar /usr/share/tag/framework-2.0-SNAPSHOT.jar

# Add the suite xmls
ADD testng.xml /usr/share/tag/testng.xml

# Command line to execute the test
# Expects below ennvironment variables
# BROWSER = chrome / firefox
# MODULE  = testng
# SELENIUM_HUB = selenium hub hostname / ipaddress

ENTRYPOINT /usr/bin/java -cp /usr/share/tag/framework-2.0-SNAPSHOT.jar -DseleniumHubHost=$SELENIUM_HUB -Dbrowser=$BROWSER org.testng.TestNG /usr/share/tag/$MODULE