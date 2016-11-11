package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.lang.reflect.Array;


/**
 * Created by Kitcatski on 11/9/2016.
 */
public class Pane4Manager {
    private Scene scene;
    private GridPane managerPane;
    private ComboBox<String> peopleBox;
    private Text managerTitle;

    public Pane4Manager(){
        managerPane = new GridPane();
        managerTitle = new Text("Manager");
        peopleBox = new ComboBox<>();
        managerPane.getChildren().addAll(managerTitle,peopleBox);
        managerPane.setAlignment(Pos.CENTER);
        scene = new Scene(managerPane,600,600);

    }
    public Scene getScene(){
        return scene;
    }
    public ComboBox<String> getPeopleBox(){
        return peopleBox;
    }
}
