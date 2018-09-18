import grace.app.GraceServer

class Application {
    public static void main(String[] args) {
        new GraceServer().startApp(new File('grace-web'))
    }
}
