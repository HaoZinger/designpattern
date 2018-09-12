package com.haozhigang.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月13日01:09
 */
public class main {

    private static Logger logger = LoggerFactory.getLogger(main.class);

    public static void main(String[] args) {
        IMessageSender messageSender = MessageSendFactory.getSender(SendType.QQ);
        messageSender.sendMessage("QQ content");
        IMessageSender messageSender1 = MessageSendFactory.getSender(SendType.SMS);
        messageSender1.sendMessage("SMS content");
        IMessageSender messageSender2 = MessageSendFactory.getSender(SendType.WeChat);
        messageSender2.sendMessage("WeChat content");
    }
}
