#!/bin/sh
/etc/init.d/mysql start
/usr/bin/java -jar -Dserver.port=$PORT RegistroVisitantes-0.0.1-SNAPSHOT.jar
