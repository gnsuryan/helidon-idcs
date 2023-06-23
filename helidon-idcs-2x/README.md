# Helidon IDCS example

```
Helidon2x
==============
export JAVA_HOME=/scratch/wlsqa/jdk-11.0.17
cd helidon-idcs/helidon-idcs-2x
mvn clean package
[INFO] Reactor Summary for Helidon IDCS forwarding token example 1.0-SNAPSHOT:
[INFO]
[INFO] Helidon IDCS service ............................... SUCCESS [  3.246 s]
[INFO] Helidon IDCS forwarding token example .............. SUCCESS [  0.026 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.644 s
[INFO] Finished at: 2023-06-23T12:15:55Z
[INFO] ------------------------------------------------------------------------

$JAVA_HOME/bin/java -jar /scratch/wlsqa/reproducer/helidon-idcs/helidon-idcs-2x/helidon-service/target/helidon-idcs-service.jar

Test the app
============
Access through browser http://localhost:8080/helidon
Result :
message	"helidon 2.6.0 service"

Access through browser http://localhost:8080/helidon/auth/wls
Result: 
2023.06.23 12:28:23 FINEST io.helidon.security.integration.jersey.SecurityFilter Thread[helidon-server-5,5,server]: Filter completed (after authorization)
BearerToken: null

```
