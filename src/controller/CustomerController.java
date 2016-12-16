package controller;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;
import view.*;

/**
 * Created by Kitcatski on 11/9/2016.
 */
public class CustomerController {
    public CustomerController(Pane4Customer pane4Customer, Pane4Login pane4Login, PeopleBag peopleBag, Pane4BuyATicket pane4BuyATicket,
                              Pane4BuyATable pane4BuyATable, Pane4ViewMenu pane4ViewMenu, Pane4ViewReceipt pane4ViewReceipt, Stage stage){
        //pane4Customer.getCustomerName().setText("Eric");

        pane4Customer.getTicketButton().setOnAction(e->{
            stage.close();
            stage.setScene(pane4BuyATicket.getScene());
            stage.centerOnScreen();
            stage.show();
        });

        pane4Customer.getTableButton().setOnAction(e->{
            stage.setScene(pane4BuyATable.getScene());
        });
        pane4Customer.getFoodButton().setOnAction(e->{
            stage.setScene(pane4ViewMenu.getScene());
        });

        pane4Customer.getReceiptButton().setOnAction(e-> {
            stage.setScene(pane4ViewReceipt.getScene());
            String name = pane4Customer.getCustomerName().getText();
            String username = name.substring(name.indexOf("|") + 1);
            username = username.trim();
            Customer customer = (Customer) peopleBag.findByUsername(username);
            for(int i = 0; i <= customer.getReceipt().getTicketBag().getTickets().length; i++) {
                if (customer.getReceipt().getTicketBag().getTickets()[i] == null) {
                    break;
                } else {
                    pane4ViewReceipt.getTicketBox().getChildren().add((i + 1), new Text(
                            customer.getReceipt().getTicketBag().getTickets()[i].getEventName() + " $" +
                            customer.getReceipt().getTicketBag().getTickets()[i].getCost()));
                }
            }
            for(int i = 0; i <= customer.getReceipt().getTableBag().getTable().length; i++) {
                if (customer.getReceipt().getTableBag().getTable()[i] == null) {
                    break;
                } else {
                    pane4ViewReceipt.getTableBox().getChildren().add((i + 1), new Text("Table number " +
                            String.valueOf(customer.getReceipt().getTableBag().getTable()[i].getTableNumber()) + ": " +
                            String.valueOf(customer.getReceipt().getTableBag().getTable()[i].getSeats()) +" seats $" +
                            String.valueOf(customer.getReceipt().getTableBag().getTable()[i].getCost())));
                }
            }
            for(int i = 0; i <= customer.getReceipt().getFoodBag().getFood().length; i++) {
                if (customer.getReceipt().getFoodBag().getFood()[i] == null) {
                    break;
                } else {
                    pane4ViewReceipt.getFoodAndDrinkBox().getChildren().add((i + 1), new Text(
                            customer.getReceipt().getFoodBag().getFood()[i].getName() + " $" +
                            customer.getReceipt().getFoodBag().getFood()[i].getPrice()));
                }
            }
            pane4ViewReceipt.getTotal().setText("Total: $"+ customer.getReceipt().getTotal());




                });


        pane4Customer.getLogoutButton().setOnAction(e->{
            stage.close();
            stage.setScene(pane4Login.getScene());
            stage.show();
        });
    }

}
