package org.MyHit;

import org.apache.log4j.Logger;

public class LogLog4j {


    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    // To print log during the beginning of the test case
    public static void startTestCase(String sTestCaseName) {

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

        Log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

    }

    //To print log for the ending of the test case
    public static void endTestCase(String sTestCaseName) {

        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

        Log.info("X");

        Log.info("X");

        Log.info("X");

        Log.info("X");

    }

    //Methods to call
    public static void info(String message) { Log.info(message); }

    public static void warn(String message) { Log.warn(message); }

    public static void error(String message) { Log.error(message); }

    public static void fatal(String message) { Log.fatal(message); }

    public static void debug(String message) { Log.debug(message); }

}
