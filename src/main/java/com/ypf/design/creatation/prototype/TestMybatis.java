package com.ypf.design.creatation.prototype;


import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 17:02
 **/

public class TestMybatis {
    private static Map<String, User> userCache = new HashMap<>();

    public  User getUser(String username) throws CloneNotSupportedException {
        System.out.println("查对象");
        if (!userCache.containsKey(username)) {
            System.out.println("从缓存中读取");
           return getFromDB(username);
        } else {
            User user = userCache.get(username);
            return user;
        }
    };

    private User getFromDB(String username) throws CloneNotSupportedException {
        User user = new User(username,"1");
        System.out.println("sql查对象");
        Object clone = user.clone();
        userCache.put(username, (User) clone);
        return new User(username, "2");
    }
}
