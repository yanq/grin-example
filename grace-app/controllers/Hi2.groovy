import grace.app.GraceApp
import grace.controller.request.Params
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

Params params = new Params()
params.date = "Sat Oct 06 16:57:02 CST 2018"

println(params.date('date'))
// println(params.date('date','EEE MMM dd HH:mm:ss z yyyy'))
// SimpleDateFormat format = new SimpleDateFormat('EEE MMM dd HH:mm:ss z yyyy',Locale.ENGLISH)
// println(format.format(new Date()))
//
// println format.parse(params.date)

// Date now = new Date()
// now()
