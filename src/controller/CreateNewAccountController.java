package controller;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import model.*;
import view.*;


/**
 * Created by Kitcatski on 11/7/2016.
 */
public class CreateNewAccountController{
    public CreateNewAccountController( Pane4CreateAccount pane4CreateAccount, Pane4Login pane4Login, Stage stage, PeopleBag peopleBag ){
        Customer customer = new Customer(null,null,null,null,null,null,null);
        pane4CreateAccount.getCreateButton().setOnAction(e -> {
            RadioButton check = (RadioButton)pane4CreateAccount.getGroup().getSelectedToggle();
            String toggleSelected = check.getText();
            customer.setFirstName(pane4CreateAccount.getFirstNameField().getText());
            customer.setLastName(pane4CreateAccount.getLastNameField().getText());
            customer.setUsername(pane4CreateAccount.getUsernameField().getText());
            customer.setPassword(pane4CreateAccount.getPasswordField().getText());
            customer.setGender(toggleSelected);
            customer.setHomeAddress(new HomeAddress(pane4CreateAccount.getStreetField().getText(),pane4CreateAccount.getCityField().getText(),
                    pane4CreateAccount.getStateComboBox().getSelectionModel().getSelectedItem(),pane4CreateAccount.getZipField().getText()));
            customer.setPhoneNumber(pane4CreateAccount.getPhoneNumberField().getText());
            System.out.println(customer.toString());
            System.out.println(customer.getIdNumber());
            System.out.println(customer.getFirstName());
            System.out.println(customer.getLastName());
            System.out.println(customer.getUsername());
            System.out.println(customer.getPassword());
            System.out.println(customer.getGender());
            System.out.println(customer.getHomeAddress().getCity());
            System.out.println(customer.getHomeAddress().getState());
            System.out.println(customer.getPhoneNumber());
            peopleBag.add(customer);
            peopleBag.writeFile();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Account created!");
            alert.setHeaderText("Congratulations!");
            alert.setTitle("Account created");
            alert.showAndWait();
            pane4CreateAccount.getFirstNameField().clear();
            pane4CreateAccount.getLastNameField().clear();
            pane4CreateAccount.getUsernameField().clear();
            pane4CreateAccount.getPasswordField().clear();
            pane4CreateAccount.getGroup().getSelectedToggle().setSelected(false);
            pane4CreateAccount.getCityField().clear();
            pane4CreateAccount.getStreetField().clear();
            pane4CreateAccount.getPhoneNumberField().clear();
            pane4CreateAccount.getStateComboBox().getSelectionModel().clearSelection();
            pane4CreateAccount.getZipField().clear();

        });
        pane4CreateAccount.getPreviousScreen().setOnAction(e ->{

            stage.setScene(pane4Login.getScene());



        });
    }
}
