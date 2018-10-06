import grace.app.GraceApp
import grace.controller.request.RequestBase
import grace.generate.Generator
import yan.practise.Book

import java.text.SimpleDateFormat

def entityClass = Book
def out = []

// GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-web'))

// def content = Generator.generate(new File('D:\\IdeaProjects\\grace-dev\\grace-web\\grace-app\\templates\\create.html'), [entityName:'book',entityClass: entityClass])
// println content
//

RequestBase.Params params = new RequestBase.Params()
def p = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"

def date = "2018 Oct 06 14:59:00"
def f = new SimpleDateFormat(p)

println f.format(new Date())
// println f.parse(date)
// println(d)

// println(new Date().toString())
