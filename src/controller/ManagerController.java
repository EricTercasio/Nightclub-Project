package controller;

import javafx.scene.control.ComboBox;
import model.Customer;
import model.Employee;
import model.PeopleBag;
import model.Person;
import view.Pane4Manager;


/**
 * Created by Kitcatski on 11/10/2016.
 */
public class ManagerController {

    public ManagerController(Pane4Manager pane4Manager, PeopleBag model) {

        int i;
        Person[] people = model.getPeople();

        ComboBox<String> box = pane4Manager.getPeopleBox();
        for (i = 0; i < model.getNElms() ; i++) {
            if(people[i] instanceof Employee) {
                box.getItems().addAll(people[i].getFirstName() + "  ID: " + people[i].getIdNumber());
            }
       }
       pane4Manager.getPane4CreateAccount().getCreateButton().setOnAction(e ->{
           System.out.println(pane4Manager.getPane4CreateAccount().getFirstNameField().getText());
       });

    }
}
