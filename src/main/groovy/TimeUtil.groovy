class TimeUtil {
    static time(Closure closure){
        long start = System.nanoTime()
        closure()
        println "Time used : ${(System.nanoTime()-start)/1000000} ms"
    }
}
