package com.haozhigang.factorymethod;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月14日00:14
 */
public class QQMessageSendFactory implements IMessageSendFactory {
    @Override
    public IMessageSender createSender() {
        return new QQSender();
    }
}
