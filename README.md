# moviehub-cloud-native-architecture
MovieHub - Cloud Native Microservices Architecture on AWS 🚀🎥
MovieHub is a scalable, cloud-native application designed to manage Movies and Users with microservices architecture. It features REST APIs to retrieve movies, filter by genre, and manage user data. The project demonstrates AWS best practices, including ALB, Auto-Scaling, CI/CD pipelines, CloudFront CDN, ECS Fargate deployments, IAM Roles/Policies, RDS PostgreSQL database, S3 object storage, Docker containerization, and efficient service communication.

Key Highlights:
1. Microservices for Movie Service and User Service (Spring Boot)
2. PostgreSQL on AWS RDS for persistent storage
3. REST APIs for fetching movies, filter by genre, and user operations
4. AWS ALB + Auto-Scaling for high availability and resilience
5. ECS Fargate Deployment with Dockerized Services
6. CI/CD Pipeline using GitHub Actions + AWS CodeDeploy
7. CloudFront CDN integration for optimized delivery
8. S3 Bucket for storing static assets (e.g., posters, trailers)
9. IAM Roles & Policies for fine-grained access control
10. Fully managed Infrastructure-as-Code setup

Tech Stack:
1. Java 17, Spring Boot 3.x
2. PostgreSQL 16.x
3. AWS (EC2, ALB, ECS-Fargate, RDS, S3, IAM, CloudFront)
4. Docker, GitHub Actions (CI/CD)
5. Infrastructure Best Practices (Auto Scaling, Load Balancing)

Goal:
Demonstrate an end-to-end real-world cloud deployment of microservices adhering to industry-grade scalability, security, and DevOps pipelines on AWS.
