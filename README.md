# 🔐 Login App API

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0+-brightgreen?style=for-the-badge&logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue?style=for-the-badge&logo=apache-maven)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0+-green?style=for-the-badge&logo=thymeleaf)

**Sistema de autenticação simples com cadastro e login de usuários** 🛡️

[Demonstração](#-uso) • [Instalação](#-instalação) • [Endpoints](#-documentação-da-api) • [Testes](#-testes) • [Tecnologias](#-tecnologias-usadas)

</div>

---

## 📌 Sobre o Projeto

A **Login App API** é uma aplicação REST criada com Spring Boot, que fornece endpoints de autenticação (cadastro e login) de forma simples e segura. Ideal para portfólios de desenvolvedores que desejam demonstrar autenticação com Spring Security e boas práticas com banco de dados relacional.

---

## ✨ Funcionalidades

- 📝 Cadastro de novos usuários
- 🔐 Login com autenticação via token JWT (ou básica, dependendo do projeto)
- 💾 Armazenamento seguro de senhas com criptografia
- 📄 Estrutura modular com controllers, services e repositórios
- 📄 Integração com Swagger

---

## ⚙️ Instalação

### Pré-requisitos

- Java 17+
- Maven 3.8+
- MySQL (local ou via Docker)

### Configuração

```bash
git clone https://github.com/HenriqueMartinho/login-app-springboot.git
cd login-app-springboot
```

Crie o banco de dados PostgreSQL:

```sql
CREATE DATABASE login_app_db;
```

Configure o `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/logindemo_db
    username: seu_usuario
    password: sua_senha
```

Execute a aplicação:

```bash
mvn spring-boot:run
```

---

## 💻 Uso

### Requisição de cadastro

```http
POST /api/auth/register
```

```json
{
  "username": "henrique",
  "password": "123456"
}
```

### Requisição de login

```http
POST /api/auth/login
```

```json
{
  "username": "henrique",
  "password": "123456"
}
```

### Resposta esperada

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."
}
```

---

## 🔗 Documentação da API

Disponível em: `http://localhost:8080/swagger-ui/index.html`

| Método | Endpoint              | Descrição                  |
|--------|------------------------|----------------------------|
| POST   | `/api/auth/register`   | Cria novo usuário          |
| POST   | `/api/auth/login`      | Realiza login e retorna token |

---

## 🧪 Testes

```bash
mvn test
```

Testes básicos de autenticação e validação.

---

## 🧰 Tecnologias Usadas

- Java 17
- Spring Boot
- Spring Data
- Spring Security
- MySQL
- Thymeleaf
- Swagger/OpenAPI

---

## 📌 Melhorias Futuras

- Validação com e-mail e confirmação
- Refresh token
- Controle de sessões ativas
- Gerenciamento de papéis e permissões

---

## 👤 Autor

**Henrique Martinho**  
[GitHub](https://github.com/HenriqueMartinho) • [LinkedIn](https://linkedin.com/in/henriquemartinho)

---
