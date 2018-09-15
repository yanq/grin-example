class GunConsole {
    def start(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        while (true){
            println("输入命令 >")
            String line = reader.readLine()
            println("Line : $line")
            if (line.equals('exit')){
                println('exit ...')
                break
            }else {
                println('do something ...')
            }
        }
    }

    public static void main(String[] args) {
        new GunConsole().start()
    }
}
