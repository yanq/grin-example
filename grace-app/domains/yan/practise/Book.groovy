package yan.practise

import grace.datastore.entity.Entity
import groovy.transform.ToString

/**
 * book
 */
@ToString(includeNames = true, excludes = ['errors'])
class Book implements Entity<Book> {
    long id
    Author author
    String title
    String type
    BigDecimal price
    Date publishAt = new Date()

    static transients = ['config']
    static mapping = [table: 'book', columns: [name: 'title']]
    static constraints = {
        title nullable: false, blank: false, size: 1..100 comment '字符串长度要处于 1 到 100 之间'
        type inList: ['语文', '数学'],matches:~/.+/
        price min: 1.0, max: 10.0, range: 2.0..5, validator: { val, obj -> return true } comment '价格介于 1.0 到 10.0 之间'
    }
}

