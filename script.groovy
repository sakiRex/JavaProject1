def buildApp() {
     echo 'script.groovy: building the application..."
}
def testApp() {
     echo 'script.groovy: testing the application..."
}
def deployApp() {
     echo 'script.groovy: deploying the application..."
     echo "script.groovy: deploying version ${params.VERSION}"
}
return this
