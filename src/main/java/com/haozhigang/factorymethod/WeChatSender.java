package com.haozhigang.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月14日00:20
 */
public class WeChatSender implements IMessageSender {
    private static Logger logger = LoggerFactory.getLogger(WeChatSender.class);

    @Override
    public void sendMsg(String content) {
        logger.info("msg [{}] send from WeChat", content);
    }
}
