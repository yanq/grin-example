import grace.app.GraceApp
import yan.practise.Book

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

def books = Book.where('id in (?,?,?)',1,2,3).list()
books.each {
    println(it)
}