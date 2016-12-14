package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
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
    private VBox createEmployeePane;
    private HBox loggedInAsBox;
    private VBox titleBox;
    private HBox buttonBox;
    private VBox employeeVBox;
    private HBox positionBox;
    private HBox salaryBox;
    private HBox scheduleBox;
    private HBox sundayToTuesdayBox;
    private HBox wednesdayToSaturdayBox;
    private HBox headerBox;
    private HBox employeeTitleBox;
    private VBox salaryScheduleBox;


    //Text
    private Text managerTitle;
    private Text headerText;
    private Text loggedInAs;
    private Text employeeText;

    //Labels
    private Label position;
    private Label salary;
    private Label schedule;
    //TextFields
    private TextField salaryField;
    private TextField sundayField;
    private TextField mondayField;
    private TextField tuesdayField;
    private TextField wednesdayField;
    private TextField thursdayField;
    private TextField fridayField;
    private TextField saturdayField;
    //Buttons and ComboBox
    private Button logOutButton;
    private Button addEmployeeButton;
    private Button removeEmployeeButton;
    private Button modifyEmployeeButton;
    private ComboBox<String> peopleBox;
    private ComboBox<String> positionDropBox;

    public Pane4Manager(){
        //Initialize Panes
        pane4CreateAccount = new Pane4CreateAccount(); //Used to get create account pane so i dont have to rewrite all of the nodes
        createEmployeePane = pane4CreateAccount.getPane(); //Which is put into createEmployeePane
        managerPane = new GridPane();
        employeeVBox = new VBox();
        buttonBox = new HBox();
        titleBox = new VBox();
        positionBox = new HBox();
        salaryBox = new HBox();
        scheduleBox = new HBox();
        sundayToTuesdayBox = new HBox();
        wednesdayToSaturdayBox = new HBox();
        salaryScheduleBox = new VBox();
        headerBox = new HBox();
        loggedInAsBox = new HBox();
        employeeTitleBox = new HBox();
        //Initialize text
        managerTitle = new Text("|Manager Window");
        loggedInAs = new Text();
        loggedInAs.setFont(Font.font("Century Gothic",30));
        loggedInAs.setFill(Color.RED);
        managerTitle.setFont(Font.font("Century Gothic",30));
        headerText = new Text();
        position = new Label("Position: ");
        salary = new Label("Salary: ");
        schedule = new Label("Schedule: ");
        employeeText = new Text("Employee's");
        employeeText.setFont(Font.font("Century Gothic", 15));

        //Initalize TextFields
        salaryField = new TextField();
        salaryField.setPromptText("$10,000");
        sundayField = new TextField();
        sundayField.setPromptText("Sunday");
        mondayField = new TextField();
        mondayField.setPromptText("Monday");
        tuesdayField = new TextField();
        tuesdayField.setPromptText("Tuesday");
        wednesdayField = new TextField();
        wednesdayField.setPromptText("Wednesday");
        thursdayField = new TextField();
        thursdayField.setPromptText("Thursday");
        fridayField = new TextField();
        fridayField.setPromptText("Friday");
        saturdayField = new TextField();
        saturdayField.setPromptText("Saturday");
        //Initialize comboBox
        peopleBox = new ComboBox<>();
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Bartender", "Janitor", "Bouncer", "Chef","Waiter","Promoter"
                );
        positionDropBox = new ComboBox<>(options);
        //Initialize Buttons
        logOutButton = new Button("Log out");
        logOutButton.setAlignment(Pos.BOTTOM_RIGHT);
        removeEmployeeButton = new Button("Remove");
        addEmployeeButton = new Button("Add");
        modifyEmployeeButton = new Button("Modify");
        pane4CreateAccount.getPreviousScreen().setText("Clear");
        //Add nodes to panes
        employeeTitleBox.getChildren().add(employeeText);
        employeeTitleBox.setAlignment(Pos.CENTER);
        loggedInAsBox.getChildren().addAll(loggedInAs,managerTitle);
        loggedInAsBox.setAlignment(Pos.CENTER);
        headerBox.getChildren().add(headerText);
        headerBox.setAlignment(Pos.CENTER);
        positionBox.getChildren().addAll(position,positionDropBox);
        positionBox.setSpacing(110);
        positionBox.setAlignment(Pos.CENTER);
        salaryBox.getChildren().addAll(salary,salaryField);
        salaryBox.setSpacing(50);
        salaryBox.setAlignment(Pos.CENTER);
        scheduleBox.getChildren().add(schedule);
        scheduleBox.setAlignment(Pos.CENTER);
        sundayToTuesdayBox.getChildren().addAll(sundayField,mondayField,tuesdayField);
        sundayToTuesdayBox.setAlignment(Pos.CENTER);
        wednesdayToSaturdayBox.getChildren().addAll(wednesdayField,thursdayField,fridayField,saturdayField);
        wednesdayToSaturdayBox.setAlignment(Pos.CENTER);
        salaryScheduleBox.getChildren().addAll(positionBox,salaryBox,scheduleBox,sundayToTuesdayBox,wednesdayToSaturdayBox);
        salaryScheduleBox.setSpacing(15);
        salaryScheduleBox.setAlignment(Pos.CENTER);
        createEmployeePane.getChildren().add(12,salaryScheduleBox);
        buttonBox.getChildren().addAll(addEmployeeButton,modifyEmployeeButton,removeEmployeeButton);
        buttonBox.setSpacing(15);
        buttonBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().addAll(loggedInAsBox,employeeTitleBox,peopleBox,buttonBox);
        titleBox.setSpacing(15);
        titleBox.setPadding(new Insets(10,0,0,0));
        titleBox.setAlignment(Pos.TOP_CENTER);
        createEmployeePane.getChildren().remove(0); // Removes "Create new Account" from pane
        createEmployeePane.getChildren().remove(2); // Removes gender toggles from pane
        createEmployeePane.getChildren().add(0,headerBox);
        createEmployeePane.setVisible(false);
        employeeVBox.getChildren().addAll(titleBox,createEmployeePane,logOutButton);
        employeeVBox.setSpacing(15);
        managerPane.getChildren().addAll(employeeVBox);
        managerPane.setAlignment(Pos.TOP_CENTER);
        managerPane.setStyle("-fx-background: #AFCEC4;");
        scene = new Scene(managerPane,1000,1000);


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

    public VBox getCreateEmployeePane(){
        return createEmployeePane;
    }

    public TextField getSalaryField(){
        return salaryField;
    }

    public TextField getSundayField(){
        return sundayField;
    }

    public TextField getMondayField() {
        return mondayField;
    }

    public TextField getTuesdayField() {
        return tuesdayField;
    }

    public TextField getWednesdayField() {
        return wednesdayField;
    }

    public TextField getThursdayField() {
        return thursdayField;
    }

    public TextField getFridayField() {
        return fridayField;
    }

    public TextField getSaturdayField() {
        return saturdayField;
    }

    public Button getLogOutButton() {
        return logOutButton;
    }

    public Button getAddEmployeeButton() {
        return addEmployeeButton;
    }

    public Button getRemoveEmployeeButton() {
        return removeEmployeeButton;
    }

    public Button getModifyEmployeeButton() {
        return modifyEmployeeButton;
    }

    public Text getLoggedInAs() {
        return loggedInAs;
    }

    public Text getHeaderText(){return headerText;}

    public ComboBox<String> getPositionDropMenu(){return positionDropBox;}
}
