import grace.app.GraceApp
import grace.app.GraceServer
import grace.generate.Generator

/**
 * 启动
 * 此类只是方便开发调试使用。不作为正式运行环境启动入口。
 */
class Application {
    public static void main(String[] args) {
        new GraceServer().startApp(new File('grace-web'))
        // new GraceServer().startApp(new File('grace-web'),'prod')
        //new GraceServer().startApp()
//        GraceApp.setRootAndEnv(new File('grace-web'))
//        Generator.controller("HiT2")
    }
}
