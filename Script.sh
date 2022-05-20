#!/bin/sh

/etc/init.d/mysql start
java -jar /app/ToDoList-0.0.1-SNAPSHOT.jar
