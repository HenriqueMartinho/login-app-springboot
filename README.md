# 🔐 Sistema de Login com Spring Boot

Este é um projeto simples de sistema de autenticação desenvolvido com **Spring Boot**, focado em demonstrar conceitos essenciais como:

- ✅ Cadastro e Login de usuários
- ✅ Integração com **MySQL** para persistência de dados
- ✅ Uso de **Cache** para otimização de desempenho
- ✅ Estrutura básica com **REST Controller**
- ✅ Navegação entre páginas com **HTML/CSS** utilizando **Thymeleaf**

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Thymeleaf (HTML/CSS)**
- **Spring Cache**

---

## ⚙️ Funcionalidades

- 👤 Cadastro de novo usuário
- 🔐 Login com redirecionamento
- 🔩 Arquitetura MVC (Model-View-Controller)
- 💾 Dados persistidos em MySQL
- 📫 Estrutura básica de controllers REST
- 🚀 Cache aplicado na página Home para maior performance

---

## 🧪 Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/HenriqueMartinho/login-app-springboot.git
```
2. Configure o application.yml com suas credenciais MySQL:
````bash
  datasource:
    url: jdbc:mysql://localhost:3306/seu_banco
    username: seuuser
    password: suasenha
````
3. Rode a aplicação:
````bash
./mvnw spring-boot:run
````
4. Acesse no navegador:
````bash
http://localhost:8080/login
````
---

## 💡 Próximos Passos
- Implementar autenticação com Spring Security
- Adicionar validações de formulário
- Criar página de perfil para usuários

## 🤝 Contribuição
Sinta-se à vontade para contribuir com melhorias ou sugerir novas funcionalidades! ✨

## 📌 Contato
Feito por Henrique Martinho\
🔗 [LinkedIn](https://www.linkedin.com/in/henrique-martinho/) | 📧 henrique.martinho@outlook.com


