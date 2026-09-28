# 👋 Hello World API

My first Spring Boot REST API: day one of my Java backend journey. It is a small service with three `GET` endpoints, built with **Spring Boot 4** and **Java 21**.

![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0-6DB33F?logo=springboot&logoColor=white)

## 🔌 Endpoints

| Method | Endpoint | Response |
|---|---|---|
| `GET` | `/hello` | `Hello World! My first Spring Boot API is live!` |
| `GET` | `/info` | Developer and stack info |
| `GET` | `/Welcome` | A welcome message |

## 🚀 Run it

**Prerequisite:** Java 21

```bash
git clone https://github.com/AnjanRimal/hello-world-api.git
cd hello-world-api
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

```bash
curl localhost:8080/hello
curl localhost:8080/info
```

## 📈 Where this led

This project was the starting point. The same ideas grew into:

- **[student-crud-api](https://github.com/AnjanRimal/student-crud-api)**: full CRUD with JPA and H2
- **[library-api](https://github.com/AnjanRimal/library-api)**: relational data model, DTOs, MySQL and a borrow/return workflow

## 👤 Author
**Anjan Rimal** · [Portfolio](https://anjanrimal.com/) · [LinkedIn](https://www.linkedin.com/in/anjanrimal) · [GitHub](https://github.com/AnjanRimal)
