package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import model.Customer;
import model.Food;
import model.PeopleBag;
import view.Pane4Customer;
import view.Pane4ViewMenu;

import static java.lang.Math.abs;

/**
 * Created by Kitcatski on 12/14/2016.
 */
public class MenuController {

    public MenuController(Pane4ViewMenu pane4ViewMenu, Pane4Customer pane4Customer, Stage stage, PeopleBag peopleBag){
            pane4ViewMenu.getReturnButton().setOnAction(e->{
                stage.close();
                stage.setScene(pane4Customer.getScene());
                stage.show();
                clearTheBoxes(pane4ViewMenu);
            });
            pane4ViewMenu.getPurchaseButton().setOnAction(e->{
                if (pane4ViewMenu.getCheckFood1().isSelected() == false && pane4ViewMenu.getCheckFood2().isSelected() == false &&
                        pane4ViewMenu.getCheckFood3().isSelected()== false && pane4ViewMenu.getCheckFood4().isSelected() == false &&
                        pane4ViewMenu.getCheckFood5().isSelected()== false && pane4ViewMenu.getCheckFood6().isSelected() == false &&
                                pane4ViewMenu.getCheckDrink1().isSelected() == false && pane4ViewMenu.getCheckDrink2().isSelected() == false &&
                                pane4ViewMenu.getCheckDrink3().isSelected()== false && pane4ViewMenu.getCheckDrink4().isSelected() == false &&
                                pane4ViewMenu.getCheckDrink5().isSelected()== false && pane4ViewMenu.getCheckDrink6().isSelected() == false) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please select an item");
                    alert.showAndWait();
                }else{
                    String name = pane4Customer.getCustomerName().getText();
                    String username = name.substring(name.indexOf("|") + 1);
                    username = username.trim();
                    Customer customer = (Customer) peopleBag.findByUsername(username);
                    int total = customer.getReceipt().getFoodBag().getNElms();
                    int numOfFood = customer.getReceipt().getFoodBag().getNElms();
                    System.out.println(total);
                    checkTheBoxes(pane4ViewMenu, customer);
                    total = abs(total - customer.getReceipt().getFoodBag().getNElms());
                    System.out.println(total);
                    successAlert(total, customer.getReceipt().getTotal());
                    customer.getReceipt().getFoodBag().display();
                    peopleBag.writeFile();
                    clearTheBoxes(pane4ViewMenu);
                }
            });

    }
    public void checkTheBoxes(Pane4ViewMenu pane4ViewMenu, Customer customer){
        if(pane4ViewMenu.getCheckFood1().isSelected()){
            Food f = new Food("Pizza", 2);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckFood2().isSelected()){
            Food f = new Food("Hamburger", 3);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckFood3().isSelected()){
            Food f = new Food("Salad", 5);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckFood4().isSelected()){
            Food f = new Food("Chicken Tenders", 5);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckFood5().isSelected()){
            Food f = new Food("Chicken Sandwich", 3);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckFood6().isSelected()){
            Food f = new Food("Pasta", 5);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckDrink1().isSelected()){
            Food f = new Food("Wine", 10);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckDrink2().isSelected()){
            Food f = new Food("Beer", 4);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckDrink3().isSelected()){
            Food f = new Food("Vodka", 10);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckDrink4().isSelected()){
            Food f = new Food("Water", 0);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckDrink5().isSelected()){
            Food f = new Food("Tea", 2);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
        if(pane4ViewMenu.getCheckDrink6().isSelected()){
            Food f = new Food("Coke", 2);
            customer.getReceipt().getFoodBag().add(f);
            customer.getReceipt().addToTotal(f);
        }
    }
    public void clearTheBoxes(Pane4ViewMenu pane4ViewMenu){
        pane4ViewMenu.getCheckFood1().setSelected(false);
        pane4ViewMenu.getCheckFood2().setSelected(false);
        pane4ViewMenu.getCheckFood3().setSelected(false);
        pane4ViewMenu.getCheckFood4().setSelected(false);
        pane4ViewMenu.getCheckFood5().setSelected(false);
        pane4ViewMenu.getCheckFood6().setSelected(false);
        pane4ViewMenu.getCheckDrink1().setSelected(false);
        pane4ViewMenu.getCheckDrink2().setSelected(false);
        pane4ViewMenu.getCheckDrink3().setSelected(false);
        pane4ViewMenu.getCheckDrink4().setSelected(false);
        pane4ViewMenu.getCheckDrink5().setSelected(false);
        pane4ViewMenu.getCheckDrink6().setSelected(false);
    }
    public void successAlert(int numOfFood, int total){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success!");
        alert.setContentText(numOfFood + " items have been added to your total\n" +"Your current total is $" +total);
        alert.showAndWait();
    }

}
