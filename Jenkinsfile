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
                input {
                    message 'Bitte approven'
                    ok 'OK'
                }
                echo 'Approved'
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
