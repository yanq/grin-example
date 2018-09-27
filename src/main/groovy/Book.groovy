import grace.datastore.DBUtil
import grace.datastore.Entity
import grace.datastore.EntityApiImpl
import groovy.transform.ToString
import org.grails.datastore.gorm.GormEntity

/**
 * book
 */
@ToString(includeNames = true)
class Book implements Entity<Book> {
    long id
    String name
    String title
    Date publishAt = new Date()

    //static transients = ['config']
    static mapping = [table: 'book', columns: [name: 'title']]
    static constraints = {
        title blank: true, size: 1..5 comment '字符串长度要处于 1 到 5 之间'
    }

    public static void main(String[] args) {
       EntityApiImpl.validate(new Book())
    }
}

