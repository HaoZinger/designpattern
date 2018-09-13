package com.haozhigang.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月14日00:15
 */
public class QQSender implements IMessageSender {
    private static Logger logger = LoggerFactory.getLogger(QQSender.class);

    @Override
    public void sendMsg(String content) {
        logger.info("msg [{}] send from QQ", content);
    }
}
