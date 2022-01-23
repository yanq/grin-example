import groovy.json.JsonOutput

/**
 * 测试 Grace
 */

//GraceApp.setRootAndEnv(new File('/Users/yanq/IdeaProjects/grace-dev/grace-example'))

//Properties props = new Properties();
//props.setProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
//props.setProperty("dataSource.user", "yanq");
//props.setProperty("dataSource.password", "");
//props.setProperty("dataSource.databaseName", "grace_dev");
//props.put("dataSource.logWriter", new PrintWriter(System.out));
//
//HikariConfig config = new HikariConfig(props);
//HikariDataSource ds = new HikariDataSource(config);
//
//DB.dataSource = ds

//println Author.list()
//println Author.count()
//
//DB.withTransaction { Sql sql->
//    int c = Author.count()
//    Author author = new Author(name: 'Yan'+c)
//    author.validate()
//    println author.save()
//    println Author.count()
//    sql.connection.rollback()
//    println Author.count()
//}

println JsonOutput.toJson(null)