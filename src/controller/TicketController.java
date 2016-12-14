package controller;

import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.Customer;
import model.PeopleBag;
import model.Ticket;
import view.Pane4BuyATicket;
import view.Pane4Customer;

import static java.lang.Math.abs;

/**
 * Created by Kitcatski on 12/13/2016.
 */
public class TicketController {

    public TicketController(Pane4BuyATicket pane4BuyATicket, Pane4Customer pane4Customer, PeopleBag peopleBag, Stage stage) {

        pane4BuyATicket.getReturnButton().setOnAction(e -> {
            stage.close();
            stage.setScene(pane4Customer.getScene());
            stage.centerOnScreen();
            stage.show();
        });
        pane4BuyATicket.getBuyATicketButton().setOnAction(e -> {
                    if (pane4BuyATicket.getTicket1().isSelected() == false && pane4BuyATicket.getTicket2().isSelected() == false &&
                            pane4BuyATicket.getTicket3().isSelected() == false && pane4BuyATicket.getTicket4().isSelected() == false) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Please select a ticket");
                        alert.showAndWait();
                    } else {
                        String name = pane4Customer.getCustomerName().getText();
                        String username = name.substring(name.indexOf("|") + 1);
                        username = username.trim();
                        Customer customer = (Customer) peopleBag.findByUsername(username);
                        int total = customer.getReceipt().getTicketBag().getNElms();
                        int numOfTickets = customer.getReceipt().getTicketBag().getNElms();
                        checkTheBoxes(pane4BuyATicket, numOfTickets, customer);
                        customer.getReceipt().getTicketBag().display();
                        pane4BuyATicket.getTicket1().setSelected(false);
                        pane4BuyATicket.getTicket2().setSelected(false);
                        pane4BuyATicket.getTicket3().setSelected(false);
                        pane4BuyATicket.getTicket4().setSelected(false);
                        total = abs(total - customer.getReceipt().getTicketBag().getNElms());
                        System.out.println(numOfTickets);
                        System.out.println(total);
                        System.out.println(customer.getReceipt().getTotal());
                        successAlert(total, customer.getReceipt().getTotal());
                        peopleBag.writeFile();


                    }
                }

        );
    }

    public void tooManyTickets() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Error");
        alert.setContentText("You have the maximum number of tickets allowed.");
        alert.showAndWait();
    }
    public void successAlert(int numOfTickets, int total){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success!");
        alert.setContentText(numOfTickets + " tickets have been added to your total\n" +"Your current total is $" +total);
        alert.showAndWait();
    }

    public void checkTheBoxes(Pane4BuyATicket pane4BuyATicket, int numOfTickets, Customer customer) {

        if (pane4BuyATicket.getTicket1().isSelected()) {
            if ((numOfTickets) + 1 >= 10) {
                tooManyTickets();
                return;
            } else {
                Ticket t = new Ticket("Khalid Event", 150, "12/5/16");
                customer.getReceipt().addToTotal(t);

                customer.getReceipt().getTicketBag().add(t);
            }
        }
        if (pane4BuyATicket.getTicket2().isSelected()) {
            if ((numOfTickets) + 1 >= 10) {
                tooManyTickets();
                return;
            } else {
                Ticket t = new Ticket("DJ Fox Event", 200, "12/10/16");
                customer.getReceipt().addToTotal(t);

                customer.getReceipt().getTicketBag().add(t);
            }
        }
        if (pane4BuyATicket.getTicket3().isSelected()) {
            if ((numOfTickets) + 1 >= 10) {
                tooManyTickets();
                return;
            } else {

                Ticket t = new Ticket("Tupac Event", 1000, "12/11/16");
                customer.getReceipt().addToTotal(t);

                customer.getReceipt().getTicketBag().add(t);
            }
        }
        if (pane4BuyATicket.getTicket4().isSelected()) {
            if ((numOfTickets) + 1 >= 10) {
                tooManyTickets();
                return;
            } else {
                Ticket t = new Ticket("The Akinator Event", 5, "12/5/16");
                customer.getReceipt().addToTotal(t);

                customer.getReceipt().getTicketBag().add(t);
            }
        }
    }
}
