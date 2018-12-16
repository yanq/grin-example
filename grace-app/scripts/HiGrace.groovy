import grace.app.GraceApp
import grace.common.Params
import grace.datastore.entity.EntityUtil
import yan.practise.Author
import yan.practise.Book

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