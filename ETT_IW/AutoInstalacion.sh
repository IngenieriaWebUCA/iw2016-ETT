
#!/bin/bash

echo 'Configurando MySQL'
echo 'Por favor introduzca el nombre de usuario de MySQL:'
read USER
echo -n 'Por favor '"$USER"' introduzca la clave:'
read CLAVE
echo -n "Construyendo base de datos"

QUERY1="CREATE DATABASE IF NOT EXISTS ett;"
QUERY2="GRANT USAGE ON *.* TO ett@localhost IDENTIFIED BY '';"
QUERY3="GRANT ALL PRIVILEGES ON ett.* TO ett@localhost;"
QUERY4="FLUSH PRIVILEGES;"

QUERY="${QUERY1} ${QUERY2} ${QUERY3} ${QUERY4}"
mysql --user="$USER" --password="$CLAVE" -e "$QUERY"


mysql --user="$USER" --password="$CLAVE" ett < database.sql

cd src/main/resources/META-INF/spring/

sed -i "5,6d" database.properties
sed -i '$a database.username='"$USER" database.properties
sed -i '$a database.password='"$CLAVE" database.properties


cd ../../../../..

echo "Lanzando la aplicación"

echo "Abriendo la WEB"

/usr/bin/firefox -new-window http://localhost:8181/ETT_IW/  &

mvn -Dmaven.tomcat.port=8181 clean install tomcat7:run
