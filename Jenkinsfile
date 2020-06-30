pipeline {
     agent any
     tools {
          gradle 'Gradle'
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
