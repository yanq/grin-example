//config

//server
server.host = 'localhost'
server.port = 8080
server.context = '/'

// 文件上传
fileUpload.upload = '/upload'
fileUpload.download = '/uploads'
fileUpload.location = '/temp/uploads'
fileUpload.maxFileSize = -1L
fileUpload.maxRequestSize = -1L
fileUpload.fileSizeThreshold = 0
//文件处理 URI
assets.uri = '/assets'
files.uri = '/files' //静态文件
// 处理错误的控制器类
// errorClass = Controller.class
//views
views.notFound = '/notFound.html'
views.error = '/error.html'

//environments
environments {
    dev {
        //重设 location
        fileUpload.location = 'd:/temp/uploads'

        dataSource {
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql:grace_dev"
            username = ""
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
    }
    prod {
        name = "Grace Prod"
    }
}

json.dateFormat = 'yyyy'