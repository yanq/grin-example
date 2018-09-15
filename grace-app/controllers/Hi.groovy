import grace.app.Server
import static grace.route.Routes.*

get('/') {
    response.writer.write("get /")
}

/**
 *
 */
get('/a') {
    response.writer.write("get /a")
}

/**
 *
 */
get('/b') {
    response.writer.write("get /b")
}
get('/b1') {
    response.writer.write("get /b")
}
get('/b2') {
    response.writer.write("get /b")
}
get('/b3') {
    response.writer.write("get /b")
}
get('/b4') {
    response.writer.write("get /b")
}
get('/b5') {
    response.writer.write("get /b")
}
get('/b6') {
    response.writer.write("get /b")
}

"/show" {
    println("aaaaaaa")
}

'/eeee'('sss')




new Server().start()