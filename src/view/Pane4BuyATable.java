package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

/**
 * Created by Kitcatski on 12/5/2016.
 */
public class Pane4BuyATable {
    private Scene scene;
    private GridPane pane;
    private VBox verticalBox;
    private VBox priceAndnumberBox;
    private VBox tableBox;
    private HBox buttonBox;
    private HBox chairBox;
    private ComboBox<String> numberBox;
    private Text introText;
    private Text selectText;
    private Text price;
    private Text tableNumber;
    private Button returnButton;
    private Button buyATableButton;
    private Image image;
    private ArrayList<ImageView> imageArray;

    public Pane4BuyATable() {
        pane = new GridPane();
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "2", "3", "4", "5", "6", "7", "8"
                );
        numberBox = new ComboBox<>(options);
        verticalBox = new VBox();
        buttonBox = new HBox();
        chairBox = new HBox();
        priceAndnumberBox = new VBox();
        priceAndnumberBox.setAlignment(Pos.CENTER);
        tableBox = new VBox();
        tableBox.setAlignment(Pos.CENTER);
        introText = new Text("Purchase a Table");
        introText.setFont(new Font("Century Gothic", 40));
        introText.setFill(Color.RED);
        selectText = new Text("Select the number of seats");
        selectText.setFont(new Font("Century Gothic", 20));
        tableNumber = new Text("Table Number: ");
        tableNumber.setFont(new Font("Century Gothic", 20));

        price = new Text("Price: ");
        price.setFont(new Font("Century Gothic", 20));

        image = new Image("ChairPhotos/Table.png");

        imageArray = new ArrayList<>(8);
        chairBox = new HBox();
        chairBox.setAlignment(Pos.CENTER);
        returnButton = new Button("Return");
        buyATableButton = new Button("Add to order");


        buttonBox.getChildren().addAll(returnButton, buyATableButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(20);
        priceAndnumberBox.getChildren().addAll(tableNumber, price);
        priceAndnumberBox.setSpacing(20);
        priceAndnumberBox.setAlignment(Pos.CENTER);
        tableBox.getChildren().addAll(priceAndnumberBox, chairBox);
        tableBox.setSpacing(20);
        tableBox.setVisible(true);
        verticalBox.getChildren().addAll(introText, selectText, numberBox, tableBox, buttonBox);
        verticalBox.setSpacing(20);
        pane.getChildren().addAll(verticalBox);
        verticalBox.setAlignment(Pos.TOP_CENTER);
        pane.setAlignment(Pos.TOP_CENTER);
        pane.setStyle("-fx-background: #AFCEC4;");
        scene = new Scene(pane, 600, 600);


    }

    public Scene getScene() {
        return scene;
    }
    public Image getImage(){
        return image;
    }
    public HBox getChairBox(){
        return chairBox;
    }
    public ComboBox<String> getNumberBox(){
        return numberBox;
    }
    public Button getReturnButton(){
        return returnButton;
    }
    public Button getBuyATableButton(){
        return buyATableButton;
    }
    public Text getTableNumber(){
        return tableNumber;
    }
    public Text getPrice(){
        return price;
    }

}
