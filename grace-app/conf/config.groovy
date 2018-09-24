//config

//server
server.host = 'localhost'
server.port = 8008
server.context = '/'

//environments
environments {
    dev {
        dataSource {
            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            driverClassName = "org.h2.Driver"
            username = "sa"
            password = ''
        }
    }
    prod {
        name = "Grace Prod"
    }
}
