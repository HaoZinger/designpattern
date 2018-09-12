package com.haozhigang.simplefactory;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月13日00:47
 */
public class MessageSendFactory {

    static IMessageSender getSender(SendType type) {
        IMessageSender messagesender;
        switch (type) {
            case QQ:
                messagesender = new QQMessageSender();
                break;
            case SMS:
                messagesender = new SMSMessageSender();
                break;
            case WeChat:
                messagesender = new WeChatMessageSender();
                break;
            default:
                throw new IllegalArgumentException("传入消息类型不匹配");
        }
        return messagesender;
    }
}


