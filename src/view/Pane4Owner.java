package view;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 * Created by Kitcatski on 11/9/2016.
 */
public class Pane4Owner {
    private Scene scene;
    private GridPane ownerPane;
    private Text ownerTitle;

    public Pane4Owner(){
        ownerPane = new GridPane();
        ownerTitle = new Text("Owner");
        ownerPane.getChildren().add(ownerTitle);
        scene = new Scene(ownerPane,600,600);
    }
    public Scene getScene(){
        return scene;
    }
}
