#!/usr/bin/env bash

set -eo pipefail

mvn install:install-file -DgroupId=com.oracle.jdbc -DartifactId=ojdbc8 \
     -Dversion=10.2.0.3.0 -Dpackaging=jar -Dfile=ojdbc8.jar -DgeneratePom=true
