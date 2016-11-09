package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
    private Text welcome;
    private Text customerName;
    public Pane4Customer(){
        //Initalize panes
        customerPane = new GridPane();
        nameBox = new HBox();
        //Initalize Text
        welcome = new Text("Weclome");
        welcome.setFont(Font.font("Century Gothic",15));
        customerName = new Text();
        customerName.setFill(Color.AQUA);
        customerName.setFont(Font.font("Century Gothic",30));
        //add nodes to panes
        nameBox.getChildren().addAll(welcome,customerName);
        //add box to mainpane
        customerPane.getChildren().add(nameBox);
        customerPane.setAlignment(Pos.CENTER);
        //add main pane to scene
        scene = new Scene(customerPane, 600, 600);
    }

    public Scene getScene() {
        return scene;
    }
    public Text getCustomerName(){
        return customerName;
    }
}
