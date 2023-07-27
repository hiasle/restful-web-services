pipeline {
    agent none
    stages {
        stage('Build') {
            agent any
            steps {
                echo 'Building'
            }
        }
        stage('Checkpoint') {
            agent none //running outside of any node or workspace
            steps {
                checkpoint 'Completed Build'
            }
        }
        stage('Deploy') {
            agent any
            steps {
                sh 'Deploying'
            }
        }
    }
}
