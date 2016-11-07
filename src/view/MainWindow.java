package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class MainWindow extends Application{
    Pane4Login pane4Login;



    @Override
    public void start(Stage primaryStage) throws Exception {

            Pane4Login pane4Login = new Pane4Login();
            Pane4CreateAccount pane4CreateAccount = new Pane4CreateAccount();
            //Scene scene = new Scene(pane4Login.getLoginPane(),600,600);
            Scene scene = new Scene(pane4CreateAccount.getCreateAccountPane(),600,600);
            primaryStage.setScene(scene);
            Hyperlink createAccountClick = pane4Login.getCreateAccount();

            createAccountClick.setOnAction(e ->{

        });
            primaryStage.show();
    }

}

