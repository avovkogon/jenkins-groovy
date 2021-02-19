// import groovy.transform.Field

def rootDir = pwd()
def myModule = load "${rootDir}/mylib.groovy"

node {
    checkout scm

    stage('first'){
        println "123321"
        sh "pwd"
        sh "ls"
    }

    stage('Hello'){ myModule.print_hello() }

}

