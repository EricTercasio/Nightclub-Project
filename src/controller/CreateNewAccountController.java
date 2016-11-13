package controller;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import model.*;
import view.*;


/**
 * Created by Kitcatski on 11/7/2016.
 */
public class CreateNewAccountController{
    Customer customer;
    public CreateNewAccountController( Pane4CreateAccount pane4CreateAccount, Pane4Login pane4Login, Stage stage, PeopleBag peopleBag){

        pane4CreateAccount.getCreateButton().setOnAction(e -> {
            //Checks to see if all the Textfields have information entered before
            //Creating account to insure that the ID is correctly icremented
            if(pane4CreateAccount.getFirstNameField().getText().isEmpty() || !pane4CreateAccount.getFirstNameField().getText().matches(".*[a-zA-Z]+.*")
                    || pane4CreateAccount.getFirstNameField().getText().matches(".*[0-9]+.*")){
                createAccountError("First name");
            }
            //This is here because if their first name is entered as ID or ID: it will break the comboBox in the managerPane
            else if(pane4CreateAccount.getFirstNameField().getText().equals("ID") || pane4CreateAccount.getFirstNameField().getText().equals("ID:")){
                createAccountError("First name");
            }
            else if(pane4CreateAccount.getLastNameField().getText().isEmpty() || !pane4CreateAccount.getLastNameField().getText().matches(".*[a-zA-Z]+.*")
                    || pane4CreateAccount.getLastNameField().getText().matches(".*[0-9]+.*")){
                createAccountError("Last name");
            }
            else if(pane4CreateAccount.getGroup().getSelectedToggle() == null){
                createAccountError("Gender");
            }
            else if(pane4CreateAccount.getUsernameField().getText().isEmpty()){
                createAccountError("Username");
            }
            //Checks to see if username is already in use
            else if(peopleBag.findByUsername(pane4CreateAccount.getUsernameField().getText()) != null){
                usernameInUseError();
            }
            else if(pane4CreateAccount.getPasswordField().getText().isEmpty()){
                createAccountError("Password");
            }
            else if(pane4CreateAccount.getPhoneNumberField().getText().isEmpty()){
                createAccountError("Phone number");
            }
            //Checks to see if phone number is anything but a number & is 10 characters long.
            else if(pane4CreateAccount.getPhoneNumberField().getText().matches("[-+]?\\d*\\.?\\d+") == false  || pane4CreateAccount.getPhoneNumberField().getText().length() != 10){
                phoneNumberError();
            }
            else if(pane4CreateAccount.getStreetField().getText().isEmpty()){
                createAccountError("Street");
            }
            else if(pane4CreateAccount.getCityField().getText().isEmpty()){
                createAccountError("City");
            }
            else if(pane4CreateAccount.getStateComboBox().getSelectionModel().isEmpty()){
                createAccountError("State");
            }
            else if(pane4CreateAccount.getZipField().getText().isEmpty() || pane4CreateAccount.getZipField().getText().length() != 5){
                createAccountError("Zip");
            }
            else {
                //Creates the customer object using information from TextFields
                customer = new Customer(null, null, null, null, null, null, null);
                RadioButton check = (RadioButton) pane4CreateAccount.getGroup().getSelectedToggle();
                String toggleSelected = check.getText();
                customer.setFirstName(pane4CreateAccount.getFirstNameField().getText());
                customer.setLastName(pane4CreateAccount.getLastNameField().getText());
                customer.setUsername(pane4CreateAccount.getUsernameField().getText());
                customer.setPassword(pane4CreateAccount.getPasswordField().getText());
                customer.setGender(toggleSelected);
                customer.setHomeAddress(new HomeAddress(pane4CreateAccount.getStreetField().getText(), pane4CreateAccount.getCityField().getText(),
                        pane4CreateAccount.getStateComboBox().getSelectionModel().getSelectedItem(), pane4CreateAccount.getZipField().getText()));
                customer.setPhoneNumber(pane4CreateAccount.getPhoneNumberField().getText());
                //Delete this
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

                System.out.println("Didnt work eric");
                //Adds customer object to the bag and saves
                peopleBag.add(customer);
                peopleBag.writeFile();
                //Instructs that account was successfully created
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Account created!");
                alert.setHeaderText("Congratulations!");
                alert.setTitle("Account created");
                alert.showAndWait();
                //Clears out all the Nodes
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
            }
        });
        pane4CreateAccount.getPreviousScreen().setOnAction(e ->{

            stage.setScene(pane4Login.getScene());



        });
    }
    //Helper method to make error's easier to manage
    public void createAccountError(String input){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(input + " is not filled in correctly. Please try again");
        alert.showAndWait();
    }
    public void phoneNumberError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Phone number must contain only numbers & must be 10 digits long. \nPlease try again");
        alert.showAndWait();
    }
    public void usernameInUseError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("That username is already in use. Please try again.");
        alert.showAndWait();
    }
}
