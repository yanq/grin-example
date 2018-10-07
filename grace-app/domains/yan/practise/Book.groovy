package yan.practise

import grace.datastore.entity.Entity
import groovy.transform.ToString

/**
 * book
 */
@ToString(includeNames = true, excludes = ['errors'])
class Book implements Entity<Book> {
    long id
    String title
    String type
    Date publishAt = new Date()

    static transients = ['config']
    static mapping = [table: 'book', columns: [name: 'title']]
    static constraints = {
        title nullable: false, blank: false, size: 1..5 comment '字符串长度要处于 1 到 5 之间'
        type inList:['语文','数学']
    }
}

