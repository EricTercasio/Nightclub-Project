package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/21/2016.
 */
public class Table implements Serializable{

    private int tableNumber;
    private int seats;
    private int cost;

    public Table(int tableNumber, int seats, int cost) {
        this.tableNumber = tableNumber;
        this.seats = seats;
        this.cost = cost;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", seats=" + seats +
                ", cost='" + cost + '\'' +
                '}';
    }
}
