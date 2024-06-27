# Student Survey Management System

## Overview

This project involves building a Spring Boot application with a REST API for managing student surveys. The application is containerized using Docker, deployed on AWS using EC2 instances, and managed with Kubernetes through Rancher. Additionally, a CI/CD pipeline is set up using Jenkins.

## Project Structure

- **StudentSurvey**: Package for running the application.
- **com.SWE645.StudentSurvey.controller**: Contains the controller class.
- **com.hw3.surveyform.exception**: Handles exceptions.
- **com.SWE645.StudentSurvey.dao**: Service layer contracts and data model.
- **com.SWE645.StudentSurvey.service**: Service layer implementation.

## RESTful APIs

1. `saveStudentSurvey` (POST): Saves a new survey.
2. `listAllSurveys` (GET): Retrieves all surveys.
3. `getSurveyById` (GET): Fetches a survey by ID.
4. `deleteSurvey` (DELETE): Deletes a survey by ID.
5. `updateSurvey` (PUT): Updates a survey by ID.

## Data Access

- `SurveyRepositoryInterface`: Extends `JpaRepository` for CRUD operations.
- `surveyService`: Handles business logic and interactions with the repository.

## Database

- **Amazon RDS**: MySQL database.
- Configuration: Details specified in `application.properties`.

## Containerization with Docker

- **Dockerfile**: Multi-stage build to compile and package the Java application.
- Commands:
  - `docker build`: Builds the Docker image.
  - `docker run`: Runs the Docker container.
  - `docker push`: Pushes the image to Docker Hub.

## AWS Deployment

1. **EC2 Instances**: Three instances using Ubuntu AMI (`t2.large`).
2. **Rancher Setup**:
   - Installed on the master instance.
   - Cluster configured with `etcd`, Control Plane, and Worker roles.

## Kubernetes Deployment

- **Cluster Configuration**: Deployments and services set up in Rancher.
- **Replica Set**: Configured with 5 replicas.
- **Service Exposure**: Using NodePort.

## CI/CD Pipeline with Jenkins

1. **Jenkins Setup**: Installed and configured with Java 11.
2. **Pipeline Stages**:
   - Checkout code from SCM.
   - Build and deploy Docker image.
   - Push Docker image to Docker Hub.
   - Apply Kubernetes configurations.
3. **Environment Variables**:
   - `DOCKER_CREDENTIALS`: Jenkins credentials ID for Docker Hub authentication.
   - `IMAGE_NAME`: Docker image name.
   - `IMAGE_NAME_TEST`: Unique Docker image tag using the build timestamp.
   - `BUILD_TIMESTAMP_DEPLOYMENT`: Build timestamp for deployment.

## End-to-End Testing

- **Postman**: Used to test all CRUD operations of the Spring Boot application.
  - **GET**: Fetch all survey records.
  - **POST**: Save a new survey record.
  - **PUT**: Update a survey record by ID.
  - **DELETE**: Delete a survey record by ID.

## Setup Instructions

### Prerequisites

- Java 11
- Maven
- Docker
- AWS Account
- Jenkins
- Kubernetes (Rancher)

### Build and Run

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd <repository-directory>

2. **Build the Application**:
   mvn clean install

3. **Run the Application**:   
   mvn spring-boot:run

4. **Build Docker Image**:   
   docker build -t <image-name> .

5. **Run Docker Container**:
   docker run -p 8080:8080 <image-name>

6. **Push Docker Image to Docker Hub**:
   docker tag <image-name> <dockerhub-username>/<image-name>
   docker push <dockerhub-username>/<image-name>

7. **Deploy on Kubernetes**:
   -Use Rancher UI or kubectl commands to deploy the Docker image to the Kubernetes cluster.
   -Ensure NodePort is configured for the service exposure.

### Testing
   Use Postman to test the APIs:
     - GET: http://<ec2-public-dns>:<nodeport>/StudentSurvey-0.0.1-SNAPSHOT/survey
     - POST: http://<ec2-public-dns>:<nodeport>/StudentSurvey-0.0.1-SNAPSHOT/survey
     - PUT: http://<ec2-public-dns>:<nodeport>/StudentSurvey-0.0.1-SNAPSHOT/survey
     - DELETE: http://<ec2-public-dns>:<nodeport>/StudentSurvey-0.0.1-SNAPSHOT/survey
