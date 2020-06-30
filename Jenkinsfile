pipeline {
     agent any
     tools {
          gradle 'Gradle-6.2'
     }
     stages {
          stage("run backend") {
               steps {
                    echo "executing gradle..."
                    sh './gradlew -v'
               }
          }
     }
}
