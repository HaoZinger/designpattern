package com.haozhigang.factorymethod;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月14日00:07
 */
public interface IMessageSendFactory {
    IMessageSender createSender();
}
