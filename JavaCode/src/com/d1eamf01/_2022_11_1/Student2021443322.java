package com.d1eamf01._2022_11_1;

public class Student2021443322 {
    private String name;
    private int age;
    public void speak(){
        System.out.println("我的名字是：" + name + "年龄为：" + age + "岁。");
    }

    public Student2021443322() {
    }

    public Student2021443322(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 70)
            this.age = age;
        else
            System.out.println("名字不合法!");
    }
}
