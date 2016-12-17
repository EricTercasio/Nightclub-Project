package controller;

import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.Customer;
import model.PeopleBag;
import view.Pane4Customer;
import view.Pane4Payment;
import view.Pane4ViewReceipt;

/**
 * Created by Eric on 12/16/2016.
 */
public class PaymentController {
    public PaymentController(Pane4Payment pane4Payment, Pane4Customer pane4Customer, Pane4ViewReceipt pane4ViewReceipt, PeopleBag peopleBag, Stage stage){
        pane4Payment.getReturnButton().setOnAction(e->{
            stage.setScene(pane4ViewReceipt.getScene());
        });
        pane4Payment.getSubmitButton().setOnAction(e->{
            String name = pane4Customer.getCustomerName().getText();
            String username = name.substring(name.indexOf("|") + 1);
            username = username.trim();
            Customer customer = (Customer) peopleBag.findByUsername(username);
            System.out.println(username);
            customer.getReceipt().getFoodBag().deleteAllFood();
            customer.getReceipt().getTicketBag().deleteAllTickets();
            customer.getReceipt().getTableBag().deleteAllTables();
            customer.getReceipt().setTotal(0);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Payment Complete");
            alert.showAndWait();
            pane4ViewReceipt.getTicketBox().getChildren().remove(1,pane4ViewReceipt.getTicketBox().getChildren().size());
            pane4ViewReceipt.getTableBox().getChildren().remove(1,pane4ViewReceipt.getTableBox().getChildren().size());
            pane4ViewReceipt.getFoodAndDrinkBox().getChildren().remove(1,pane4ViewReceipt.getFoodAndDrinkBox().getChildren().size());
            stage.setScene(pane4Customer.getScene());


        });
    }
}
