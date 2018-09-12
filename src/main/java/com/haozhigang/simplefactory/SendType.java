package com.haozhigang.simplefactory;

/**
 * @author Haozhigang
 * <p>
 * 2018年09月13日00:52
 */
public enum SendType {
    QQ(1, "QQ消息"), WeChat(2, "WeChat消息"),

    SMS(3, "SMS消息");

    private Integer type;

    private String content;

    @Override
    public String toString() {
        return "SendType{" + "type=" + type + ", content='" + content + '\'' + '}';
    }

    SendType(Integer type, String content) {
        this.type = type;
        this.content = content;
    }

}
