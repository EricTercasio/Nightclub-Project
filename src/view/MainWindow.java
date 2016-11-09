package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;
import model.Customer;
import model.HomeAddress;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class MainWindow {
private Stage stage;
    public MainWindow(){

    }
    public MainWindow (Stage stage){
        this.stage = stage;
    }
    public Stage getStage(){
        return stage;
    }
}



