package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/21/2016.
 */
public class Food implements Serializable{
    private String name;
    private int price;
    public Food(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
