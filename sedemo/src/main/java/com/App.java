package com;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        //        lambda();
        cloneObject();

    }

    private static void cloneObject() throws IOException, ClassNotFoundException {
        User user = new User();
        user.setId("1");
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "TOM");
        map.put("age", 12);
        user.setExt(map);
        Dog dog1 = new Dog();
        dog1.setName("JHHH");
        user.setDog(dog1);
        User usercopy = new User();
        BeanUtils.copyProperties(user, usercopy);
        User shadowClone = new User();
        try {
            shadowClone = (User) user.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Dog dog = new Dog();
        dog.setName("wang");
        user.setDog(dog);
        user.setId("2");
        user.getExt().put("sex", 1);
        usercopy.setDog(new Dog());
        usercopy.getExt().put("tall", 150);

        Object json = JSONObject.toJSON(user);
        User user1 = JSONObject.toJavaObject((JSON) json, User.class);

        User o = deepCloneWithSerializable(user);
        user.getExt().put("json", 000);
        user.getExt().put("weight", 123);
        System.out.println("user" + user);
        System.out.println("\nusercopy" + usercopy);
        System.out.println("\nshadowclone" + shadowClone);
        System.out.println("\nserializable" + o);
        System.out.println("\njson" + user1);
    }

    private static User deepCloneWithSerializable(User user) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(baos);
        objectOutputStream.writeObject(user);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(bais);
        return (User) objectInputStream.readObject();
    }

    private static void lambda() {
        Arrays.asList("2", "1", "3", "6", "5", "9").forEach(e -> {
            System.out.print(e + "\t");
        });
        List<String> list = Arrays.asList("2", "1", "3", "6", "5", "9");
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(list);
        System.out.println(list.stream().filter(e -> e.compareTo("2") >= 0).count());
        list.stream().sorted().mapToInt((x -> Integer.parseInt(x))).forEach(System.out::println);
        System.out.println(list.parallelStream().sorted().reduce((s1, s2) -> s1 + 10));
    }
}
