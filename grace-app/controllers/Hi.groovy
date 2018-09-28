import static grace.controller.route.Routes.*

/**
 * 首页
 */
get('/') {
    int count = Book.where('name is not null').count()
    println(count)
//    Book book = Book.where('id=100').get()
    List books = Book.where('id > 200').list([limit: 3,offset: 5,order:'id desc'])
    render "你好,Grace !"
}

/**
 * 路径定义
 */
get('/j') {
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
get('/p/@name') {
    render "params :${params}"
}

/**
 * 测试模板
 */
get('/r') {
    render 'h', [name: 'Grace!']
}

//拦截器
before {
    request.beforeAt = System.nanoTime()
    log.info("before interceptor")
}
after {
    log.info("after interceptor,${(System.nanoTime() - request.beforeAt) / 1000000} ms")
}

//new GraceServer().start()