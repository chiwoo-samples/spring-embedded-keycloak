# spring-embedded-keycloak

## Git
```
git clone https://github.com/chiwoo-samples/spring-embedded-keycloak.git

cd spring-embedded-keycloak

git config --local user.name <YOUR_NAME>
git config --local user.email <YOUR_EMAIL>
git config --list
```

## Build
```
mvn clean package -DskipTests=true --update-snapshots
```

## Run
```
mvn -DskipTests=true spring-boot:run
```

## Run with jar
```
export JASYPT_ENCRYPTOR_PASSWORD=symplesims; java -jar target/spring-embedded-keycloak.jar
```

## Appendix

### init database
- [postgresql](./docker/docker.md)

### keycloak jdbc
JDBC 연결 정보는 application.yml 과 keycloak-server.json 파일 두 곳을 설정 해야 합니다.  
- [application.yml](./src/main/resources/application.yml)  
- [keycloak-server.json](./src/main/resources/META-INF/keycloak-server.json)  

### keycloak portal 
- [oauth-authorization-server](http://localhost:8083/auth)  
default login: admin / admin123$

### References
- [Keycloak Embedded in a Spring Boot Application](https://www.baeldung.com/keycloak-embedded-in-spring-boot-app)
- [Embedded spring-boot keycloak-server](https://github.com/thomasdarimont/embedded-spring-boot-keycloak-server)
- [A Quick Guide to Using Keycloak with Spring Boot](https://www.baeldung.com/spring-boot-keycloak)
- [Spring Boot Configuration with Jasypt](https://www.baeldung.com/spring-boot-jasypt)
- [Jasypt Github](https://github.com/ulisesbocchio/jasypt-spring-boot)
- [Keycloak to secure spring-boot microservices](https://hackmd.diverse-team.fr/s/HJ1zF5bM_)
- [Simple Single Sign-On with Spring Security OAuth2](https://www.baeldung.com/sso-spring-security-oauth2)
