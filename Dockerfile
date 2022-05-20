from uno
workdir /app
expose 8080
cmd ["/app/script.sh"]
add ejercicio-ss/ToDoList-0.0.1-SNAPSHOT.jar /app
run apt-get update
RUN apt-get install -y mariadb-server
add script.sql /app/script.sql
RUN chmod 755 /app/script.sql
add script.sh /app/script.sh
run chmod 755 /app/script.sh
RUN /etc/init.d/mysql start; mysql < /app/script.sql
