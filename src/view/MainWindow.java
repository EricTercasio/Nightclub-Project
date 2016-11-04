package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class MainWindow extends Application{
    Pane4Login pane4Login;

    @Override
    public void start(Stage primaryStage) throws Exception {
            Pane4Login pane4Login = new Pane4Login();
            Scene scene = new Scene(pane4Login.getLoginPane(),600,600);
            primaryStage.setScene(scene);
            primaryStage.show();
    }
}

