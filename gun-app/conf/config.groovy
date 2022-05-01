import websocket.WebSocketEntry

// config

// URL Mapping, key 为 url 表达式，value 为内部资源，controllerName-actionName
urlMapping = [
        '/'                                   : 'home',
        '/some-pre/hello'                     : 'home-hello',
        '/files/@actionName?/@id**?'          : 'files',
        '/@controllerName/?@actionName?/?@id?': '',
]

webSocketEntryList = [WebSocketEntry]

// 服务器
// port 设置 -1 表示不启用
server {
    host = 'localhost'
    http.port = 8080
    // https {
    //     port = 8443
    //     jksPath = ''
    //     jksPwd = ''
    // }
    // context = '/'
    // uploadLocation = '/Volumes/data/dev/uploads'
    // maxFileSize = -1L
    // maxRequestSize = -1L
    // fileSizeThreshold = 0
    // ioThreads = 2
    // workerThreads = 5
}

serverURL = "http://localhost:8080"

// 处理错误的控制器类
// errorClass = Controller.class
// views
views.notFound = '/notFound.html'
views.error = '/error.html'

// environments
environments {
    dev {
        dataSource {
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/gun_dev"
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
        // 要执行的 sql 文件，一般用于同步数据库结构，注意可能的副作用。
        // dbSql='app.sql'
    }
    prod {
        name = "Gun Prod"
    }
}

json.dateFormat = 'yyyy-MM-dd HH:mm:ss'