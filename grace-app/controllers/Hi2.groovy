import grace.route.Route
import grace.util.RegexUtil
import yan.grace.Hello

//GroovyScriptEngine engine = new GroovyScriptEngine("D:\\IdeaProjects\\grace-dev\\grace-web\\grace-app\\controllers")

//engine.run('yan/grace/Hello.groovy','')

//println(Hello.simpleName)

//[1,2,3,4].each {
//    if (it>2) return
//    println(it)
//}

//println({}()==false)
//println({println('------------')}()==false)
//println({'------------'}()==false)
//println({return true}()==false)
//println({return false}()==false)

//println "/a/@name".findAll(/@\w*/)
//println "/a".findAll(/@\w*/)
//println ![]

//println "/@a/@b/@c?".findAll(/@\w*/)

Route route = new Route(path: '/@b')
println route.matches("/a")
println route.getPathParams('/a')

println RegexUtil.clearRequestURI('/a')
println RegexUtil.clearRequestURI('/a?c=v')
println RegexUtil.clearRequestURI('/a;sss')
println RegexUtil.clearRequestURI('/a#ha')