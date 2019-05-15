import grace.route.Interceptor
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import static grace.route.Routes.before
Logger log = LoggerFactory.getLogger(this.class)

/**
 * 权限控制
 */

def publicControllers = ['hi','graceApp','book']
def adminControllers = []
def allControllers = publicControllers + adminControllers

before('/**', Interceptor.ORDER_HIGH) {
    log.info("access check ${request.requestURI}")

    // dumpInfos()

    if (!(controllerName in allControllers)){
        log.info("No Controller for ${controllerName} !")
        render("No Controller for ${controllerName} !")
        return false
    }

    if (controllerName in publicControllers) {
        return true
    }

    if (controllerName in adminControllers){
        if (session.user){
            return true
        }else {
            render("No Permission")
            return false
        }
    }
}

