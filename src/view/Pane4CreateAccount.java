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
        lastNameField = new TextField();
        usernameField = new TextField();
        passwordField = new PasswordField();
        phoneNumberField = new TextField();
        streetField = new TextField();
        cityField = new TextField();
        zipField = new TextField();
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
        stateBox.getChildren().addAll(state,stateComboBox);
        stateBox.setSpacing(54);
        zipBox.getChildren().addAll(zip,zipField);
        zipBox.setSpacing(64);
        buttonBox.getChildren().addAll(previousScreen,createButton);
        buttonBox.setSpacing(140);
        male.setToggleGroup(group);
        female.setToggleGroup(group);
        radioButtonBox.getChildren().addAll(male,female);
        radioButtonBox.setSpacing(40);
        pane.getChildren().addAll(createAccount,firstNameBox,lastNameBox,radioButtonBox,usernameBox,passwordBox,phoneNumberBox,homeAddress,streetBox,cityBox,stateBox,zipBox,buttonBox);
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
