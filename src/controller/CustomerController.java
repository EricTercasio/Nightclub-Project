package controller;
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
            //stage.setScene(pane4ViewMenu.getScene());
        });

        pane4Customer.getReceiptButton().setOnAction(e->{
            //stage.setScene(pane4ViewReceipt.getScene());
        });
        pane4Customer.getLogoutButton().setOnAction(e->{
            stage.close();
            stage.setScene(pane4Login.getScene());
            stage.show();
        });
    }

}
