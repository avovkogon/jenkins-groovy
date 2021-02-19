// import groovy.transform.Field
properties([
    parameters([
        choice(name: 'ENVIRONMENT', choices: ['develop_new', 'staging_new', 'prod']),
        choice(name: 'scale_to', choices: ['1', '0'])
    ])
])

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

