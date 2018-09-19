import grace.app.GraceApp
import groovy.transform.CompileStatic

@CompileStatic
class HelloWorld {
    void sayHi(){
        println("Hello World ff cvfffff!")
    }

    public static void main(String[] args) {
        new HelloWorld().sayHi()
    }
}
