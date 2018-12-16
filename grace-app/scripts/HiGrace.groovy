import grace.app.GraceApp
import grace.common.Params
import grace.datastore.entity.EntityUtil
import yan.practise.Author
import yan.practise.Book

/**
 * 测试 Grace
 */

GraceApp.setRootAndEnv(new File('D:\\IdeaProjects\\grace-dev\\grace-example'))

Author author = Author.get(2)
author.bind([createAt: ''] as Params)
author.save()
//
// if ('') println('kong')
// if ([a:''].containsKey('a')) println('kong a')