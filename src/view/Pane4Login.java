package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;


/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Pane4Login {
    private GridPane loginPane;
    private HBox usernameBox;
    private HBox passwordBox;
    private VBox pane;
    private HBox textBox;
    private VBox buttonBox;
    private HBox accountBox;
    private HBox titleBox;
    private Text title;
    private Label username;
    private Text login;
    private Label password;
    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginButton;
    private TextFlow createAccount;


    public Pane4Login(){
        //Panes
        loginPane = new GridPane();
        loginPane.setPadding(new Insets(20,20,20,20));
        usernameBox = new HBox();
        usernameBox.setPadding(new Insets(20,20,20,20));
        usernameBox.setSpacing(15);
        passwordBox = new HBox();
        passwordBox.setPadding(new Insets(20,20,20,20));
        passwordBox.setSpacing(20);
        textBox = new HBox();
        textBox.setAlignment(Pos.CENTER);
        buttonBox = new VBox();
        buttonBox.setAlignment(Pos.CENTER);
        accountBox = new HBox();
        accountBox.setAlignment(Pos.CENTER);
        titleBox = new HBox();
        titleBox.setPadding(new Insets(0,0,50,0));
        titleBox.setAlignment(Pos.CENTER);
        pane = new VBox();
        //Labels and Text
        login = new Text("Log In");
        login.setFont(Font.font("arial",30));
        username = new Label("Username: ");
        password = new Label("Password: ");
        title = new Text("FirePaw");
        title.setFont(Font.font("arial",50));
        title.setFill(Color.RED);
        title.setEffect(new GaussianBlur());
        createAccount = new TextFlow(new Text("Don't have an account?"), new Hyperlink("Click here!"));
        //Fields and Buttons
        usernameField = new TextField();
        passwordField = new PasswordField();
        loginButton = new Button("Submit");
        //Adding nodes to box's
        textBox.getChildren().add(login);
        buttonBox.getChildren().add(loginButton);
        accountBox.getChildren().add(createAccount);
        usernameBox.getChildren().addAll(username,usernameField);
        passwordBox.getChildren().addAll(password,passwordField);
        titleBox.getChildren().add(title);
        //Add box's to pane
        pane.getChildren().addAll(titleBox,textBox,usernameBox,passwordBox,buttonBox,accountBox);
        //Add pane to the gridPane
        loginPane.getChildren().add(pane);
        loginPane.setAlignment(Pos.CENTER);

    }

    public GridPane getLoginPane() {
        return loginPane;
    }

    public void setLoginPane(GridPane loginPane) {
        this.loginPane = loginPane;
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

    public Button getLoginButton() {
        return loginButton;
    }
    public TextFlow getCreateAccount(){
        return createAccount;
    }
}
