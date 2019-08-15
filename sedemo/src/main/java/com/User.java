package com;

import java.io.Serializable;
import java.util.Map;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月26日21:39
 *
 */

public class User implements Cloneable, Serializable {

    private static final long serialVersionUID = 1615923637562036191L;

    private String id;

    private String guid;

    private Map<String, Object> ext;

    private Dog dog;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", ext=").append(ext);
        sb.append(", dog=").append(dog);
        sb.append('}');
        return sb.toString();
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getExt() {
        return ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        if (this.getId() != this.getGuid()) {
            System.out.println(this.toString());
        }
        this.guid = guid;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
