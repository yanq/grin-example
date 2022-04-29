import groovy.util.logging.Slf4j
import gun.app.GunApp
import gun.app.GunServer

/**
 * 启动 APP
 */
@Slf4j
class Application {
    public static void main(String[] args) {
        // GunApp.init() // 需要配置特定路径和环境的时候启用
        GunApp.instance.startServer(new GunServer())
    }
}
