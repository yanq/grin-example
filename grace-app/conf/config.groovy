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
//views
views.notFound = '/notFound.html'
views.error = '/error.html'

//environments
environments {
    dev {
        //重设 location
        fileUpload.location = 'd:/temp/uploads'

        dataSource {
            url = "jdbc:mysql://localhost/grace"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = 'mysql'
            initialSize = 5
            minIdle = 5
            maxWait = 5000
            //maxWaitThreadCount = 3 这是干嘛用的？
            validationQuery = 'select 1'
            useGlobalDataSourceStat = true
        }
        // logSql = true
    }
    prod {
        name = "Grace Prod"
    }
}

json.dateFormat = 'yyyy'