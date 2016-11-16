package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;
import view.Pane4Login;
import view.Pane4Manager;

import java.util.Optional;


/**
 * Created by Kitcatski on 11/10/2016.
 */
public class ManagerController {
        Employee employee;
    public ManagerController(Pane4Manager pane4Manager, Pane4Login pane4Login, PeopleBag peopleBag, Stage stage) {

        Person[] people = peopleBag.getPeople();
        ComboBox<String> box = pane4Manager.getPeopleBox();
        setComboBox(box,pane4Manager,peopleBag,people);

       pane4Manager.getAddEmployeeButton().setOnAction(e->{
           pane4Manager.getCreateEmployeePane().setVisible(true);
           pane4Manager.getHeaderText().setText("Adding new Employee");
           clearOutSelections(pane4Manager);
           pane4Manager.getPane4CreateAccount().getFirstNameField().setEditable(true);
           pane4Manager.getPane4CreateAccount().getLastNameField().setEditable(true);
           pane4Manager.getPane4CreateAccount().getUsernameField().setEditable(true);
           pane4Manager.getPane4CreateAccount().getPasswordField().setEditable(true);

       pane4Manager.getPane4CreateAccount().getCreateButton().setOnAction(f ->{
           employee = new Employee(null,null,null,null,null,null,null,null,null);
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
           peopleBag.writeFile();
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setContentText("Employee Account created!");
           alert.setHeaderText("Congratulations!");
           alert.setTitle("Employee Account created");
           alert.showAndWait();
           //Clear out the fields
            clearOutSelections(pane4Manager);
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
       });
        pane4Manager.getModifyEmployeeButton().setOnAction(e->{
            if(pane4Manager.getPeopleBox().getSelectionModel().getSelectedItem() == null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You must select an employee to modify");
                alert.showAndWait();
            }
            else {

                pane4Manager.getCreateEmployeePane().setVisible(true);
                pane4Manager.getPane4CreateAccount().getCreateButton().setText("Modify");
                String id = box.getSelectionModel().getSelectedItem();
                String[] parts = id.split("ID:");
                String foundAccount = parts[1].trim();
                Employee e2 = (Employee) peopleBag.findByID(foundAccount);
                pane4Manager.getHeaderText().setText("Modifying " + peopleBag.findByID(foundAccount).getFirstName()+ " " +peopleBag.findByID(foundAccount).getLastName());
                //Puts the found account's attributes into the TextFields
                pane4Manager.getPane4CreateAccount().getFirstNameField().setText(peopleBag.findByID(foundAccount).getFirstName());
                pane4Manager.getPane4CreateAccount().getFirstNameField().setEditable(false);
                pane4Manager.getPane4CreateAccount().getLastNameField().setText(peopleBag.findByID(foundAccount).getLastName());
                pane4Manager.getPane4CreateAccount().getLastNameField().setEditable(false);
                pane4Manager.getPane4CreateAccount().getUsernameField().setText(peopleBag.findByID(foundAccount).getUsername());
                pane4Manager.getPane4CreateAccount().getUsernameField().setEditable(false);
                pane4Manager.getPane4CreateAccount().getPasswordField().setText(peopleBag.findByID(foundAccount).getPassword());
                pane4Manager.getPane4CreateAccount().getPasswordField().setEditable(false);
                pane4Manager.getPane4CreateAccount().getPhoneNumberField().setText(peopleBag.findByID(foundAccount).getPhoneNumber());
                pane4Manager.getPane4CreateAccount().getStreetField().setText(peopleBag.findByID(foundAccount).getHomeAddress().getStreet());
                pane4Manager.getPane4CreateAccount().getCityField().setText(peopleBag.findByID(foundAccount).getHomeAddress().getCity());
                pane4Manager.getPane4CreateAccount().getStateComboBox().getSelectionModel().select(peopleBag.findByID(foundAccount).getHomeAddress().getState());
                pane4Manager.getPane4CreateAccount().getStreetField().setText(peopleBag.findByID(foundAccount).getHomeAddress().getStreet());
                pane4Manager.getPane4CreateAccount().getZipField().setText(peopleBag.findByID(foundAccount).getHomeAddress().getZip());
                pane4Manager.getPositionField().setText(e2.getPosition());
                pane4Manager.getSalaryField().setText(e2.getSalary());
                pane4Manager.getSundayField().setText(e2.getSchedule().getSunday());
                pane4Manager.getMondayField().setText(e2.getSchedule().getMonday());
                pane4Manager.getTuesdayField().setText(e2.getSchedule().getTuesday());
                pane4Manager.getWednesdayField().setText(e2.getSchedule().getWednesday());
                pane4Manager.getThursdayField().setText(e2.getSchedule().getThursday());
                pane4Manager.getFridayField().setText(e2.getSchedule().getFriday());
                pane4Manager.getSaturdayField().setText(e2.getSchedule().getSaturday());
                System.out.println(peopleBag.findByID(foundAccount).getFirstName());
                //Update the account
                pane4Manager.getPane4CreateAccount().getCreateButton().setOnAction(f -> {
                    e2.setFirstName(pane4Manager.getPane4CreateAccount().getFirstNameField().getText());
                    e2.setLastName(pane4Manager.getPane4CreateAccount().getLastNameField().getText());
                    e2.setUsername(pane4Manager.getPane4CreateAccount().getUsernameField().getText());
                    e2.setPassword(pane4Manager.getPane4CreateAccount().getPasswordField().getText());
                    e2.setHomeAddress(new HomeAddress(pane4Manager.getPane4CreateAccount().getStreetField().getText()
                            ,pane4Manager.getPane4CreateAccount().getCityField().getText()
                            ,pane4Manager.getPane4CreateAccount().getStateComboBox().getSelectionModel().getSelectedItem()
                            ,pane4Manager.getPane4CreateAccount().getZipField().getText()));
                    e2.setPhoneNumber(pane4Manager.getPane4CreateAccount().getPhoneNumberField().getText());
                    e2.setPosition(pane4Manager.getPositionField().getText());
                    e2.setSalary(pane4Manager.getSalaryField().getText());
                    e2.setSchedule(new Schedule(pane4Manager.getSundayField().getText(),pane4Manager.getMondayField().getText()
                            ,pane4Manager.getTuesdayField().getText(),pane4Manager.getWednesdayField().getText(),pane4Manager.getThursdayField().getText()
                            ,pane4Manager.getFridayField().getText(),pane4Manager.getSaturdayField().getText() ));
                    peopleBag.writeFile();
                    System.out.println("Successful");

                });
            }
            });


        pane4Manager.getLogOutButton().setOnAction(e->{
            pane4Manager.getCreateEmployeePane().setVisible(false);
            stage.setScene(pane4Login.getScene());
            stage.centerOnScreen();
        });
        pane4Manager.getPane4CreateAccount().getPreviousScreen().setOnAction(e ->{
            clearOutSelections(pane4Manager);
        });
        pane4Manager.getRemoveEmployeeButton().setOnAction(e-> {

            pane4Manager.getCreateEmployeePane().setVisible(false);
            clearOutSelections(pane4Manager);
            if (box.getSelectionModel().getSelectedItem() == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please select an employee to delete.");
                alert.showAndWait();
            } else{
                String id = box.getSelectionModel().getSelectedItem();
            String[] parts = id.split("ID:");
            String foundAccount = parts[1].trim();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Delete Account");
            alert.setHeaderText("Delete " + peopleBag.findByID(foundAccount).getFirstName() + " " + peopleBag.findByID(foundAccount).getLastName());
            alert.setContentText("Are you ok with this?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                peopleBag.delete(peopleBag.findByID(foundAccount));
                peopleBag.writeFile();
                box.getItems().removeAll(box.getItems());        //Removes all items from comboBox
                setComboBox(box, pane4Manager, peopleBag, people); //Updates the comboBox
                Alert confirmation = new Alert(Alert.AlertType.INFORMATION);
                confirmation.setContentText("Employee deleted!");
                confirmation.showAndWait();
            } else {
                alert.close();
            }
        }
        });

    }
    public void setComboBox(ComboBox<String> box, Pane4Manager pane4Manager, PeopleBag peopleBag, Person[] people){
        int i;
        box = pane4Manager.getPeopleBox();
        for (i = 0; i < peopleBag.getNElms() ; i++) {
            if(people[i] instanceof Employee) {
                box.getItems().addAll(people[i].getFirstName()+" "+ people[i].getLastName() + "  ID: " + people[i].getIdNumber());
                if (people[i] instanceof Owner)
                    box.getItems().remove(people[i].getFirstName()+" "+ people[i].getLastName() + "  ID: " + people[i].getIdNumber());
                if (people[i] instanceof Manager)
                    box.getItems().remove(people[i].getFirstName()+" "+ people[i].getLastName() + "  ID: " + people[i].getIdNumber());
            }
        }

    }
    public void clearOutSelections(Pane4Manager pane4Manager){
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
    }

}
