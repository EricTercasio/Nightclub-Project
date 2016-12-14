package controller;

import javafx.stage.Stage;
import model.PeopleBag;
import view.Pane4Customer;
import view.Pane4ViewMenu;

/**
 * Created by Kitcatski on 12/14/2016.
 */
public class MenuController {

    public MenuController(Pane4ViewMenu pane4ViewMenu, Pane4Customer pane4Customer, Stage stage, PeopleBag peopleBag){
            pane4ViewMenu.getReturnButton().setOnAction(e->{
                stage.close();
                stage.setScene(pane4Customer.getScene());
                stage.show();
            });

    }
}
