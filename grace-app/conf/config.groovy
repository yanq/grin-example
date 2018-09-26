//config

//server
server.host = 'localhost'
server.port = 8008
server.context = '/'

//environments
environments {
    dev {
        dataSource {
            url = "jdbc:mysql://localhost/grace"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = 'mysql'
            initialSize = 5
            minIdle = 5
            validationQuery = 'select 1'
            useGlobalDataSourceStat = true
        }
        logSql = true
    }
    prod {
        name = "Grace Prod"
    }
}
