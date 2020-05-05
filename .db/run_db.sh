#!/usr/bin/env bash

set -eo pipefail

SQL_SYS_PASSWORD="dummypassword"

docker run \
  -d \
  -p 1521:1521 \
  -p 5500:5500 \
  -e ORACLE_PWD="${SQL_SYS_PASSWORD}" \
  -e ORACLE_CHARACTERSET=AL32UTF8 \
  oracle/database:18.4.0-xe
