import grace.app.GraceServer
import yan.practise.Book
import static grace.controller.route.Routes.*

/**
 * 首页
 */
get('/') {

    Book book = Book.get(2)
    render(book)

    render "你好,Grace !"
}

/**
 * 路径定义
 */
get('/j') {
    json.p([s: 'bcsdsfefsessssdssa'])
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
get('/p/@name') {
    render "params :${params}"
}

/**
 * 测试模板
 */
get('/r') {
    render 'index', [name: 'Grace !']
}

/**
 * asset
 */
assets('/asset')

//拦截器
before {
    request.beforeAt = System.nanoTime()
    log.info("before interceptor ")
}
after {
    log.info("after interceptor,${(System.nanoTime() - request.beforeAt) / 1000000} ms")
}

// new GraceServer().start()