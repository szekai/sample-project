/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sky.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



/**
 *
 * @author szekai
 */
public class CommonLogging {
  Log logger = LogFactory.getLog(CommonLogging.class);
  public void doIt() {
    logger.debug("Did it again!");
  }
}
