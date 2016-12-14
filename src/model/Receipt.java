package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/28/2016.
 */
public class Receipt implements Serializable{
    private FoodBag foodBag;
    private TableBag tableBag;
    private TicketBag ticketBag;
    private int total;

    public Receipt(FoodBag foodBag, TableBag tableBag, TicketBag ticketBag, int total){
        this.foodBag = foodBag;
        this.tableBag = tableBag;
        this.ticketBag = ticketBag;


    }

    public void addToTotal(Food f) {
        total += f.getPrice();
    }
    public void addToTotal(Table t) {
        total += t.getCost();
    }
    public void addToTotal(Ticket t){
        total += t.getCost();
    }
    public void addToTotal(int t){total += t;}
    public int getTotal() {
        return total;
    }

    public FoodBag getFoodBag() {
        return foodBag;
    }

    public TableBag getTableBag() {
        return tableBag;
    }

    public TicketBag getTicketBag() {
        return ticketBag;
    }

}



