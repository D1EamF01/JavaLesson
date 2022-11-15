package com.d1eamf01._2022_11_15.test02.shop;

import java.util.Scanner;

public class Commodity {
    private String name;
    private int amount;
    private int number;

    public static Commodity createCommodity(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入商品名称: ");
        String tempName = sc.next();
        System.out.printf("请输入商品价格: ");
        int tempAmount = sc.nextInt();
        System.out.printf("请输入商品数量: ");
        int tempNumber = sc.nextInt();
        return new Commodity(tempName,tempAmount,tempNumber);
    }

    @Override
    public String toString() {
        return "商品名为：" +
                name + "\n单件商品价格为：" + amount
                + "\n共有" + number +
                "件";
    }

    public Commodity() {
    }

    public Commodity(String name, int amount, int number) {
        this.name = name;
        this.amount = amount;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
