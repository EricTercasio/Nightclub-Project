package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Eric on 11/5/2016.
 */
public class Pane4CreateAccount {
    private Scene scene;
    private GridPane createAccountPane;
    private VBox pane;
    private HBox firstNameBox;
    private HBox lastNameBox;
    private HBox usernameBox;
    private HBox passwordBox;
    private HBox phoneNumberBox;
    private HBox homeAddressBox;
    private HBox streetBox;
    private HBox cityBox;
    private HBox stateBox;
    private HBox zipBox;
    private HBox buttonBox;
    private HBox radioButtonBox;
    private Text createAccount;
    private ComboBox<String> stateComboBox;
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
    private TextField zipField;
    private Button createButton;
    private Button previousScreen;
    ToggleGroup group;
    RadioButton male;
    RadioButton female;
    public Pane4CreateAccount(){
        // Initialize panes
        createAccountPane = new GridPane();
        pane = new VBox();
        firstNameBox = new HBox();
        lastNameBox = new HBox();
        usernameBox = new HBox();
        passwordBox = new HBox();
        phoneNumberBox = new HBox();
        homeAddressBox = new HBox();
        streetBox = new HBox();
        cityBox = new HBox();
        stateBox = new HBox();
        zipBox = new HBox();
        buttonBox = new HBox();
        radioButtonBox = new HBox();
        group = new ToggleGroup();
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
        createAccount.setFill(Color.WHITE);
        createAccount.setFont(Font.font("Century Gothic",30));
        firstNameField = new TextField();
        firstNameField.setPromptText("John");
        lastNameField = new TextField();
        lastNameField.setPromptText("Smith");
        usernameField = new TextField();
        usernameField.setPromptText("JohnIsCool123");
        passwordField = new PasswordField();
        passwordField.setPromptText("Password123!");
        phoneNumberField = new TextField();
        phoneNumberField.setPromptText("(555)823-1123");
        streetField = new TextField();
        streetField.setPromptText("23 LakeField Rd");
        cityField = new TextField();
        cityField.setPromptText("Mount Sinai");
        zipField = new TextField();
        zipField.setPromptText("11823");
        //Initialize Buttons
        createButton = new Button("Submit");
        previousScreen = new Button("Back");
        male = new RadioButton("Male");
        female = new RadioButton("Female");
        //Initialize ComboBox
        ObservableList<String> options =
        FXCollections.observableArrayList(
                "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN",
                "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV",
                "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN",
                "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"
        );
        stateComboBox = new ComboBox<>(options);
        stateComboBox.setVisibleRowCount(5);
        // Put nodes in panes
        firstNameBox.getChildren().addAll(firstName,firstNameField);
        firstNameBox.setSpacing(24);
        firstNameBox.setAlignment(Pos.CENTER);
        lastNameBox.getChildren().addAll(lastName,lastNameField);
        lastNameBox.setSpacing(25);
        lastNameBox.setAlignment(Pos.CENTER);
        usernameBox.getChildren().addAll(username,usernameField);
        usernameBox.setSpacing(27);
        usernameBox.setAlignment(Pos.CENTER);
        passwordBox.getChildren().addAll(password,passwordField);
        passwordBox.setSpacing(31);
        passwordBox.setAlignment(Pos.CENTER);
        phoneNumberBox.getChildren().addAll(phoneNumber,phoneNumberField);
        phoneNumberBox.setAlignment(Pos.CENTER);
        homeAddressBox.getChildren().add(homeAddress);
        homeAddressBox.setAlignment(Pos.CENTER);
        streetBox.getChildren().addAll(street,streetField);
        streetBox.setSpacing(49);
        streetBox.setAlignment(Pos.CENTER);
        cityBox.getChildren().addAll(city,cityField);
        cityBox.setSpacing(60);
        cityBox.setAlignment(Pos.CENTER);
        stateBox.getChildren().addAll(state,stateComboBox);
        stateBox.setSpacing(138);
        stateBox.setAlignment(Pos.CENTER);
        zipBox.getChildren().addAll(zip,zipField);
        zipBox.setSpacing(64);
        zipBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(previousScreen,createButton);
        buttonBox.setSpacing(140);
        buttonBox.setAlignment(Pos.CENTER);
        male.setToggleGroup(group);
        female.setToggleGroup(group);
        radioButtonBox.getChildren().addAll(male,female);
        radioButtonBox.setSpacing(40);
        radioButtonBox.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(createAccount,firstNameBox,lastNameBox,radioButtonBox,usernameBox,passwordBox,phoneNumberBox,homeAddressBox,streetBox,cityBox,stateBox,zipBox,buttonBox);
        pane.setSpacing(15);
        createAccountPane.getChildren().add(pane);
        createAccountPane.setAlignment(Pos.CENTER);
        createAccountPane.setStyle("-fx-background: #AFCEC4");
        //put pane in scene
        scene = new Scene(createAccountPane,600,600);

    }
    public Scene getScene(){return scene;}
    public GridPane getCreateAccountPane(){
        return createAccountPane;
    }
    public VBox getPane (){return pane;}
    public ComboBox<String> getStateComboBox() {
        return stateComboBox;
    }

    public TextField getFirstNameField() {
        return firstNameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public TextField getPhoneNumberField() {
        return phoneNumberField;
    }

    public TextField getStreetField() {
        return streetField;
    }

    public TextField getCityField() {
        return cityField;
    }

    public TextField getZipField() {
        return zipField;
    }

    public Button getCreateButton() {
        return createButton;
    }

    public Button getPreviousScreen() {
        return previousScreen;
    }

    public ToggleGroup getGroup() {
        return group;
    }
    public RadioButton getMale(){
        return male;
    }
    public RadioButton getFemale(){
        return  female;
    }

}
