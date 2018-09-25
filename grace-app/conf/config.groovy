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
            validationQuery = 'select 1'
            useGlobalDataSourceStat = true
        }
    }
    prod {
        name = "Grace Prod"
    }
}
