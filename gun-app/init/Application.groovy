import groovy.util.logging.Slf4j
import gun.app.GunApp
import gun.app.GunServer

/**
 * 启动
 * 此类只是方便开发调试使用。不作为正式运行环境启动入口。
 */
@Slf4j
class Application {
    public static void main(String[] args) {
        GunApp.init() // 这里是为了初始化一下，如果不的话，会在第一次用到这个的时候初始化
        new GunServer().start()
    }
}
