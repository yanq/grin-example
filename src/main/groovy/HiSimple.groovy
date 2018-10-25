import grace.route.Routes
import grace.simple.SimpleServer

/**
 * SimpleServer sample
 */

Routes.get('/') {
    render("Hi,HttpServer!")
}

Routes.get('/a') {
    json('aaa')
}

Routes.get('/b') {
    html.p{
        span "Hi,simple!"
    }
}

Routes.get('/d') {
    exchange.sendResponseHeaders(200, -1)
}

Routes.get('/e') {
    throw new Exception('throw exception test')
}

Routes.before('/**') {
    println("Before")
}


SimpleServer server = new SimpleServer()
// SimpleServer server = new SimpleServer(8080,'/',5)
server.start()