package com.d1eamf01._2022_11_15.test03.users;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("user3", "password3");
        users.put("user4", "password4");

        System.out.println("请输入你的账户名：");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("请输入你的密码：");
        users.put(userName, sc.next());

        for (String s : users.keySet()) {
            System.out.println("用户名：" + s + "密码：" + users.get(s));
        }
    }
}
