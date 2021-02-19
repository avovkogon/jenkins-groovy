// import groovy.transform.Field

node {
    checkout scm

    def rootDir = pwd()
    def myModule = load "${rootDir}/mylib.groovy"

    stage('first'){
        println "123321"
        sh "pwd"
        sh "ls"
    }

    stage('Hello'){ myModule.print_hello(0) }

}

