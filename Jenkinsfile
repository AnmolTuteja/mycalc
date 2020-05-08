node
{
    def registry = "anmoltuteja/sample_calc"
    def registryCredential = 'DockerHub'
    def dockerImage = ''

    stage('Git-Checkout')
    {
        echo 'Pulling the Maven Git repo'
        git "https://github.com/AnmolTuteja/mycalc"

    }

    stage("Clean the maven project")
    {
        echo "Cleaning the project"
        sh "mvn clean"
    }

    stage("Compile the maven project")
    {
        echo "Compiling the project"
        sh "mvn compile"
    }

    stage("Test the project")
    {
        echo "Testing the project"
        sh "mvn test"
    }

    stage("Install the project")
    {
        echo "Installing the project"
        sh "mvn install"
    }

    stage('Build Image')
    {
        dockerImage = docker.build registry + ":$BUILD_NUMBER"
    }

    stage('Push Image to DockerHub')
    {
        docker.withRegistry( '', registryCredential )
        {
            dockerImage.push('latest')

        }
    }

    stage('Deploy on Node')
    {
        step([
            $class: "RundeckNotifier",
            rundeckInstance: "rundeck server",
            jobId: "d5c78823-5d2d-4651-a4e4-2b841289204b",
            includeRundeckLogs: true,
            shouldWaitForRundeckJob: true,
            shouldFailTheBuild: true,
            tailLog: true
        ])
    }
}
