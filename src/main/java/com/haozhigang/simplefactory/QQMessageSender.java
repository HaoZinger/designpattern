package com.haozhigang.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Haozg
 * <p>
 * 2018年09月13日00:36
 */
public class QQMessageSender implements IMessageSender {
    static Logger logger = LoggerFactory.getLogger(QQMessageSender.class);

    @Override
    public void sendMessage(String msg) {
        logger.info("message {} sent to QQ~~ ", msg);
    }
}
