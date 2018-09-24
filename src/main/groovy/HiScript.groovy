import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity
import org.grails.datastore.mapping.core.DatastoreUtils
import org.grails.datastore.mapping.transactions.SessionHolder
import org.grails.orm.hibernate.GrailsSessionContext
import org.grails.orm.hibernate.HibernateDatastore

println "hi,gorm!"

@Entity
class Person implements GormEntity<Person> {
    String firstName
    String lastName
    static constraints = {
        firstName blank: false
        lastName blank: false, size: 1..3
    }
}

Map configuration = [
        'hibernate.hbm2ddl.auto': 'create-drop',
        'dataSource.url'        : 'jdbc:h2:mem:myDB'
]

HibernateDatastore datastore = new HibernateDatastore(configuration, Person)

Person.withNewSession {
    new Person(firstName: "Jack", lastName: "Yan").save(flush: true)
    println Person.list()
}



