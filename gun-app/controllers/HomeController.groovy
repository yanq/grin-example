import gun.web.Controller

class HomeController extends Controller {
    def a = '1234'

    def index() {
        render('/index', [:])
        // render("abcde")
    }
}
