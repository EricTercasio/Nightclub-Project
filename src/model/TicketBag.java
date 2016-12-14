package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/29/2016.
 */
public class TicketBag implements Serializable {
    int nElms;
    Ticket[] ticket;


    public TicketBag() {
        nElms = 0;
        this.ticket = new Ticket[4];
    }

    public void add(Ticket t) {
        ticket[nElms] = t;
        nElms++;

    }

    public boolean delete(Ticket value) {
        int j;
        for (j = 0; j < nElms; j++) {
            if (ticket[j] == value) {
                break;
            }
        }

        if (j == nElms) {
            return false;
        } else {
            for (int k = j; k < nElms - 1; k++) {
                ticket[k] = ticket[k + 1];

            }
            nElms--;
            return true;
        }
    }

    public Ticket findByEventName(String eventName) {
        int i;
        for (i = 0; i < nElms; i++) {
            if (ticket[i].getEventName().equals(eventName)) return ticket[i];
        }
        return null;
    }

    public int getNElms() {
        return nElms;
    }

    public void display() {
        for (int i = 0; i < nElms; i++) {
            System.out.println(ticket[i]);
        }
    }
}

