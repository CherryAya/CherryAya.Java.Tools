package top.kagurayayoi.cherryaya.java.tools.logger;

import org.junit.Test;

public class LoggerTest {

    @Test
    public void Output(){
        final String logtag = "Test";
        Logger.setLoggerLevel(loggerLevel.Debug);
        Logger.Debug(this.getClass(), logtag, "Debug");
        Logger.Info(this.getClass(), logtag,"Info");
        Logger.Warn(this.getClass(), logtag, "Warn");
        Logger.Exception(this.getClass(), logtag, "Exception");
        Logger.Fatal(this.getClass(), logtag, "Fatal");
    }

}
