// import groovy.transform.Field

node {
    def rootDir = pwd()
    def myModule = load "${rootDir}/mylib.groovy"


    stage('first'){println "123321"}

    stage('Hello'){ myModule.print_hello('Alex') }

}

