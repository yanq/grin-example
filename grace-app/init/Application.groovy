import grace.app.GraceApp
import grace.app.GraceServer
import grace.generate.Generator
import org.codehaus.groovy.runtime.InvokerHelper

/**
 * 启动
 * 此类只是方便开发调试使用。不作为正式运行环境启动入口。
 */
class Application {
    public static void main(String[] args) {
        // GraceApp.setRootAndEnv(new File('grace-example'),GraceApp.ENV_DEV)
        // new GraceServer().startApp()
        InvokerHelper.runScript(HiSimple)
    }
}
