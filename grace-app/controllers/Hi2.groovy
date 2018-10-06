import grace.generate.Generator
import yan.practise.Book

//def content = Generator.generate(new File('D:\\IdeaProjects\\grace-dev\\grace-web\\grace-app\\templates\\index.html'), [entityClass: Book])
//println content
//
//def entityClass = Book
//def out = []
//
//int i = 0
//entityClass.props.each {
//    if (i == 0) {
//        def p = "${grace.util.ClassUtil.propertyName(entityClass)}.${it}"
//        out << "<td><a href=\"#\" th:text=\"\${${p}}\" th:href=\"|show/\${${p}}|\">PropertyValue</a></td> \n"
//    } else {
//        out << " <td th:text=\"\${${p}\">PropertyValue</td> \n "
//    }
//}
//
//println(out)