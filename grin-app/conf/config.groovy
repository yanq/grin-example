// config
// URL Mapping, key 为 url 表达式，value 为内部资源，controllerName-actionName
urlMapping = [
        '/'                                   : 'home',
        '/some-pre/hello'                     : 'home-hello',
        '/files/@actionName?/@id**?'          : 'files',
        '/@controllerName/?@actionName?/?@id?': '',
]

// 处理错误的控制器类（可选，默认用 Controller）
// errorClass = Controller.class
// views
views.notFound = '/notFound.html'
views.error = '/error.html'

// 服务器 url
serverURL = "http://localhost:8080"

// environments
environments {
    dev {
        dataSource {
            driverClassName = "org.h2.Driver"
            url = "jdbc:h2:~/h2db/grin-example-test;MODE=PostgreSQL"
            username = "sa"
            password = ''
            initialSize = 5
            minIdle = 5
            maxWait = 5000
            //maxWaitThreadCount = 3 这是干嘛用的？
            validationQuery = 'select 1'
            useGlobalDataSourceStat = true
            removeAbandoned = true
            removeAbandonedTimeout = 10000
        }
        logSql = true
        // dbCreate = 'update' // create-drop update none
        // 要执行的 sql 文件，一般用于同步数据库结构，注意可能的副作用。
        dbSql='app.sql'
    }
    prod {
        dataSource {
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/grin_dev"
            username = "postgres"
            password = 'pg@local'
            initialSize = 5
            minIdle = 5
            maxWait = 5000
            //maxWaitThreadCount = 3 这是干嘛用的？
            validationQuery = 'select 1'
            useGlobalDataSourceStat = true
            removeAbandoned = true
            removeAbandonedTimeout = 10000
        }
        logSql = true
        // dbCreate = 'update' // create-drop update none
        // 要执行的 sql 文件，一般用于同步数据库结构，注意可能的副作用。
        // dbSql='app.sql'
    }
}

json.dateFormat = 'yyyy-MM-dd HH:mm:ss'