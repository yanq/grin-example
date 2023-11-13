import grin.web.Controller
import grin.web.HttpException

import java.util.concurrent.atomic.AtomicLong

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
}
