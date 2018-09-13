package com.haozhigang.factorymethod;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月14日00:21
 */
public class WeChatMessageSendFactory implements IMessageSendFactory {

    @Override
    public IMessageSender createSender() {
        return new WeChatSender();
    }
}
