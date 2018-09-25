import grace.datastore.DBUtil
import grace.datastore.Entity
import groovy.transform.ToString
import org.grails.datastore.gorm.GormEntity

/**
 * book
 */
@ToString
class Book implements Entity<Book> {
    String title
    Date publishAt
    static Map mapping = [table: 'book']

    def config = {

    }

    public static void main(String[] args) {
        println Book.get(1)
//        println(Book.tableName)
//        println(DBUtil.toDbName("firstName"))
//        println(DBUtil.toDbName("HTML"))
        //println(Book.mapping)
//        Book.declaredFields*.name.each {
//            println("$it")
//        }
    }
}

