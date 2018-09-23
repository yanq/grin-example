import io.undertow.servlet.api.DeploymentInfo

/**
 * 引导
 * 启动时，初始化一些东西。如添加自己的 servlet，filter等。
 */
class BootStrap {

    def init = { DeploymentInfo deploymentInfo ->
        //println("this is a bootstrap $deploymentInfo")
    }
}
