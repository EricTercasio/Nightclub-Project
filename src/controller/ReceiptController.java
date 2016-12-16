package controller;

import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Customer;
import model.PeopleBag;
import view.Pane4Customer;
import view.Pane4ViewReceipt;

/**
 * Created by Kitcatski on 12/16/2016.
 */
public class ReceiptController {

    public ReceiptController(Pane4ViewReceipt pane4ViewReceipt, Pane4Customer pane4Customer, PeopleBag peopleBag, Stage stage) {

            pane4ViewReceipt.getReturnButton().setOnAction(e -> {
                stage.setScene(pane4Customer.getScene());
                pane4ViewReceipt.getTicketBox().getChildren().remove(1,pane4ViewReceipt.getTicketBox().getChildren().size());
                pane4ViewReceipt.getTableBox().getChildren().remove(1,pane4ViewReceipt.getTableBox().getChildren().size());
                pane4ViewReceipt.getFoodAndDrinkBox().getChildren().remove(1,pane4ViewReceipt.getFoodAndDrinkBox().getChildren().size());

            });

    }
    }

