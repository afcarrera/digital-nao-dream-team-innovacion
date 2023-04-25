# digital-nao-dream-team-innovacion
 El dream team de la innovación
***

## Información
***
Google Search Author API.
## Tecnologías
***
* [Java](https://www.java.com/es/download/ie_manual.jsp): Version 11
* [Spring Boot](https://spring.io/projects/spring-boot): Version 2.7.10
* [Git](https://mirrors.edge.kernel.org/pub/software/scm/git/): Version 2.39.1.windows.1
* [MySQL](https://dev.mysql.com/downloads/mysql/): Version 5.5.5-10.1.38-MariaDB

## Instalación
***
Comandos recomendados para instalación en plataformas Windows.
Ejemplo de DB_URL: //localhost:3306/google_scholar
```
> git clone https://github.com/afcarrera/digital-nao-dream-team-innovacion
> cd digital-nao-dream-team-innovacion
> cd database
> mysql -u replace_with_your_db_user -p <CREATE_DATABASE.sql
> mysql -u replace_with_your_db_user -p <CREATE_TABLE.sql
> cd..
> cd google-scholar-api
> set DB_USER = your_db_user
> set DB_PASSWORD = your_db_user_password
> set DB_URL = your_db_url
> mvnw spring-boot:run 
```
## Uso
***
El detalle de los endpoint es el siguiente.

### PORT
[9000](#)

### CONTEXT
[/google-scholar](#)

### GET BY ID
[/api/v1/authors?author_id={author_id}&api_key={api_key}&engine=google_scholar_author](#)
