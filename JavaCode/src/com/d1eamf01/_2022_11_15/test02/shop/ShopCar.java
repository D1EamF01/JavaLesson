package com.d1eamf01._2022_11_15.test02.shop;

import java.util.ArrayList;
import java.util.List;

public class ShopCar {
    private int allNumber;
    private int allAmount;

    private List<Commodity> lists;

    {
        lists = new ArrayList<>();
    }

    public void addCommodity(Commodity c){
        lists.add(c);
        allNumber += c.getNumber();
        allAmount += c.getAmount() * c.getNumber();
    }

    public Commodity removeCommodity(String name){
        for (int i = 0; i < lists.size(); i++) {
            if(lists.get(i).getName().equals(name)){
                Commodity temp = lists.get(i);
                allNumber -= temp.getNumber();
                allAmount -= temp.getAmount() * temp.getNumber();
                lists.remove(temp);
                return temp;
            }
        }
        return null;
    }

    public void showShopCar(){
        if(lists.size() <= 0){
            System.out.println("当前购物车中没有任何商品。");
            return;
        }
        else{
            for (Commodity commodity : lists) {
                System.out.println(commodity);
            }
        }
    }

    public void clearShopCar(){
        lists.clear();
    }

    public ShopCar() {
    }

    public int getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(int allNumber) {
        this.allNumber = allNumber;
    }

    public int getAllAmount() {
        return allAmount;
    }

    public void setAllAmount(int allAmount) {
        this.allAmount = allAmount;
    }

    public List<Commodity> getLists() {
        return lists;
    }

    public void setLists(List<Commodity> lists) {
        this.lists = lists;
    }
}
