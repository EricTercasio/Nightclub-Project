package start;

import controller.CreateNewAccountController;
import controller.CustomerController;
import controller.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.*;
import model.*;

import static javafx.application.Application.launch;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        //MainWindow main = new MainWindow(primaryStage);
        PeopleBag peopleBag = new PeopleBag();
        peopleBag = peopleBag.loadFile();
        Customer customer = new Customer(null,null,null,null,null,null,null);
        Pane4Login pane4Login = new Pane4Login();
        Pane4CreateAccount pane4CreateAccount = new Pane4CreateAccount();
        Pane4Customer pane4Customer = new Pane4Customer();
        Pane4Manager pane4Manager = new Pane4Manager();
        Pane4Owner pane4Owner = new Pane4Owner();
        LoginController loginController = new LoginController(customer,peopleBag,pane4CreateAccount,pane4Customer,pane4Login,pane4Owner,pane4Manager,primaryStage);
        CreateNewAccountController createNewAccountController = new CreateNewAccountController(customer,pane4CreateAccount,pane4Login,primaryStage,peopleBag);
        CustomerController customerController = new CustomerController(customer,pane4Customer);
        primaryStage.setScene(pane4Login.getScene());


        primaryStage.show();
    }

}





