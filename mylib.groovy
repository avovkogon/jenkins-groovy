def print_hello (final scaleto){
    println "Hello "
    try {

        if (scaleto== 0) {
            println "scaleto=0"
        
        } else if (scaleto== 1) { 
            println "scaleto=1" 
        
        } else {
            println "Please set scaleto 0 or 1"
        }    

    } catch (def e) {
        currentBuild.result = 'FAILURE'
        throw e
    }
}

return this