pipeline {
    agent {
        label 'label'
    }
        environment {
            course = "i27"
            name = "siva"
        }
        stages {
            stage ('Build'){
                environment {
                    cloud = "GCP"
                }
                steps {
                    echo "Welcome ${name}"
                    echo "You enrolled for ${course} course"
                    echo "You are certified in ${cloud} course"
                }
            }
        }
    }
