pipeline {
    agent none
    stages {
        stage('Build') {
            agent { label 'elias-build' }
            steps {
                echo 'Building'
            }
        }
        /* stage('Checkpoint') {
            agent none //running outside of any node or workspace
            input {
                    message 'Bitte approven'
                    ok 'OK'
                }
            steps {
                echo 'Approved'
            }
        } */
        stage('Deploy') {
            when {
                expression {
                    input message: 'Bitte approven'
                    // if input is Aborted, the whole build will fail, otherwise
                    // we must return true to continue
                    return true
                }
                beforeAgent true
            }
            agent { label 'elias-build' }
            steps {
                echo 'Deploying'
            }
        }
    }
}
