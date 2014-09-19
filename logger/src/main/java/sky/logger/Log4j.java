/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sky.logger;

import org.apache.log4j.Logger;

/**
 *
 * @author szekai
 */
public class Log4j {

    Logger logger = Logger.getLogger(Log4j.class);

    public void doIt() {
        logger.debug("Did it again!");
    }

    public void doFatal() {
        logger.fatal("this is fatal");
    }
}
