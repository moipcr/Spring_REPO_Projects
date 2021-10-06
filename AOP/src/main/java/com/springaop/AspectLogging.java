package com.springaop;

import java.util.logging.Logger;

public class AspectLogging {

    private Logger logger = Logger.getLogger(AspectLogging.class.getName());

    public void before(){
        logger.info("Entering method: ");
    }

    public void after(){
        logger.info("Exiting method: ");
    }
}
