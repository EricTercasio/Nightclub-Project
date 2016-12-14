package controller;

import javafx.stage.Stage;
import model.Customer;
import model.PeopleBag;
import model.Ticket;
import view.Pane4BuyATicket;
import view.Pane4Customer;

/**
 * Created by Kitcatski on 12/13/2016.
 */
public class TicketController {
    public TicketController(Pane4BuyATicket pane4BuyATicket, Pane4Customer pane4Customer, PeopleBag peopleBag, Stage stage){
        pane4BuyATicket.getReturnButton().setOnAction(e->{
            stage.close();
            stage.setScene(pane4Customer.getScene());
            stage.centerOnScreen();
            stage.show();
        });
        pane4BuyATicket.getBuyATicketButton().setOnAction(e->{
            String name = pane4Customer.getCustomerName().getText();
            String username = name.substring(name.indexOf("|")+1);
            username = username.trim();
            Customer customer = (Customer)peopleBag.findByUsername(username);
            int total = 0;
            if(pane4BuyATicket.getTicket1().isSelected()){
                Ticket t = new Ticket("Khalid Event",150,"12/5/16");
                total += t.getCost();
                customer.getReceipt().getTicketBag().add(t);
            }
            if(pane4BuyATicket.getTicket2().isSelected()){
                Ticket t = new Ticket("DJ Fox Event",20,"12/10/16");
                total += t.getCost();
                customer.getReceipt().getTicketBag().add(t);
            }
            if(pane4BuyATicket.getTicket3().isSelected()){
                Ticket t = new Ticket("Tupac Event",1000,"12/11/16");
                total += t.getCost();
                customer.getReceipt().getTicketBag().add(t);
            }
            if(pane4BuyATicket.getTicket4().isSelected()){
                Ticket t = new Ticket("The Akinator Event",5,"12/5/16");
                total += t.getCost();
                customer.getReceipt().getTicketBag().add(t);
            }
            customer.getReceipt().addToTotal(total);

            customer.getReceipt().getTicketBag().display();

        });
    }
}
