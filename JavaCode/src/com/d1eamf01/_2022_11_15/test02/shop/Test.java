package com.d1eamf01._2022_11_15.test02.shop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ShopCar shopCar = new ShopCar();

        System.out.println("请做出你的选择:ADD,REMOVE,CLEAR,CHECK,QUIT");
        Choose choose = null;
        do {
            try {
                choose = Choose.valueOf(sc.next());

            } catch (Exception e) {
                System.out.println("输入有误，请重新输入");
                System.out.println("请做出你的选择:ADD,REMOVE,CLEAR,CHECK,QUIT");
                choose = Choose.valueOf(sc.next());
                // 只能做到一次报错后修正
            }
            switch (choose){
                case ADD:
                    shopCar.addCommodity(Commodity.createCommodity());
                    break;
                case REMOVE:
                    System.out.println("请输入你想删除的商品名称：");
                    Commodity temp = shopCar.removeCommodity(sc.next());
                    System.out.println("已删除商品：" + temp.getName() + "\n共有：" + temp.getNumber() + "件\n删除的单件商品价格为：" + temp.getAmount() + "元\n" + "删除商品总价格为：" + temp.getAmount() * temp.getNumber());
                    break;
                case CHECK:
                    shopCar.showShopCar();
                    break;
                case CLEAR:
                    shopCar.clearShopCar();
                    System.out.println("已清空购物车");
                    break;
            }
            System.out.println("请做出你的选择:ADD,REMOVE,CLEAR,CHECK,QUIT");
        }while (choose != Choose.QUIT);
    }
}