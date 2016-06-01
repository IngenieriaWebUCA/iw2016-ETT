#!/bin/bash

rm -rf iw2016-ETT/

git clone https://github.com/IngenieriaWebUCA/iw2016-ETT.git

cd iw2016-ETT

git checkout repairconflict

echo 'Configurando MySQL'
echo 'Por favor introduzca el nombre de usuario de MySQL:'
read USER
echo -n 'Por favor '"$USER"' introduzca la clave:'
read CLAVE

QUERY1="CREATE DATABASE IF NOT EXISTS ett;"
QUERY2="GRANT USAGE ON *.* TO ett@localhost IDENTIFIED BY '';"
QUERY3="GRANT ALL PRIVILEGES ON ett.* TO ett@localhost;"
QUERY4="FLUSH PRIVILEGES;"

QUERY="${QUERY1} ${QUERY2} ${QUERY3} ${QUERY4}"

mysql --user="$USER" --password="$CLAVE" -e "$QUERY"
mysql --user="$USER" --password="$CLAVE" ett < database.sql

cd src/main/resources/META-INF/spring/
sed -i 's/database.password=/database.password='"$CLAVE"'/' database.properties
sed -i 's/database.username=/database.username='"$USER"'/' database.properties

cd ../../../../..

mvn tomcat:run