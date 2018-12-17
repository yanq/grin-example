import grace.app.GraceApp
import book.Book
import grace.generate.FormGenerator

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

def s = FormGenerator.entity(Book,'author','',[:])
println(s)