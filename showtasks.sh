#!/bin/bash

success() {
    echo "Successfully loaded"
}

fail() {
    echo "There were errors"
}

open_browser() {
  open -a Safari http://localhost:8080/crud/v1/task/getTasks
}

if ./gradlew build; then
    sh ./runcrud.sh
    success
    open_browser

else
    fail

fi