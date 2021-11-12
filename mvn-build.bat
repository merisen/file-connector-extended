@ECHO OFF
color a0
echo "Build File Connector project"
@ECHO ON
mvn clean install –DskipTests
PAUSE