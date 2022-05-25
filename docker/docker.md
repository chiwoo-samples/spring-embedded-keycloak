# docker 

## run postgresql
```
docker run -d --name postgres  \
  --publish "0.0.0.0:5432:5432" \
  -e POSTGRES_PASSWORD=admin123$ \
  -e JDBC_PARAMS="useSSL=false" \
  postgres:14.3
```

## check listen port
```
nc -vz localhost 5432
```

¨

## create database keycloak
```
# 1. connect to container 
docker exec -it postgres /bin/bash

# 2. create user and database
psql -U postgres

postgres=# 

CREATE USER eugene WITH ENCRYPTED PASSWORD 'choi123$';
CREATE DATABASE keycloak OWNER eugene;
GRANT ALL PRIVILEGES ON DATABASE keycloak TO eugene;
ALTER ROLE eugene LOGIN;

\q

psql --username eugene --dbname keycloak
keycloak=> \q
```
