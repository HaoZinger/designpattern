package com;

import java.io.Serializable;

/**
 *
 *
 * @author Haozhigang
 *
 * @date 2019年07月24日15:12
 *
 */
public class Dog implements Serializable {

    private static final long serialVersionUID = 2667982669469428844L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
