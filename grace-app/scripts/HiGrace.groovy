import grace.app.GraceApp
import yan.practise.Book

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

def books = Book.getAll([1,2,3])
println(books)