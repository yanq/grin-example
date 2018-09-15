import grace.app.Server
import static grace.route.Routes.*

get('/') {
    response.writer.write("get /")
}

get('/a') {
    response.writer.write("get /a")
}

get('/b') {
    response.writer.write("get /b")
}

new Server().start()