Helidon3x
==============
```

export JAVA_HOME=/scratch/wlsqa/jdk-17.0.6
cd helidon-idcs/helidon-idcs-3x

mvn clean package

[INFO] ------------< io.helidon.example.idcs:helidon-idcs-example >------------
[INFO] Building Helidon IDCS forwarding token example 1.0-SNAPSHOT        [2/2]
[INFO]   from pom.xml
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ helidon-idcs-example ---
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Helidon IDCS forwarding token example 1.0-SNAPSHOT:
[INFO]
[INFO] Helidon IDCS service ............................... SUCCESS [  4.987 s]
[INFO] Helidon IDCS forwarding token example .............. SUCCESS [  0.052 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.699 s
[INFO] Finished at: 2023-06-23T12:31:00Z
[INFO] ------------------------------------------------------------------------


$JAVA_HOME/bin/java -jar /scratch/wlsqa/reproducer/helidon-idcs/helidon-idcs-3x/helidon-service/target/helidon-idcs-service.jar

Test the app
============
Access through browser http://localhost:8080/helidon
Result :
message	"helidon 3.2.1 service"

Access through browser http://localhost:8080/helidon/auth/wls
Result:
Token is printed

token	"eyJ4NXQjUzI1NiI6InpTaV9mM0NwMWpXbXItYnFjUmFjS2t0Q3p2aXc3ZllVWUZDYkExMU42elEiLCJ4NXQiOiJ3VnhIbGpfcFMwZjhGcEZWNUsyWE5hTnF6ZzgiLCJraWQiOiJTSUdOSU5HX0tFWSIsImFsZyI6IlJTMjU2In0.eyJjbGllbnRfb2NpZCI6Im9jaWQxLmRvbWFpbmFwcC5vYzEuaWFkLmFtYWFhYWFhYXF0cDViYWFzaTZwbHl4ZXIzbGR5amlsNWRhcGd4b2o2a3B1cGFuYWlueWZleHhtcTNvYSIsInVzZXJfdHoiOiJBbWVyaWNhXC9DaGljYWdvIiwic3ViIjoic2FuamF5Lm1hbnRvb3JAb3JhY2xlLmNvbSIsInVzZXJfbG9jYWxlIjoiZW4iLCJzaWRsZSI6NDgwLCJpZHBfbmFtZSI6IlVzZXJOYW1lUGFzc3dvcmQiLCJ1c2VyLnRlbmFudC5uYW1lIjoiaWRjcy01NzMwMzhjYzZkZWU0NGFkOGM0Yzk3NTg5NWE4ZjAyZSIsImlkcF9ndWlkIjoiVXNlck5hbWVQYXNzd29yZCIsImFtciI6WyJVU0VSTkFNRV9QQVNTV09SRCJdLCJpc3MiOiJodHRwczpcL1wvaWRlbnRpdHkub3JhY2xlY2xvdWQuY29tXC8iLCJkb21haW5faG9tZSI6InVzLWFzaGJ1cm4tMSIsImNhX29jaWQiOiJvY2lkMS50ZW5hbmN5Lm9jMS4uYWFhYWFhYWF1bzU0aWN2N2lpNnBwMzJlbHVnaXFuMmZvbGNlYmlvcGVjbXp2NTNveTV4a3MzbHV6MmlxIiwidXNlcl90ZW5hbnRuYW1lIjoiaWRjcy01NzMwMzhjYzZkZWU0NGFkOGM0Yzk3NTg5NWE4ZjAyZSIsImNsaWVudF9pZCI6ImU2MzlhMDliZmRlODQ5ZGVhY2RlMzVkYzMwNTEyNzU0Iiwic2lkIjoiNjNiYWY4ZGUzNWU5NGVhZjgwZTNiNzM2MGVhNTMzOGE6NDY2ODk3IiwiZG9tYWluX2lkIjoib2NpZDEuZG9tYWluLm9jMS4uYWFhYWFhYWF1aXlhZ2N3cHB5ZmhvY3A2dXFlYXFsbGtxaWRpMzJkd3dvaHV1ZjZhbTdrNDdwMzZrbzdhIiwic3ViX3R5cGUiOiJ1c2VyIiwic2NvcGUiOiJvcGVuaWQiLCJ1c2VyX29jaWQiOiJvY2lkMS51c2VyLm9jMS4uYWFhYWFhYWFzbGNqaHU0Z280NmIzeTI1cXgyNTU2bnR4eTRvbXJjem83b2VkeXY0eXA1Z2prdmJkZXFxIiwiY2xpZW50X3RlbmFudG5hbWUiOiJpZGNzLTU3MzAzOGNjNmRlZTQ0YWQ4YzRjOTc1ODk1YThmMDJlIiwicmVnaW9uX25hbWUiOiJ1cy1hc2hidXJuLTEiLCJ1c2VyX2xhbmciOiJlbiIsImV4cCI6MTY4NzUyNzIyMywiaWF0IjoxNjg3NTIzNjIzLCJjbGllbnRfZ3VpZCI6IjNlOTkzMmZiZDI0MDRjNWViZjNiYzYxOWUxZjk0MGNlIiwiY2xpZW50X25hbWUiOiJndXJ1LWhlbGlkb24tc3NvLXRlc3RpbmciLCJpZHBfdHlwZSI6IkxPQ0FMIiwidGVuYW50IjoiaWRjcy01NzMwMzhjYzZkZWU0NGFkOGM0Yzk3NTg5NWE4ZjAyZSIsImp0aSI6IjQ0ZjQ5MzlkMDRkNTQ5MDdhZmUxNzhjNTIwNDZkNmY5IiwiZ3RwIjoiYXpjIiwidXNlcl9kaXNwbGF5bmFtZSI6IlNhbmpheSBNYW50b29yIiwib3BjIjpmYWxzZSwic3ViX21hcHBpbmdhdHRyIjoidXNlck5hbWUiLCJwcmltVGVuYW50Ijp0cnVlLCJ0b2tfdHlwZSI6IkFUIiwiY2FfZ3VpZCI6ImNhY2N0LTJlYWVkMDgwMTg3YjQ4NTNiZmZhY2I4YzhlM2U2MmIwIiwiYXVkIjoiaHR0cHM6XC9cL2lkY3MtNTczMDM4Y2M2ZGVlNDRhZDhjNGM5NzU4OTVhOGYwMmUuaWRlbnRpdHkucGludC5vYzlxYWRldi5jb206NDQzIiwiY2FfbmFtZSI6Indsc3RlbmFudDA5OSIsInVzZXJfaWQiOiJhNmY4Y2EyNmVhYjU0NmRkYTMzZjJjMGY4MTljZWY3ZCIsImRvbWFpbiI6ImlkZW50aXR5IiwidGVuYW50X2lzcyI6Imh0dHBzOlwvXC9pZGNzLTU3MzAzOGNjNmRlZTQ0YWQ4YzRjOTc1ODk1YThmMDJlLmlkZW50aXR5LnBpbnQub2M5cWFkZXYuY29tOjQ0MyJ9.cHV28-yW1jFDKsLDN8h5-0frkgsi9LgxPqxnkHafThEa-JIjDud1suz0TJB8SNpxtxWfwE-hYdSjTPZMXc0jr6HuBv9F6Nv4jvHbvn6X-sS-eV06DdluSyRiXNIP60Xz1sC2BxoUycnQpK1-b8AcmLMb1GMP6p6t-l80W6zv1-dt4J7BqrKXoyaDmYW8sHuoF4crdBIOm2ULRQNGEMtsoisIVM1ujogwh0wKBSs4EZ5r2Od0fs_95ErlnNFF48VA9AsPDtJe20m15ZEn0ya2UWamZFQqCuIDZlmElb_vCYYGhUFoIPbelM8NR6Tw9IQR4VrEsUROCZ4TivNRav4MBQ"


