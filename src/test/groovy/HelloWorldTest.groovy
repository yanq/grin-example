class HelloWorldTest extends GroovyTestCase {
    void testSayHi() {
        assertScript '''
                               class HelloA {
                                    void sayHi(){
                                        println("Hello World !")
                                    }
                                }
                                
                                new HelloA().sayHi()
                            '''
    }
}
