package com.marklogic.clientutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LoggingObject {

    protected final Logger logger = LoggerFactory.getLogger(getClass());
}
