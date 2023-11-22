import grin.web.Controller
import grin.web.HttpException
import groovy.util.logging.Slf4j

import java.lang.management.ManagementFactory
import java.util.concurrent.atomic.AtomicLong

@Slf4j
class HomeController extends Controller {
    static AtomicLong count = new AtomicLong()

    def index() {
        render('/index', [:])
        // render("abcde")
    }

    def hello() {
        long c = count.getAndIncrement()
        session.count = c
        render("Hello,${params.name ?: 'World'}! ${c}")
    }

    def ex() {
        throw new HttpException(500, "异常测试")
    }

    def param() {
        log.info("request uri: ${request.getRequestURI()}")
        // json(params) //重复调用会有异常
        json([params: params, headers: headers])
    }

    def html() {
        log.info("request uri: ${request.getRequestURI()}")
        // html.html{
        //     header {}
        //     body {
        //         p("hhh")
        //     }
        // }
        htmlBuilder.body {
            p("hhh")
        }
    }

    def mem() {
        def mem = ManagementFactory.memoryMXBean
        def heapUsage = mem.heapMemoryUsage
        def nonHeapUsage = mem.nonHeapMemoryUsage
        def r = """MEMORY:
HEAP STORAGE:
\tcommitted = $heapUsage.committed
\tinit = $heapUsage.init
\tmax = $heapUsage.max
\tused = $heapUsage.used
NON-HEAP STORAGE:
\tcommitted = $nonHeapUsage.committed
\tinit = $nonHeapUsage.init
\tmax = $nonHeapUsage.max
\tused = $nonHeapUsage.used
"""
        println(r)
        println(ManagementFactory.getRuntimeMXBean().getName()) // 这个通常要 5s，有些夸张
        render(r)
    }
}
