
from rrojano/jdk8
workdir /app

cmd ["/app/script.sh"]
add RegistroVisitantes-0.0.1-SNAPSHOT.jar /app/RegistroVisitantes-0.0.1-SNAPSHOT.jar
run apt-get update
RUN apt-get install -y mariadb-server
add Script.sql /app/script.sql
RUN chmod 755 /app/script.sql
add Script.sh /app/script.sh
run chmod 755 /app/script.sh
RUN /etc/init.d/mysql start; mysql < /app/script.sql