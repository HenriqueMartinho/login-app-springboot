# 🔐 Login App API

<div align="center">

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0+-brightgreen?style=for-the-badge&logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue?style=for-the-badge&logo=apache-maven)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0+-green?style=for-the-badge&logo=thymeleaf)

**Sistema de autenticação simples com cadastro e login de usuários** 🛡️

[Demonstração](#-uso) • [Instalação](#-instalação) • [Endpoints](#-documentação-da-api) • [Testes](#-testes) • [Tecnologias](#-tecnologias-usadas)

</div>

---

## 📌 Sobre o Projeto

**Login App** é uma aplicação criada com Spring Boot, focado em demonstrar conceitos essenciais de forma simples e segura. 

---

## ✨ Funcionalidades

- 📝 Cadastro de novos usuários
- 🔐 Login com autenticação via token JWT
- 💾 Armazenamento seguro de senhas com criptografia
- 🔩 Arquitetura MVC (Model-View-Controller)
- 💾 Dados persistidos em banco MySQL
- 📫 Estrutura modular de controllers REST
- 🚀 Cache aplicado na página Home para maior performance

---

## ⚙️ Instalação

### Pré-requisitos

- Java 21+
- Maven 3.8+
- MySQL (local ou via Docker)

### Configuração

```bash
git clone https://github.com/HenriqueMartinho/login-app-springboot.git
cd login-app-springboot
```

Crie o banco de dados PostgreSQL:

```sql
CREATE DATABASE loginapp_db;
```

Configure o `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/loginapp_db
    username: seu_usuario
    password: sua_senha
```

Execute a aplicação:

```bash
mvn spring-boot:run
```

## 🧰 Tecnologias Usadas

- Java 21
- Spring Boot
- Spring Data
- Spring Security
- Spring Web
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
