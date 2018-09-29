import grace.controller.route.Interceptor

import static grace.controller.route.Routes.before

before('/**',Interceptor.ORDER_HIGH) {
    // log.info("request : $request.requestURI")
}
