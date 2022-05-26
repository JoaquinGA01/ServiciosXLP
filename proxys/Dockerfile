from rrojano/jdk8
workdir /app
expose 8080
cmd ["/app/script.sh"]
run apt-get update
RUN apt-get install -y mariadb-server
add script.sql /app/script.sql
RUN chmod 755 /app/script.sql
add script.sh /app/script.sh
run chmod 755 /app/script.sh
RUN /etc/init.d/mysql start; mysql < /app/script.sql



