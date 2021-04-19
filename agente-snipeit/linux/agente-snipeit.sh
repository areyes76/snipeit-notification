#!/bin/bash

VAR_SOFTWARES=$(apt-mark showmanual )
VAR_ADDRESS=$(cat /sys/class/net/*/address )

USER="$(whoami)"
MACHINE="$(hostname)"
ADDRESS="\"$(hostname)\""
LICENCES="\"$(hostname)\""

# RECORRE LAS mac-address DEL PC.
for item in $VAR_ADDRESS; do
  ADDRESS=$ADDRESS,"\"${item}\""
done

# RECORRE LA LISTA DE SOFTWARES
for item in $VAR_SOFTWARES; do
  LICENCES=$LICENCES,"\"${item}\""
done
echo "$LICENCES" 
DATA='{"machine":"@MACHINE_","idMachine":0,"os":"linux","idUser":0,"user": "@USER_","macaddress": [@ADDRESS_],"licenses":[@LICENCES_]}'
echo "$DATA" >> data.json
sed -i 's/@ADDRESS_/ '${ADDRESS}'/g' data.json
sed -i 's/@LICENCES_/ '${LICENCES}'/g' data.json
sed -i 's/@USER_/ '${USER}'/g' data.json
sed -i 's/@MACHINE_/ '${MACHINE}'/g' data.json

DATA="$(cat data.json)"

VAR="$(curl -k --request POST \
--url https://reporte-equipo.argacme.com/api/checkout \
--header 'Content-Type: application/json' \
--header 'x-access: ' \
--header 'Cookie: __cfduid=' \
-d @data.json)"
#--data "$DATA" )"
rm -f data.json
