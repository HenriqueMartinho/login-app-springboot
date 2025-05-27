# 🔐 Sistema de Login com Spring Boot

Este é um projeto simples de sistema de autenticação desenvolvido com **Spring Boot**, focado em demonstrar conceitos essenciais como:

- ✅ Cadastro e Login de usuários
- ✅ Integração com **MySQL** para persistência de dados
- ✅ Uso de **Cache** para otimização de desempenho
- ✅ Estrutura básica com **REST Controller**
- ✅ Navegação entre páginas com **HTML/CSS** utilizando **Thymeleaf**

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
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
- 🏠 Página Home genérica após login
- 💾 Dados persistidos em banco MySQL
- 🚀 Cache aplicado na página Home para maior performance

---

## 🧪 Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seuusuario/login-springboot.git
```
2. Configure o application.properties com suas credenciais MySQL:
````bash
spring.datasource.url=jdbc:mysql://localhost:3306/seubanco
spring.datasource.username=root
spring.datasource.password=suasenha
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
Feito com 💙 por Henrique Martinho
🔗 [LinkedIn](https://www.linkedin.com/in/henrique-martinho/) | 📧 henrique.martinho@outlook.com


