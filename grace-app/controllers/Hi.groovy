import grace.app.GraceServer
import static grace.route.Routes.*

/**
 * 首页
 */
get('/') {
    respond "Hi,Gracecfv !"

    new HelloWorld().sayHi()
}

/**
 * 路径定义
 */
get('/j') {
    def json = getJson()
    json.p([s: 'b'])
    json('sss')
    json(this)
    json(1, 2, 3)
    json([1, 2, 3]) {
        a it
    }
    json([a: 5])
    json.person(name: "Tim", age: 35) { town "Manchester" }
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