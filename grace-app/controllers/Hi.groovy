import static grace.route.Routes.after
import static grace.route.Routes.before
import static grace.route.Routes.get

/**
 * 首页
 */
get('/') {
    render "你好,Grace !"
}

/**
 * 路径定义
 */
get('/j') {
    def json = getJson()
    json.p([s: 'bc'])
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
 * 路径相对定义
 */
get('ab') {
    response.writer.write("get /b ")
}

/**
 * 带参数路径
 */
get('/p/@name'){
    render "params :${params}"
}

/**
 * 另一种定义方式
 */
"/show" {
    println("aaaaasddfsdfddfssddsgaa")
}

/**
 * 测试模板
 */
get('/r'){
    render 'h',[name:'Grace!']
}

before {
    request.beforeAt = System.nanoTime()
    log.info("before interceptor")
}
after {
    log.info("after interceptor,${(System.nanoTime()-request.beforeAt)/1000000} ms")
}

//new GraceServer().start()