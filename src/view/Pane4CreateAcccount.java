package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Eric on 11/5/2016.
 */
public class Pane4CreateAcccount {
    private GridPane createAccountPane;
    private VBox pane;
    private HBox firstNameBox;
    private HBox lastNameBox;
    private HBox usernameBox;
    private HBox passwordBox;
    private HBox phoneNumberBox;
    private HBox streetBox;
    private HBox cityBox;
    private HBox stateBox;
    private HBox zipBox;
    private HBox buttonBox;
    private Text createAccount;
    private Label firstName;
    private Label lastName;
    private Label username;
    private Label password;
    private Label phoneNumber;
    private Label homeAddress;
    private Label street;
    private Label city;
    private Label state;
    private Label zip;
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField usernameField;
    private PasswordField passwordField;
    private TextField phoneNumberField;
    private TextField streetField;
    private TextField cityField;
    private TextField stateField;
    private TextField zipField;
    private Button createButton;
    private Button previousScreen;
    public Pane4CreateAcccount(){
        // Initialize panes
        createAccountPane = new GridPane();
        pane = new VBox();
        firstNameBox = new HBox();
        lastNameBox = new HBox();
        usernameBox = new HBox();
        passwordBox = new HBox();
        phoneNumberBox = new HBox();
        streetBox = new HBox();
        cityBox = new HBox();
        stateBox = new HBox();
        zipBox = new HBox();
        buttonBox = new HBox();
        // Initialize labels
        firstName = new Label("First Name: ");
        lastName = new Label("Last Name: ");
        username = new Label("Username: ");
        password = new Label("Password: ");
        phoneNumber = new Label("Phone Number: ");
        homeAddress = new Label("Home Address");
        street = new Label("Street: ");
        city = new Label("City: ");
        state = new Label("State: ");
        zip = new Label("Zip: ");
        // Initialize TextFields
        createAccount = new Text("Create New Account");
        createAccount.setFont(Font.font("arial",30));
        firstNameField = new TextField();
        lastNameField = new TextField();
        usernameField = new TextField();
        passwordField = new PasswordField();
        phoneNumberField = new TextField();
        streetField = new TextField();
        cityField = new TextField();
        stateField = new TextField();
        zipField = new TextField();
        //Initialize Buttons
        createButton = new Button("Submit");
        previousScreen = new Button("Back");
        // Put nodes in panes
        firstNameBox.getChildren().addAll(firstName,firstNameField);
        firstNameBox.setSpacing(24);
        lastNameBox.getChildren().addAll(lastName,lastNameField);
        lastNameBox.setSpacing(25);
        usernameBox.getChildren().addAll(username,usernameField);
        usernameBox.setSpacing(27);
        passwordBox.getChildren().addAll(password,passwordField);
        passwordBox.setSpacing(31);
        phoneNumberBox.getChildren().addAll(phoneNumber,phoneNumberField);
        streetBox.getChildren().addAll(street,streetField);
        streetBox.setSpacing(49);
        cityBox.getChildren().addAll(city,cityField);
        cityBox.setSpacing(60);
        stateBox.getChildren().addAll(state,stateField);
        stateBox.setSpacing(54);
        zipBox.getChildren().addAll(zip,zipField);
        zipBox.setSpacing(64);
        buttonBox.getChildren().addAll(previousScreen,createButton);
        buttonBox.setSpacing(140);
        pane.getChildren().addAll(createAccount,firstNameBox,lastNameBox,usernameBox,passwordBox,phoneNumberBox,homeAddress,streetBox,cityBox,stateBox,zipBox,buttonBox);
        pane.setSpacing(15);
        createAccountPane.getChildren().add(pane);
        createAccountPane.setAlignment(Pos.CENTER);

    }
    public GridPane getCreateAccountPane(){
        return createAccountPane;
    }
}
