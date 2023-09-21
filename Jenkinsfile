pipeline {
    agent any
    tools {
        maven 'maven386'
    }
    stages {
        stage('Checkout Github & Maven Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/helsarayta/Jenkins-Automation-Spring']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
               script {
                   sh 'docker build . -t heydie/jenkins-automation'
               }
            }
        }
        stage('Push toDocker Hub') {
            steps {
               script {
                   withCredentials([string(credentialsId: 'dockerHub', variable: 'dockerHub')]) {
                    sh 'docker login -u heydie -p ${dockerHub}'
                    }
                    sh 'docker push heydie/jenkins-automation'
               }
            }
        }
    }
}