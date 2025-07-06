# user-api-demo

Sistema de consulta de usuários com backend Java 21.

## 🛠️ Tecnologias

- **Backend**: Java 21 + Spring Boot
- **Banco**: Oracle XE 21c (Docker)

## 🚀 Como Executar

### 1. Banco de Dados

```bash
docker run -d \
  --name oracle-xe \
  -p 1521:1521 \
  -p 8080:8080 \
  gvenzl/oracle-xe:21-slim
```

### 2. Scripts do Banco

Execute os scripts em `user-api-demo/src/main/resources/db/`:
1. `DDL_USER.sql` - Cria tabela de usuários (inclui carga de 1000 registros)

### 3. Backend (Porta 8081)

```bash
mvn spring-boot:run
```

## 📝 URLs

- **Backend**: http://localhost:8081
- **Oracle**: http://localhost:8080
- **Swagger**: http://localhost:8081/swagger-ui/index.html

## 🔧 Configuração

### application.properties
```properties
server.port=8081
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=system
spring.datasource.password=oracle
```

## ✨ Funcionalidades

- Filtros por ID do usuário
- API REST documentada com Swagger