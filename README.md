# API System | Cashboost

API CashBoost is a Java-based system developed to create REST APIs using Spring Boot for the CashBoost mobile application. It serves as the backend infrastructure for storing data and information related to the application's functionality.

## About:
API CashBoost functions as the backend system responsible for managing and storing data generated by the CashBoost mobile application. Developed in collaboration with Soamer Ponteiras Automotivas for academic purposes, this API system ensures efficient data storage and retrieval to support the application's functionality.

## Key Features:

- REST APIs: Provides a set of RESTful endpoints for interacting with the CashBoost application.
- Data Storage: Stores and manages data related to automotive products, orders, customers, and sales transactions.
- Security: Implements security measures to protect data integrity and user privacy.
- Scalability: Designed to be scalable to accommodate potential growth in data volume and user base.
  
## Technologies Used:

- Java: The programming language used for backend development.
- Spring Boot: The framework utilized for creating RESTful APIs and simplifying application configuration.
- Hibernate: Object-relational mapping (ORM) framework for data persistence.
- MySQL: The relational database management system used for storing application data.
  
## How to Use:
1. Clone the Repository:

```bash
git clone https://github.com/victormuller55/api-cashboost.git
```

2. Set Up the Environment: Ensure that you have Java, Spring Boot, and MySQL installed on your system.
3. Configure the Application: Update the database configuration and other application properties as needed in the application.properties file.

```properties
spring.application.name=your-name-aplication
server.adress=your-ip-aplication
server.port=your-port-aplication
spring.datasource.url=your-database-url-aplication
spring.datasource.username=your-username-aplication
spring.datasource.password=your-password-aplication
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.servlet.multipart.max-file-size=5MB
spring.servlet.multipart.max-request-size=5MB
spring.http.multipart.max-file-size=5MB
spring.http.multipart.max-request-size=5MB
```

5. Build and Run the Application: Use Maven or your preferred build tool to build the application, then run it using the provided Maven or Spring Boot commands.
   
## Contact:
For inquiries or further information about the API CashBoost system, you can reach out via email at victormuller050@gmail.com.
