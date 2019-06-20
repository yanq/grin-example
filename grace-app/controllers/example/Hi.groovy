package example

import grace.route.Routes
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import static grace.route.Routes.*

Logger log = LoggerFactory.getLogger(this.class)

/**
 * 首页
 */
get('/') {
    log.info("log something ~~ ${flash.message}")
    def routes = Routes.routes.findAll {
        it.method in [Routes.METHOD_GET, Routes.METHOD_ALL] && !it.path.contains('@') && !it.path.contains('*')
    }

    println(g.link('/abc'))
    println(g.link('/abc',[a:5]))

    render('/index', [routes: routes])
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

get('/j1') {
    json([a: 5])
}

get('/j2') {
    json.person(name: "Tim", age: 35) { town "Manchester" }
}

get('/j3') {
    json(1, 2, 3)
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
get('upload') {
    render 'upload', [name: 'Grace !']
}

get('/error') {
    throw new Exception("半路杀出个程咬金")
}

req('h') {
    html.p('html content  ')
}
//redirect
get('/r') {
    flash.message = "测试 flash 作用域，message"
    redirect('/')
}

get('accept') {
    println(accept('json'))
    println(accept('xml'))
    println(accept('html'))
    println(accept('text'))
    println(accept(['json', 'html']))
}

get('/contentJson') {
    println(params)
    render params
}

//拦截器
before {
    request.beforeAt = System.nanoTime()
    log.info("before interceptor ")
    return true
}
after {
    log.info("after interceptor,${(System.nanoTime() - request.beforeAt) / 1000000} ms")
}


// new GraceServer().start()