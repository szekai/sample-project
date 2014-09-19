/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sky.logger;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author szekai
 */
public class MyApp1 {
  final static Logger logger = LoggerFactory.getLogger(MyApp1.class);

  public static void main(String[] args) {
    logger.info("Entering application.");
// assume SLF4J is bound to logback in the current environment
//    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    // print logback's internal status
//    StatusPrinter.print(lc);
    
    CommonLogging foo = new CommonLogging();
    foo.doIt();
    
    Log4j bar = new Log4j();
    bar.doIt();
    bar.doFatal();
    JUL j = new JUL();
    j.doIt();
    logger.error("throw error");
    logger.info("Exiting application.");
  }
}
