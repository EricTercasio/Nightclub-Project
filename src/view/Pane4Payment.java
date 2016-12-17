package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Eric on 12/16/2016.
 */
public class Pane4Payment {
    private Scene scene;
    private GridPane paymentPane;
    private VBox pane;
    private HBox paymentBox;
    private HBox cardBox;
    private HBox cardFieldBox;
    private HBox nameBox;
    private HBox numberBox;
    private HBox expireBox;
    private HBox securityBox;
    private HBox buttonBox;
    private HBox imageBox;
    private HBox monthAndYearBox;
    private Image image1;
    private Image image2;
    private ImageView visa;
    private ImageView masterCard;
    private Text headerText;
    private Text cardType;
    private Text amountToPay;
    private Text paymentAmount;
    private ComboBox<String> typeToPay;
    private Text nameOnCard;
    private TextField nameOnCardField;
    private Text creditCardNumber;
    private TextField cardField1;
    private TextField cardField2;
    private TextField cardField3;
    private TextField cardField4;
    private Text expiration;
    private ComboBox<String> month;
    private ComboBox<String> year;
    private Text security;
    private TextField securityField;
    private Button submitButton;
    private Button returnButton;


    public Pane4Payment(){
        //Initialize Boxs and panes
        paymentPane = new GridPane();
        pane = new VBox();
        paymentBox = new HBox();
        cardBox = new HBox();
        cardFieldBox = new HBox();
        nameBox = new HBox();
        numberBox = new HBox();
        expireBox = new HBox();
        securityBox = new HBox();
        buttonBox = new HBox();
        imageBox = new HBox();
        monthAndYearBox = new HBox();
        //Images
        image1 = new Image("visa.png");
        image2 = new Image("mastercard.png");
        ///ImageViews
        visa = new ImageView(image1);
        masterCard = new ImageView(image2);
        visa.setFitWidth(70);
        visa.setPreserveRatio(true);
        visa.setSmooth(true);
        visa.setCache(true);
        masterCard.setFitWidth(70);
        masterCard.setPreserveRatio(true);
        masterCard.setSmooth(true);
        masterCard.setCache(true);
        //Texts
        headerText = new Text("Complete Purchase");
        headerText.setFont(new Font("Century Gothic",40));
        cardType = new Text("Credit Card Type");
        amountToPay = new Text("Amount to pay");
        paymentAmount = new Text();
        nameOnCard = new Text("Name on card");
        creditCardNumber = new Text("Credit card number");
        expiration = new Text("Expiration");
        security = new Text("Security code");
        //TextFields
        nameOnCardField = new TextField();
        cardField1 = new TextField();
        cardField1.setMaxWidth(50);
        cardField2 = new TextField();
        cardField2.setMaxWidth(50);
        cardField3 = new TextField();
        cardField3.setMaxWidth(50);
        cardField4 = new TextField();
        cardField4.setMaxWidth(50);
        securityField = new TextField();
        securityField.setMaxWidth(40);
        //ComboBoxs
        ObservableList<String> cardOptions =
                FXCollections.observableArrayList(
                        "Visa","MasterCard"
                );
        typeToPay = new ComboBox<>(cardOptions);
        typeToPay.setPromptText("Select Card Type");
        ObservableList<String> monthOptions =
                FXCollections.observableArrayList(
                        "01", "02", "03", "04", "05", "06", "07",
                        "08", "09", "10", "11", "12"
                );
        month = new ComboBox<>(monthOptions);
        ObservableList<String> yearOptions =
                FXCollections.observableArrayList(
                        "16", "17", "18", "19", "20", "21", "22",
                        "23", "24", "25"
                );
        year = new ComboBox<>(yearOptions);
        //Buttons
        returnButton = new Button("Return");
        submitButton = new Button("Submit");
        //add nodes to boxs
        paymentBox.getChildren().addAll(amountToPay,paymentAmount);
        paymentBox.setAlignment(Pos.CENTER_LEFT);
        paymentBox.setSpacing(50);
        cardBox.getChildren().addAll(cardType,typeToPay);
        cardBox.setAlignment(Pos.CENTER_LEFT);
        cardBox.setSpacing(40);
        nameBox.getChildren().addAll(nameOnCard,nameOnCardField);
        nameBox.setAlignment(Pos.CENTER_LEFT);
        nameBox.setSpacing(55);
        cardFieldBox.getChildren().addAll(cardField1,cardField2,cardField3,cardField4);
        cardFieldBox.setSpacing(20);
        numberBox.getChildren().addAll(creditCardNumber,cardFieldBox);
        numberBox.setAlignment(Pos.CENTER_LEFT);
        numberBox.setSpacing(26);
        monthAndYearBox.getChildren().addAll(month,year);
        monthAndYearBox.setSpacing(15);
        expireBox.getChildren().addAll(expiration,monthAndYearBox);
        expireBox.setAlignment(Pos.CENTER_LEFT);
        expireBox.setSpacing(76);
        securityBox.getChildren().addAll(security,securityField);
        securityBox.setAlignment(Pos.CENTER_LEFT);
        securityBox.setSpacing(56);
        buttonBox.getChildren().addAll(returnButton,submitButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(20);
        imageBox.getChildren().addAll(visa,masterCard);
        imageBox.setAlignment(Pos.CENTER);
        //Add box's to pane
        pane.getChildren().addAll(headerText,paymentBox,cardBox,nameBox,numberBox,expireBox,securityBox,buttonBox,imageBox);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(20);
        paymentPane.getChildren().add(pane);
        paymentPane.setAlignment(Pos.CENTER);
        scene = new Scene(paymentPane,600,600);

    }

    public Scene getScene(){
        return scene;
    }

    public TextField getCardField1() {
        return cardField1;
    }

    public TextField getCardField2() {
        return cardField2;
    }

    public TextField getCardField3() {
        return cardField3;
    }

    public TextField getCardField4() {
        return cardField4;
    }

    public TextField getNameOnCardField() {
        return nameOnCardField;
    }

    public TextField getSecurityField() {
        return securityField;
    }
    public Text getPaymentAmount(){
        return paymentAmount;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public Button getReturnButton() {
        return returnButton;
    }
}
