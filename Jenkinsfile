pipeline {
    agent any
    parameters {
        choice(name: 'Version', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTesting', defaultValue: true, description: '')
    }
    stages {
        stage("Build") {
            steps {
                echo 'building...'
            }
        }
        stage("Test"){
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                echo 'testing...'
            }
        }
        stage("Deployment"){
            steps {
                echo 'deploying...'
            }
        }
    }
}
