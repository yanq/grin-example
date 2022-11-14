package book

import groovy.transform.ToString
import grin.datastore.Entity

/**
 * Author
 */
@ToString(includeNames = true, excludes = ['errors'])
class Author implements Entity<Author> {
    long id //must,long or String
    String name
    Date createAt = new Date()

    static transients = []
    static mapping = [:]
    static constraints = {
        name nullable: true, blank: true, size: 1..5 comment '字符串长度要处于 1 到 5 之间'
    }

    @Override
    String toString() {
        return name
    }
}

