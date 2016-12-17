package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Kitcatski on 12/5/2016.
 */
public class Pane4ViewReceipt {
    private Scene scene;
    private GridPane receiptPane;
    private VBox pane;
    private VBox ticketBox;
    private VBox tableBox;
    private VBox foodAndDrinkBox;
    private HBox buttonBox;
    private Text headerText;
    private Text tickets;
    private Text ticketOptions;
    private Text tables;
    private Text tableOptions;
    private Text foodAndDrink;
    private Text foodAndDrinkOptions;
    private Text total;
    private Button returnButton;
    private Button purchaseButton;


    public Pane4ViewReceipt(){
        //Panes
        pane = new VBox();
        receiptPane = new GridPane();
        ticketBox = new VBox();
        tableBox = new VBox();
        foodAndDrinkBox = new VBox();
        buttonBox = new HBox();
        //Texts
        headerText = new Text("Receipt");
        headerText.setFont(Font.font("Century Gothic",30));
        headerText.setFill(Color.RED);
        tickets = new Text("Tickets |");
        tickets.setFont(Font.font("Century Gothic",25));
        tables = new Text("Tables | ");
        tables.setFont(Font.font("Century Gothic",25));
        foodAndDrink = new Text("Food and Drinks |");
        foodAndDrink.setFont(Font.font("Century Gothic",25));
        total = new Text("Total : ");
        total.setFont(Font.font("Century Gothic",25));
        total.setFill(Color.GREEN);
        ticketOptions = new Text();
        tableOptions = new Text();
        foodAndDrinkOptions = new Text();
        //buttons
        returnButton = new Button("Return");
        purchaseButton = new Button("Purchase");
        //add nodes to boxs
        ticketBox.getChildren().addAll(tickets,ticketOptions);
        ticketBox.setAlignment(Pos.CENTER);
        tableBox.getChildren().addAll(tables,tableOptions);
        tableBox.setAlignment(Pos.CENTER);
        foodAndDrinkBox.getChildren().addAll(foodAndDrink,foodAndDrinkOptions);
        foodAndDrinkBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(returnButton,purchaseButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(50);

        pane.getChildren().addAll(headerText,ticketBox,tableBox,foodAndDrinkBox,total, buttonBox);
        pane.setSpacing(15);
        pane.setAlignment(Pos.CENTER);


        receiptPane.getChildren().add(pane);
        receiptPane.setAlignment(Pos.CENTER);
        scene = new Scene(receiptPane,600,600);
    }
    public Scene getScene(){
        return scene;
    }
    public VBox getTicketBox(){
        return ticketBox;
    }

    public VBox getTableBox() {
        return tableBox;
    }

    public VBox getFoodAndDrinkBox() {
        return foodAndDrinkBox;
    }
    public Text getTotal(){
        return total;
    }
    public Button getReturnButton(){
        return returnButton;
    }
    public Button getPurchaseButton(){
        return purchaseButton;
    }
}
