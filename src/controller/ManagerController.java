package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import model.*;
import view.Pane4Login;
import view.Pane4Manager;


/**
 * Created by Kitcatski on 11/10/2016.
 */
public class ManagerController {

    public ManagerController(Pane4Manager pane4Manager, Pane4Login pane4Login, PeopleBag peopleBag, Stage stage) {
        Employee employee = new Employee(null,null,null,null,null,null,null,null,null);
        Person[] people = peopleBag.getPeople();
        ComboBox<String> box = pane4Manager.getPeopleBox();
        setComboBox(box,pane4Manager,peopleBag,people);
       pane4Manager.getAddEmployeeButton().setOnAction(e->{
           pane4Manager.getCreateEmployeePane().setVisible(true);
       });
       pane4Manager.getPane4CreateAccount().getCreateButton().setOnAction(e ->{
           System.out.println(pane4Manager.getPane4CreateAccount().getFirstNameField().getText());
           employee.setFirstName(pane4Manager.getPane4CreateAccount().getFirstNameField().getText());
           employee.setLastName(pane4Manager.getPane4CreateAccount().getLastNameField().getText());
           employee.setUsername(pane4Manager.getPane4CreateAccount().getUsernameField().getText());
           employee.setPassword(pane4Manager.getPane4CreateAccount().getPasswordField().getText());
           employee.setHomeAddress(new HomeAddress(pane4Manager.getPane4CreateAccount().getStreetField().getText()
                   ,pane4Manager.getPane4CreateAccount().getCityField().getText()
                   ,pane4Manager.getPane4CreateAccount().getStateComboBox().getSelectionModel().getSelectedItem()
                   ,pane4Manager.getPane4CreateAccount().getZipField().getText()));
           employee.setPhoneNumber(pane4Manager.getPane4CreateAccount().getPhoneNumberField().getText());
           employee.setPosition(pane4Manager.getPositionField().getText());
           employee.setSalary(pane4Manager.getSalaryField().getText());
           employee.setSchedule(new Schedule(pane4Manager.getSundayField().getText(),pane4Manager.getMondayField().getText()
                   ,pane4Manager.getTuesdayField().getText(),pane4Manager.getWednesdayField().getText(),pane4Manager.getThursdayField().getText()
                   ,pane4Manager.getFridayField().getText(),pane4Manager.getSaturdayField().getText() ));
           peopleBag.add(employee);
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setContentText("Employee Account created!");
           alert.setHeaderText("Congratulations!");
           alert.setTitle("Employee Account created");
           alert.showAndWait();
           //Clear out the fields
           pane4Manager.getPane4CreateAccount().getFirstNameField().clear();
           pane4Manager.getPane4CreateAccount().getLastNameField().clear();
           pane4Manager.getPane4CreateAccount().getUsernameField().clear();
           pane4Manager.getPane4CreateAccount().getPasswordField().clear();
           pane4Manager.getPane4CreateAccount().getCityField().clear();
           pane4Manager.getPane4CreateAccount().getStreetField().clear();
           pane4Manager.getPane4CreateAccount().getStateComboBox().getSelectionModel().clearSelection();
           pane4Manager.getPane4CreateAccount().getZipField().clear();
           pane4Manager.getPane4CreateAccount().getPhoneNumberField().clear();
           pane4Manager.getSalaryField().clear();
           pane4Manager.getPositionField().clear();
           pane4Manager.getSundayField().clear();
           pane4Manager.getMondayField().clear();
           pane4Manager.getTuesdayField().clear();
           pane4Manager.getWednesdayField().clear();
           pane4Manager.getThursdayField().clear();
           pane4Manager.getFridayField().clear();
           pane4Manager.getSaturdayField().clear();
           //Clears out the create employee pane
           pane4Manager.getCreateEmployeePane().setVisible(false);
           //Delete this
           System.out.println(employee.getFirstName());
           System.out.println(employee.getLastName());
           System.out.println(employee.getUsername());
           System.out.println(employee.getPassword());
           System.out.println(employee.getHomeAddress().getStreet());
           System.out.println(employee.getHomeAddress().getCity());
           System.out.println(employee.getHomeAddress().getState());
           System.out.println(employee.getHomeAddress().getZip());
           System.out.println(employee.getPhoneNumber());
           System.out.println(employee.getPosition());
           System.out.println(employee.getSalary());
           System.out.println(employee.getSchedule());
           box.getItems().removeAll(box.getItems());        //Removes all items from comboBox
           setComboBox(box,pane4Manager,peopleBag,people);  //Updates comboBox with new employee
       });
        pane4Manager.getLogOutButton().setOnAction(e->{
            stage.setScene(pane4Login.getScene());
        });

    }
    public void setComboBox(ComboBox<String> box, Pane4Manager pane4Manager, PeopleBag peopleBag, Person[] people){
        int i;
        box = pane4Manager.getPeopleBox();
        for (i = 0; i < peopleBag.getNElms() ; i++) {
            if(people[i] instanceof Employee) {
                box.getItems().addAll(people[i].getFirstName() + "  ID: " + people[i].getIdNumber());
            }
        }

    }
}
