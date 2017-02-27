#!/bin/bash

echo "Create a fresh build"

sbt clean stage

echo
echo "================"
echo "==   JVM App  =="
echo "================"
/usr/bin/time -p ./jvm-app/target/universal/stage/bin/jvm-app

echo
echo "================"
echo "==  Node App  =="
echo "================"
/usr/bin/time -p node ./node-app/target/universal/stage/node-app-opt-bundle.js

echo
echo "================"
echo "== Native App =="
echo "================"
/usr/bin/time -p ./native-app/target/universal/stage/native-app

