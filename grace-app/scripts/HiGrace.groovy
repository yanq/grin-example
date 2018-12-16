import grace.app.GraceApp
import grace.datastore.entity.EntityUtil
import yan.practise.Author
import yan.practise.Book

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

Author author = new Author()
author.name = "Jack"
author.save()