package controller;

import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Customer;
import model.PeopleBag;
import model.Table;
import view.Pane4BuyATable;
import view.Pane4Customer;
import view.Pane4ViewReceipt;


/**
 * Created by Kitcatski on 12/12/2016.
 */
public class TableController {

    public TableController(Pane4BuyATable pane4BuyATable, PeopleBag peopleBag, Pane4Customer pane4Customer, Stage stage) {

        //Customer customer = (Customer) peopleBag.findByUsername(username);
        pane4BuyATable.getNumberBox().setOnAction(e -> {
                    pane4BuyATable.getChairBox().getChildren().clear();
                    if (pane4BuyATable.getNumberBox().getSelectionModel().getSelectedItem() != null) {
                        int selection = Integer.parseInt(pane4BuyATable.getNumberBox().getSelectionModel().getSelectedItem());
                        String price = String.valueOf(selection * 10);
                        pane4BuyATable.getPrice().setText("Price: $" + price);
                        String tableNumber = (String.valueOf(selection - 1));
                        pane4BuyATable.getTableNumber().setText("Table Number: " + tableNumber);
                        for (int i = 0; i < selection; i++) {
                            ImageView iv = new ImageView(pane4BuyATable.getImage());
                            iv.setFitWidth(80);
                            iv.setPreserveRatio(true);
                            iv.setSmooth(true);
                            iv.setCache(true);
                            pane4BuyATable.getChairBox().getChildren().add(i, iv);
                        }
                    }
                }

        );
        pane4BuyATable.getBuyATableButton().setOnAction(e->{
            int tableNumber = Integer.parseInt(pane4BuyATable.getNumberBox().getSelectionModel().getSelectedItem()) - 1;
            int seats = tableNumber + 1;
            int cost = (seats * 10);
            Table t = new Table(tableNumber,seats,cost);
            String name = pane4Customer.getCustomerName().getText();
            String username = name.substring(name.indexOf("|")+1);
            username = username.trim();
            Customer customer = (Customer)peopleBag.findByUsername(username);
            customer.getReceipt().getTableBag().add(t);
            customer.getReceipt().addToTotal(t);
            peopleBag.writeFile();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Success!");
            alert.setContentText("Table #" +t.getTableNumber()+ " has been added to your order!"+
                    "\n Your current total is $" +customer.getReceipt().getTotal());
            alert.showAndWait();


        });
        pane4BuyATable.getReturnButton().setOnAction(e->{
            stage.setScene(pane4Customer.getScene());
            pane4BuyATable.getNumberBox().getSelectionModel().clearSelection();
            pane4BuyATable.getPrice().setText("Price: ");
            pane4BuyATable.getTableNumber().setText("Table Number: ");
            pane4BuyATable.getChairBox().getChildren().removeAll();
        });

    }

    }

