package com.haozhigang.factorymethod;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月14日00:20
 */
public class SMSMessageSendFactory implements IMessageSendFactory {
    @Override
    public IMessageSender createSender() {
        return new SMSSender();
    }
}
