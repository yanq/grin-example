import grace.app.GraceApp
import grace.app.GraceServer
import grace.generate.Generator

class Application {
    public static void main(String[] args) {
        new GraceServer().startApp(new File('grace-web'))
        //new GraceServer().startApp()
//        GraceApp.setRoot(new File('grace-web'))
//        Generator.controller("HiT2")
    }
}
