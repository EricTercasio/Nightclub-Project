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
 * Created by Kitcatski on 11/9/2016.
 */
public class Pane4Customer {
    private Scene scene;
    private GridPane customerPane;
    private HBox nameBox;
    private HBox ticketTableBox;
    private HBox foodReceiptBox;
    private VBox box;
    private Button ticketButton;
    private Button tableButton;
    private Button foodButton;
    private Button receiptButton;
    private Button logoutButton;
    private Text welcome;
    private Text customerName;
    public Pane4Customer(){
        //Initalize panes
        customerPane = new GridPane();
        nameBox = new HBox();
        ticketTableBox = new HBox();
        foodReceiptBox = new HBox();
        box = new VBox();
        //Initalize Text
        welcome = new Text("Weclome");
        welcome.setFont(Font.font("Century Gothic",15));
        customerName = new Text();
        customerName.setFill(Color.AQUA);
        customerName.setFont(Font.font("Century Gothic",30));
        //Initialize Buttons
        ticketButton = new Button("Buy a Ticket");
        ticketButton.setPrefSize(150,150);
        tableButton = new Button("Buy a Table");
        tableButton.setPrefSize(150,150);
        foodButton = new Button("View Menu");
        foodButton.setPrefSize(150,150);
        receiptButton = new Button("View Receipt");
        receiptButton.setPrefSize(150,150);
        logoutButton = new Button("Logout");
        logoutButton.setTextFill(Color.RED);

        //add nodes to panes
        nameBox.getChildren().addAll(welcome,customerName);
        nameBox.setAlignment(Pos.TOP_CENTER);
        ticketTableBox.getChildren().addAll(ticketButton,tableButton);
        ticketTableBox.setSpacing(50);
        foodReceiptBox.getChildren().addAll(foodButton,receiptButton);
        foodReceiptBox.setSpacing(50);
        box.getChildren().addAll(nameBox,ticketTableBox,foodReceiptBox,logoutButton);
        box.setSpacing(50);
        //add box to mainpane
        customerPane.getChildren().addAll(box);
        customerPane.setAlignment(Pos.CENTER);
        customerPane.setStyle("-fx-background: #AFCEC4;");
        //add main pane to scene
        scene = new Scene(customerPane, 600, 600);
    }

    public Scene getScene() {
        return scene;
    }
    public Text getCustomerName(){
        return customerName;
    }

    public Button getTicketButton() {
        return ticketButton;
    }

    public Button getTableButton() {
        return tableButton;
    }

    public Button getFoodButton() {
        return foodButton;
    }

    public Button getReceiptButton() {
        return receiptButton;
    }

    public Button getLogoutButton(){
        return logoutButton;
    }
}
