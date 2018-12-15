import grace.app.GraceApp
import grace.datastore.entity.EntityUtil
import yan.practise.Author
import yan.practise.Book

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

def books = Book.where('id in (?,?,?)',1,2,3).list()
EntityUtil.fetch(books)
books.each {
    println(it)
    it.author = new Author(id: 2)
    it.save()
}
