package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/28/2016.
 */
public class Ticket implements Serializable{
    private String eventName;
    private int cost;
    private final String ticketNumber;
    private static int idInt = 0;
    private String date;

    public Ticket(String eventName ,int cost, String date) {
        this.cost = cost;
        this.eventName = eventName;
        this.date = date;
        ticketNumber = String.valueOf(idInt++);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public static int getIdInt() {
        return idInt;
    }

    public static void setIdInt(int idInt) {
        Ticket.idInt = idInt;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "cost='" + cost + '\'' +
                ", ticketNumber=" + ticketNumber +
                '}';
    }
}
