package com.haozhigang.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Haozg
 * <p>
 * 2018年09月13日00:41
 */
public class SMSMessageSender implements IMessageSender {
    static Logger logger = LoggerFactory.getLogger(SMSMessageSender.class);

    @Override
    public void sendMessage(String msg) {
        logger.info("message {} sent to SMS~~ ", msg);
    }
}
