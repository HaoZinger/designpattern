package com.haozhigang.factorymethod;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月14日00:26
 */
public class main {
    public static void main(String[] args) {
        IMessageSendFactory factory = new QQMessageSendFactory();
        IMessageSender sender = factory.createSender();
        sender.sendMsg("content in QQ");

        IMessageSendFactory factory1 = new SMSMessageSendFactory();
        IMessageSender sender1 = factory1.createSender();
        sender1.sendMsg("content in SMS");

        IMessageSender sender2 = new WeChatMessageSendFactory().createSender();
        sender2.sendMsg("content in WeChat");
    }
}
