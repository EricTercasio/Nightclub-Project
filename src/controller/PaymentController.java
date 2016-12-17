package controller;

import javafx.stage.Stage;
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
            
        });
    }
}
