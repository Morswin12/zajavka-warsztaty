package WARSZTATY.Warsztat_7_LOGOWANIE.P4_Logowanie_LSF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main2 {

    private static final Logger log = LoggerFactory.getLogger(Main2.class);
    public static void main(String[] args) {

        System.out.println(log.getName());
        System.out.println(log.getClass());
        //sam slf4j nie wystarczy potrzeba jeszcze drugiej biblioteki z jego implementacją pod spodem w tym przypadku mamy org.slf4j-simple.2.0.7

        // SimpleLoggera możemy też edytować używając pliku: "simplelogger.properties", który musimy utworzyć na naszym classpath-ie
        //Simple implementation of Logger that sends all enabled log messages, for all defined loggers, to the console (System.err). The following system properties are supported to configure the behavior of this logger:
        //
        //org.slf4j.simpleLogger.logFile - The output target which can be the path to a file, or the special values "System.out" and "System.err". Default is "System.err".
        //org.slf4j.simpleLogger.cacheOutputStream - If the output target is set to "System.out" or "System.err" (see preceding entry), by default, logs will be output to the latest value referenced by System.out/err variables. By setting this parameter to true, the output stream will be cached, i.e. assigned once at initialization time and re-used independently of the current value referenced by System.out/err.
        //org.slf4j.simpleLogger.defaultLogLevel - Default log level for all instances of SimpleLogger. Must be one of ("trace", "debug", "info", "warn", "error" or "off"). If not specified, defaults to "info".
        //org.slf4j.simpleLogger.log.a.b.c - Logging detail level for a SimpleLogger instance named "a.b.c". Right-side value must be one of "trace", "debug", "info", "warn", "error" or "off". When a SimpleLogger named "a.b.c" is initialized, its level is assigned from this property. If unspecified, the level of nearest parent logger will be used, and if none is set, then the value specified by org.slf4j.simpleLogger.defaultLogLevel will be used.
        //org.slf4j.simpleLogger.showDateTime - Set to true if you want the current date and time to be included in output messages. Default is false
        //org.slf4j.simpleLogger.dateTimeFormat - The date and time format to be used in the output messages. The pattern describing the date and time format is defined by SimpleDateFormat. If the format is not specified or is invalid, the number of milliseconds since start up will be output.
        //org.slf4j.simpleLogger.showThreadName -Set to true if you want to output the current thread name. Defaults to true.
        //(since version 1.7.33 and 2.0.0-alpha6) org.slf4j.simpleLogger.showThreadId - If you would like to output the current thread id, then set to true. Defaults to false.
        //org.slf4j.simpleLogger.showLogName - Set to true if you want the Logger instance name to be included in output messages. Defaults to true.
        //org.slf4j.simpleLogger.showShortLogName - Set to true if you want the last component of the name to be included in output messages. Defaults to false.
        //org.slf4j.simpleLogger.levelInBrackets - Should the level string be output in brackets? Defaults to false.
        //org.slf4j.simpleLogger.warnLevelString - The string value output for the warn level. Defaults to WARN.
        //In addition to looking for system properties with the names specified above, this implementation also checks for a class loader resource named "simplelogger.properties", and includes any matching definitions from this resource (if it exists).
        //
        //With no configuration, the default output includes the relative time in milliseconds, thread name, the level, logger name, and the message followed by the line separator for the host. In log4j terms it amounts to the "%r [%t] %level %logger - %m%n" pattern.
        //
        //Sample output follows.
        //
        // 176 [main] INFO examples.Sort - Populating an array of 2 elements in reverse order.
        // 225 [main] INFO examples.SortAlgo - Entered the sort method.
        // 304 [main] INFO examples.SortAlgo - Dump of integer array:
        // 317 [main] INFO examples.SortAlgo - Element [0] = 0
        // 331 [main] INFO examples.SortAlgo - Element [1] = 1
        // 343 [main] INFO examples.Sort - The next log statement should be an error message.
        // 346 [main] ERROR examples.SortAlgo - Tried to dump an uninitialized array.
        //   at org.log4j.examples.SortAlgo.dump(SortAlgo.java:58)
        //   at org.log4j.examples.Sort.main(Sort.java:64)
        // 467 [main] INFO  examples.Sort - Exiting main method.
        //
        //This implementation is heavily inspired by Apache Commons Logging's SimpleLog.

        try {
            method1();
        } catch (Exception e) {
            log.error("Exception was thrown", e);
        }
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        method4();
    }

    private static void method4() {
        method5();
    }

    private static void method5() {
        throw new RuntimeException("Some exception was thrown!!");
    }
}
