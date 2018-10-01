package ${packageName}

import grace.datastore.entity.Entity

/**
 * ${simpleName}
 */
class ${simpleName} implements Entity<Book> {
    long id
    String title
    Date publishAt = new Date()

    static transients = []
    static mapping = [:]
    static constraints = {
        title nullable: true, blank: true, size: 1..5 comment '字符串长度要处于 1 到 5 之间'
    }
}

