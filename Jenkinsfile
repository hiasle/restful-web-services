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
        stage('Example Deploy') {
            when {
                beforeOptions true
                branch 'testing'
            }
            options {
                lock label: 'testing-deploy-envs', quantity: 1, variable: 'deployEnv'
            }
            steps {
                echo "Deploying to ${deployEnv}"
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
