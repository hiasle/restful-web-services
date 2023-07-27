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
            input {
                    message 'Bitte approven'
                    ok 'OK'
                }
            steps {
                echo 'Approved'
            }
        }
        stage('Deploy') {
            agent any
            steps {
                echo 'Deploying'
            }
        }
    }
}
