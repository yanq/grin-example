import groovy.time.TimeCategory

def time(Closure closure) {
    def start = System.nanoTime()
    closure.call()
    return System.nanoTime() - start
}
100.times {
    def nTimes = [], uTimes = []
    10.times {
        new Thread(new Runnable() {
            @Override
            void run() {
                nTimes << time {
                    //1+1
                }

                uTimes << time {
                    use(TimeCategory) {
                        //1+1
                    }
                }
            }
        }).start()
    }

    sleep(2000)

//    println "use ${uTimes.size()} ${uTimes.sum() / uTimes.size()}"
//    println "nouse ${nTimes.size()} ${nTimes.sum() / nTimes.size()}"
    println("${uTimes.sum() / uTimes.size()}  ---  ${nTimes.sum() / nTimes.size()}")
}
