# Os Melhores Superpoderes do Mundo

Este projeto é uma aplicação Spring Boot que exibe os piores superpoderes já criados, ordenados pelo grau de inutilidade. Os dados são armazenados em um banco PostgreSQL rodando via Docker Compose e exibidos dinamicamente em uma página web usando Thymeleaf.

## Funcionalidades

- Listagem dos superpoderes mais inúteis já criados
- Dados carregados do banco de dados PostgreSQL
- Interface web dinâmica com Thymeleaf
- Migração automática do banco via Flyway

## Estrutura do Projeto

```
src/
 ├── main/
 │   ├── java/br/com/fiap/epictaskg/
 │   │    ├── EpictaskGApplication.java
 │   │    └── superpoder/
 │   │         ├── Superpoder.java
 │   │         ├── SuperpoderRepository.java
 │   │         ├── SuperpoderService.java
 │   │         └── SuperpoderController.java
 │   └── resources/
 │        ├── application.properties
 │        ├── templates/index.html
 │        └── db/migration/V1__create_table_task.sql
 └── docker-compose.yaml
```

## Como rodar o projeto

### 1. Suba o banco de dados PostgreSQL com Docker Compose

No diretório do projeto, execute:

```sh
docker compose up -d
```

Certifique-se que o serviço do banco está rodando e acessível.

### 2. Configure o acesso ao banco

No arquivo `src/main/resources/application.properties`, confira se está assim:

```
spring.datasource.url=jdbc:postgresql://db:5432/superpower
spring.datasource.username=superpower
spring.datasource.password=superpower
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false
```

### 3. Rode a aplicação Spring Boot

No terminal, execute:

```sh
./mvnw spring-boot:run
```
Ou, se preferir:

```sh
mvn spring-boot:run
```

### 4. Acesse a página web

Abra o navegador e acesse:

```
http://localhost:8080
```

Você verá a lista dos superpoderes mais inúteis, ordenados pelo grau de inutilidade.

## Observações

- As migrações do banco são feitas automaticamente via Flyway.
- Os dados iniciais dos superpoderes estão no arquivo `V1__create_table_task.sql`.
- Se precisar alterar o nome do serviço do banco no Docker Compose, ajuste também a URL no `application.properties`.

---
Feito por [Seu Nome]
