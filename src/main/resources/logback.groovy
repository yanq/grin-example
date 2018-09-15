import ch.qos.logback.classic.Level
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.status.OnConsoleStatusListener

//statusListener(OnConsoleStatusListener)

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%21.-21thread] %-5level %-30.30logger{29} - %msg%n"
    }
}

//def USER_HOME = System.getProperty("user.home")
//println(USER_HOME)
//appender("FILE", FileAppender) {
//    // make use of the USER_HOME variable
//    file = "${USER_HOME}/words.log"
//    encoder(PatternLayoutEncoder) {
//        pattern = "%d{HH:mm:ss.SSS} [%21.-21thread] %-5level %-30.30logger{29} - %msg%n"
//    }
//}

//root(INFO, ["CONSOLE","FILE"])
root(DEBUG, ["CONSOLE"])
//logger('yan.english.dict', Level.WARN)