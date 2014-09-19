/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sky.logger;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author szekai
 */
public class JUL {
    Logger logger = Logger.getLogger(JUL.class.getName());
  public void doIt() {
    logger.log(Level.INFO,"Did it again!");
  }
}
