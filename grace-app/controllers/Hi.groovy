import grace.app.GraceServer
import static grace.route.Routes.*

/**
 * 首页
 */
get('/') {
    respond "Hi,Grace!"
}

/**
 * 路径定义
 */
get('/j') {
    json.p()
}

/**
 * 路径定义
 */
get('ab') {
    response.writer.write("get /b ")
}

/**
 * 另一种定义方式
 */
"/show" {
    println("aaaaasddffddfssddsgaa")
}

//'/eeee'('sss')

//new GraceServer().start()