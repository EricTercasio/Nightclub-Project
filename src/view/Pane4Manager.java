package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.lang.reflect.Array;


/**
 * Created by Kitcatski on 11/9/2016.
 */
public class Pane4Manager {
    Pane4CreateAccount pane4CreateAccount;
    //Scenes
    private Scene scene;
    //Panes
    private GridPane managerPane;
    private GridPane gridPane;
    private VBox createEmployeePane;
    private HBox box;
    private VBox employeeVBox;
    //Text
    private Text managerTitle;
    private Text createNewEmployee;
    //TextFields

    //Buttons and ComboBox
    Button logOutButton;
    Button addEmployeeButton;
    Button removeEmployeeButton;
    Button modifyEmployeeButton;
    private ComboBox<String> peopleBox;

    public Pane4Manager(){
        //Initialize Panes
        pane4CreateAccount = new Pane4CreateAccount(); //Used to get create account pane so i dont have to rewrite all of the nodes
        createEmployeePane = pane4CreateAccount.getPane(); //Which is put into createEmployeePane
        managerPane = new GridPane();
        gridPane = new GridPane();
        employeeVBox = new VBox();
        box = new HBox();
        //Initialize text
        managerTitle = new Text("Manager Window");
        managerTitle.setFont(Font.font("Century Gothic",20));
        createNewEmployee = new Text("Create new employee");
        //Initialize comboBox
        peopleBox = new ComboBox<>();
        //Initialize Buttons
        //Add nodes to panes
        createEmployeePane.getChildren().remove(0); // Removes "Create new Account" from pane
        createEmployeePane.setVisible(false);
        box.getChildren().add(managerTitle);
        createEmployeePane.getChildren().add(0,peopleBox);
        gridPane.getChildren().add(box);
        gridPane.setPadding(new Insets(10,0,10,0));
        gridPane.setAlignment(Pos.CENTER);
        createEmployeePane.setAlignment(Pos.CENTER);
        managerPane.getChildren().addAll(gridPane,createEmployeePane);
        managerPane.setAlignment(Pos.CENTER);
        //managerPane.setTop(gridPane);
        //managerPane.setLeft(createEmployeePane);
        scene = new Scene(managerPane,800,800);

    }
    public Scene getScene(){
        return scene;
    }

    public ComboBox<String> getPeopleBox(){
        return peopleBox;
    }

    public Pane4CreateAccount getPane4CreateAccount(){
        return pane4CreateAccount;
    }
}
