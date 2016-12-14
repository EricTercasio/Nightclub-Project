package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Kitcatski on 12/5/2016.
 */
public class Pane4ViewMenu {
    private Scene scene;
    private GridPane menuPane;
    private VBox pane;
    private VBox foodBox;
    private VBox drinkBox;
    private HBox foodAndDrinkBox;
    private HBox buttonBox;
    private HBox nameBox;
    private Text headerText;
    private Text food;
    private Text drinks;
    private CheckBox checkFood1;
    private CheckBox checkFood2;
    private CheckBox checkFood3;
    private CheckBox checkFood4;
    private CheckBox checkFood5;
    private CheckBox checkFood6;
    private CheckBox checkDrink1;
    private CheckBox checkDrink2;
    private CheckBox checkDrink3;
    private CheckBox checkDrink4;
    private CheckBox checkDrink5;
    private CheckBox checkDrink6;
    private Button returnButton;
    private Button purchaseButton;

    public Pane4ViewMenu(){
        //Initialize box's
        menuPane = new GridPane();
        pane = new VBox();
        foodBox = new VBox();
        drinkBox = new VBox();
        foodAndDrinkBox = new HBox();
        buttonBox = new HBox();
        nameBox = new HBox();
        //Initialize Texts
        headerText = new Text("Menu");
        headerText.setFont(new Font("Century Gothic",30));
        headerText.setFill(Color.RED);
        food = new Text("Food");
        drinks = new Text("Drinks");
        //Initialize checkBox's
        checkFood1 = new CheckBox("Pizza | $2");
        checkFood2 = new CheckBox("Hamburger | $3");
        checkFood3 = new CheckBox("Salad | $5");
        checkFood4 = new CheckBox("Chicken Tenders | $5");
        checkFood5 = new CheckBox("Chicken Sandwich | $3");
        checkFood6 = new CheckBox("Pasta | $5");
        checkDrink1 = new CheckBox("Wine | $10");
        checkDrink2 = new CheckBox("Beer | $4");
        checkDrink3 = new CheckBox("Vodka | $10");
        checkDrink4 = new CheckBox("Water | $0");
        checkDrink5 = new CheckBox("Tea | $2");
        checkDrink6 = new CheckBox("Coke | $2");
        //Initialize Buttons
        returnButton = new Button("Return");
        purchaseButton = new Button("Add to order");

        //add to boxs
        nameBox.getChildren().add(headerText);
        nameBox.setAlignment(Pos.TOP_CENTER);
        foodBox.getChildren().addAll(food,checkFood1,checkFood2,checkFood3,checkFood4,checkFood5,checkFood6);
        foodBox.setSpacing(20);
        foodBox.setAlignment(Pos.CENTER_LEFT);
        drinkBox.getChildren().addAll(drinks,checkDrink1,checkDrink2,checkDrink3,checkDrink4,checkDrink5,checkDrink6);
        drinkBox.setSpacing(20);
        foodAndDrinkBox.getChildren().addAll(foodBox,drinkBox);
        foodAndDrinkBox.setAlignment(Pos.CENTER);
        foodAndDrinkBox.setSpacing(30);
        buttonBox.getChildren().addAll(returnButton,purchaseButton);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);
        buttonBox.setSpacing(150);

        pane.getChildren().addAll(nameBox,foodAndDrinkBox,buttonBox);
        pane.setSpacing(60);
        //add boxs to pane

        menuPane.getChildren().addAll(pane);
        menuPane.setAlignment(Pos.CENTER);

        scene = new Scene(menuPane,600,600);

    }
    public Scene getScene(){
        return scene;
    }
    public Button getReturnButton(){
        return returnButton;
    }
    public Button getPurchaseButton(){
        return purchaseButton;
    }
}
