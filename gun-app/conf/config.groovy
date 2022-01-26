// config

// 文件上传
fileUpload.location = '/temp/uploads'
// 处理错误的控制器类
// errorClass = Controller.class
// views
views.notFound = '/notFound.html'
views.error = '/error.html'

serverURL = "http://localhost:8080"
fileUpload.location = '/Volumes/data/dev/uploads'

// environments
environments {
    dev {
        dataSource {
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5433/gun_dev"
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
    }
    prod {
        name = "Gun Prod"
    }
}

json.dateFormat = 'yyyy'