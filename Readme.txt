************************************* Readme ******************************************
				     ========

Video Link : https://www.youtube.com/watch?v=qREiDHg9_nY
----------

Setup and Installation Guide
----------------------------
This guide provides step-by-step instructions for setting up and deploying a Spring Boot application connected to Amazon RDS, containerized with Docker, and managed through AWS EC2 instances using Rancher and Jenkins for CI/CD.

# Prerequisites

- JDK 11 or newer
- Maven
- Docker installed on your machine
- AWS Account
- Docker Hub Account
- Jenkins installed with Java 11

Step 1: Build Spring Boot Application
1. Create Project Structure: Ensure your project structure is set up as follows:
2. Setup Application Properties:
     Edit `src/main/resources/application.properties` to include your Amazon RDS connection details:
3. Build the Application:
   mvn clean install

Step 2: Dockerize the Application
1. Create a Dockerfile in your project root.
2. Build Docker Image
   docker build -t survey-app .
3. Run Docker Container
   docker run -p 8080:8080 survey-app

Step 3: Deploy with AWS EC2 and Rancher
1. Create EC2 Instances: Setup three `t2.large` instances from the AWS console with Ubuntu AMI.
2. Setup Rancher:
   - SSH into master instance and install Docker and Rancher:
3. Configure Cluster:
   - Use Rancher to configure the Kubernetes cluster and add other EC2 instances.

Step 4: Setup Jenkins for CI/CD
1. Install Jenkins and Required Plugins.
2. Configure Pipeline:
   - Setup a Jenkins pipeline using a Jenkinsfile in your repository which defines build, test, and deploy stages.

Step 5: Monitoring and Logs
  Access Application Logs via Docker.
  Monitor EC2 Instances using the Rancher Dashboard.

Source files, configuration files (Dockerfile, Jenkinsfile, YAMLs, war file)
----------------------------------------------------------------------------
Stored in StudentSurvey Folder

AWS URL of your homepage as well as of the application deployed on Kubernetes
-----------------------------------------------------------------------------
Not Required as per question@26 asked on Piazza

Lesson Learned
--------------
-The importance of containerization: Docker simplifies deployment by packaging applications and their dependencies into containers, ensuring consistency across different environments.

-Cloud resources flexibility: Using AWS EC2 instances demonstrates how scalable and flexible cloud resources can be for deploying web applications, accommodating varying loads with different instance types.

-Orchestration and management with Rancher: Rancher facilitates the management of Kubernetes clusters, streamlining the deployment and scaling of applications across multiple instances.

-Automation with Jenkins: Integrating Jenkins for CI/CD pipelines automates the build, test, and deployment process, significantly improving development efficiency and reducing manual errors.

-Multi-stage builds optimize resources: The use of multi-stage builds in Dockerfiles can significantly reduce the final image size by removing unnecessary build-time dependencies, leading to faster deployment and less resource consumption.
***************************************End***********************************************