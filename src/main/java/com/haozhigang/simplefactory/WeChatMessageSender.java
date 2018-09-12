package com.haozhigang.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Haozg
 * <p>
 * 2018年09月13日00:39
 */
public class WeChatMessageSender implements IMessageSender {
    static Logger logger = LoggerFactory.getLogger(WeChatMessageSender.class);

    @Override
    public void sendMessage(String msg) {
        logger.info("message {} sent to WeChat~~ ", msg);
    }
}
