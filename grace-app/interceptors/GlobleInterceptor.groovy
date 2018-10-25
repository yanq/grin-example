import grace.route.Interceptor

import static grace.route.Routes.before

before('',Interceptor.ORDER_HIGH) {
    log.info("request : $request.requestURI")
}
