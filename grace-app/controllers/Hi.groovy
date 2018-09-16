import grace.app.Server
import static grace.route.Routes.*

/**
 * 首页
 */
get('/') {
    response.writer.write("get /   ")
    response.writer.write(owner.class.name)
}

/**
 * 路径定义
 */
get('/a') {
    response.writer.write("get /a")
}

/**
 * 路径定义
 */
get('a') {
    response.writer.write("get /b")
}

/**
 * 另一种定义方式
 */
"/show" {
    println("aaaaaaa")
}

//'/eeee'('sss')

//new Server().start()