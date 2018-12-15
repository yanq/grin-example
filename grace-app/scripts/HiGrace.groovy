import grace.app.GraceApp
import yan.practise.Author
import yan.practise.Book

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

// def books = Book.where('id in (?,?,?)',1,2,3).list()
// books.each {
//     println(it)
//     it.author = new Author(id: 2)
//     it.save()
// }

Book book = new Book(id: 2)
book.refresh()
book.author.refresh()
println(book)