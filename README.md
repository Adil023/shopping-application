Shopping Application - Microservices Project

This project is a backend system for an e-commerce platform, built on a microservices architecture. Each service is responsible for a specific business domain and is fully containerized using Docker for consistent development and deployment environments.
Tech Stack
Backend

    Java 17

    Spring Boot 3

    Spring Cloud

    Spring Security

Databases

    PostgreSQL: Relational database for Order and Inventory Services.

    MongoDB: NoSQL database for the Product Service.

    MySQL: Used by Keycloak for identity and access management data.

DevOps & Containerization

    Docker & Docker Compose: For containerizing and orchestrating all services.

    Maven: For project build and dependency management.

    Jib: To build optimized Docker images directly from Maven without a Dockerfile.

Microservice Architecture Components

    Service Discovery (Netflix Eureka): Allows services to find and communicate with each other dynamically.

    API Gateway (Spring Cloud Gateway): A single entry point for all client requests, handling routing and security.

    Messaging (Apache Kafka & Zookeeper): For reliable, asynchronous communication between services.

Security

    Keycloak: Centralized identity and access management using OAuth 2.0 / JWT.

Monitoring & Tracing

    Prometheus: For collecting metrics and monitoring service health.

    Grafana: For visualizing metrics collected by Prometheus.

    Zipkin: For distributed tracing to monitor requests across multiple services.

How to Run

    Clone the repository:

    git clone <your-repository-link>
    cd shopping-application

    Build the project with Maven:
    This command will compile the code and create .jar files for all microservices.

    mvn clean package -DskipTests

    Run the entire system with Docker Compose:
    This command will build Docker images for all services and start them as containers.

    docker compose up --build

<img width="1699" height="1106" alt="Screenshot 2025-08-20 201259" src="https://github.com/user-attachments/assets/43ab78ef-df8b-4b75-987e-beb10455d001" />
