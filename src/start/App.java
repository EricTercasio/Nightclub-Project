package start;

import controller.*;
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
        primaryStage.centerOnScreen();
        PeopleBag peopleBag = new PeopleBag();
        peopleBag = peopleBag.loadFile();
        Pane4Login pane4Login = new Pane4Login();
        Pane4CreateAccount pane4CreateAccount = new Pane4CreateAccount();
        Pane4Customer pane4Customer = new Pane4Customer();
        Pane4Manager pane4Manager = new Pane4Manager();
        Pane4Owner pane4Owner = new Pane4Owner();
        Pane4BuyATicket pane4BuyATicket= new Pane4BuyATicket();
        Pane4BuyATable pane4BuyATable = new Pane4BuyATable();
        Pane4ViewMenu pane4ViewMenu = new Pane4ViewMenu();
        Pane4ViewReceipt pane4ViewReceipt = new Pane4ViewReceipt();
        LoginController loginController = new LoginController(peopleBag,pane4CreateAccount,pane4Customer,pane4Login,pane4Owner,pane4Manager,primaryStage);
        CreateNewAccountController createNewAccountController = new CreateNewAccountController(pane4CreateAccount,pane4Login,primaryStage,peopleBag);
        CustomerController customerController = new CustomerController(pane4Customer,pane4Login,peopleBag,pane4BuyATicket,pane4BuyATable,pane4ViewMenu,pane4ViewReceipt,primaryStage);
        ManagerController managerController = new ManagerController(pane4Manager,pane4Login,peopleBag,primaryStage);
        TableController tableController = new TableController(pane4BuyATable, peopleBag, pane4Customer, primaryStage);
        TicketController ticketController = new TicketController(pane4BuyATicket,pane4Customer, peopleBag,primaryStage);
        MenuController menuController = new MenuController(pane4ViewMenu,pane4Customer,primaryStage,peopleBag);
        primaryStage.setScene(pane4Login.getScene());
        primaryStage.centerOnScreen();


        primaryStage.show();
    }

}





