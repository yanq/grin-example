import grace.app.GraceApp
import book.Book

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

Book book = new Book()
book.title='Hi World!'
book.type = "语文"
book.price = 3.5
book.validate()
println(book.errors)
book.save()