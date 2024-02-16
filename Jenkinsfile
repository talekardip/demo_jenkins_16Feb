pipeline {
    agent {label "win-agent1"}

    stages {
        stage('Build System') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/talekardip/demo_jenkins_16Feb']])
                bat "mvn clean package"
            }
        }

        stage('Testing') {
            steps {

                bat "mvn test"
            }
        }

        stage('Build Docker image') {
            steps {

                bat "docker build -t talekardip/demojenkins ."
            }
        }

        stage('Publish image') {
            steps {
                withCredentials([string(credentialsId: 'b0095ff9-fa4d-44f8-811f-891091c4d23a', variable: 'docker-hub-password')]) {
                    bat "docker push talekardip/demojenkins"
                }
            }
        }
    }
}
