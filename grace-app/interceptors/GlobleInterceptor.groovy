import static grace.route.Routes.before

before('**') {
    log.info("request : $request.requestURI")
}
