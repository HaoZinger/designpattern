package com;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月02日21:20
 *
 */
public class Persion {
    private String name;

    private Integer age;

    public Persion(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Persion() {
    }
}
