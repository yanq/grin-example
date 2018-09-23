//config

//server
server.host = 'localhost'
server.port = 8008
server.context = '/'

//environments
environments{
    dev{
        server.port = 8009
        server.context = '/grace'
        name = "Grace Dev"
    }
    prod{
        name = "Grace Prod"
    }
}
