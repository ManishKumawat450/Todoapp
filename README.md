##  ToDoApp
A simple To-Do web application built with **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, and **MySQL**.

##  Features
- Add, update, and delete to-do tasks
- View tasks on the homepage
- Persistent data using MySQL
- MVC architecture with service and repository layers

## Tech Stack
- Java 17
- Spring Boot 3.1
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

## ⚙️ How to Run
### 1. Clone the repo
```bash
git clone https://github.com/ManishKumawat450/Todoapp.git
cd Todoapp/demo
```

### 2. Configure the database
Make sure MySQL is running, then create a database:
```sql
CREATE DATABASE todo_db;
```
Update `src/main/resources/application.properties` if needed:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=YourPasswordHere
```

### 3. Run the app
```bash
./mvnw spring-boot:run
```
App will be available at [http://localhost:8080](http://localhost:8080)


##  Author
**Manish Kumawat**  
[GitHub](https://github.com/ManishKumawat450)

