package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Kitcatski on 11/28/2016.
 */
public class Pane4BuyATicket {
    private GridPane buyATicketPane;
    private VBox djKhaledBox;
    private VBox foxBox;
    private VBox tupacBox;
    private VBox dennisBox;
    private HBox kahledFoxBox;
    private HBox tupacDennisBox;
    private HBox buttonBox;
    private VBox pane;
    private Text introText;
    private Text kahledPrice;
    private Text foxPrice;
    private Text tupacPrice;
    private Text dennisPrice;
    private Text kahledTitle;
    private Text foxTitle;
    private Text tupacTitle;
    private Text dennisTitle;
    private Button buyATicketButton;
    private Button returnButton;
    private CheckBox ticket1;
    private CheckBox ticket2;
    private CheckBox ticket3;
    private CheckBox ticket4;
    private Scene scene;
    private ImageView djKhaled;
    private ImageView fox;
    private ImageView tupac;
    private ImageView dennis;
    private Image image;
    private Image image2;
    private Image image3;
    private Image image4;
    private Font lucidaConsole = new Font("Lucida Console",40);
    private Group group;

    public Pane4BuyATicket(){
        //Initialize panes
        buyATicketPane = new GridPane();
        pane = new VBox();
        djKhaledBox = new VBox();
        foxBox = new VBox();
        tupacBox = new VBox();
        dennisBox = new VBox();
        kahledFoxBox = new HBox();
        tupacDennisBox = new HBox();
        buttonBox = new HBox();
        //Initalize Images
        image = new Image("djKhaled.png");
        image2 = new Image("fox.jpg");
        image3 = new Image("tupac.png");
        image4 = new Image("dennis.png");
        //Initalize imageViews
        djKhaled = new ImageView(image);
        fox = new ImageView(image2);
        tupac = new ImageView(image3);
        dennis = new ImageView(image4);
        //Set Widths & Heights
        djKhaled.setFitWidth(300);
        djKhaled.setPreserveRatio(true);
        djKhaled.setSmooth(true);
        djKhaled.setCache(true);

        fox.setFitWidth(175);
        fox.setPreserveRatio(true);
        fox.setSmooth(true);
        fox.setCache(true);

        tupac.setFitWidth(300);
        tupac.setPreserveRatio(true);
        tupac.setSmooth(true);
        tupac.setCache(true);

        dennis.setFitWidth(210);
        dennis.setPreserveRatio(true);
        dennis.setSmooth(true);
        dennis.setCache(true);
        //Initalize text and labels
        introText = new Text("Order a ticket to an event");
        introText.setFont(new Font("Century Gothic",40));
        kahledTitle = new Text("DJ Khaled");
        kahledTitle.setFont(lucidaConsole);
        foxTitle = new Text("DJ Fox");
        foxTitle.setFont(lucidaConsole);
        tupacTitle = new Text("Tupac");
        tupacTitle.setFont(lucidaConsole);
        dennisTitle = new Text("The Akinator");
        dennisTitle.setFont(lucidaConsole);
        kahledPrice = new Text("$150");
        kahledPrice.setFont(lucidaConsole);
        kahledPrice.setFill(Color.GREEN);
        foxPrice = new Text("$200");
        foxPrice.setFill(Color.GREEN);
        foxPrice.setFont(lucidaConsole);
        tupacPrice = new Text("$1000");
        tupacPrice.setFill(Color.GREEN);
        tupacPrice.setFont(lucidaConsole);
        dennisPrice = new Text("$5");
        dennisPrice.setFill(Color.GREEN);
        dennisPrice.setFont(lucidaConsole);
        //Initalize CheckBox
        ticket1 = new CheckBox("December 5th, 2016");
        ticket1.setFont(new Font("‘Lucida Console",20));
        ticket2 = new CheckBox("December 10th, 2016");
        ticket2.setFont(new Font("‘Lucida Console",20));
        ticket3 = new CheckBox("December 11th, 2016" );
        ticket3.setFont(new Font("‘Lucida Console",20));
        ticket4 = new CheckBox("January 8th, 2017");
        ticket4.setFont(new Font("‘Lucida Console",20));
        //Initalize button
        buyATicketButton = new Button("Add to order");
        returnButton = new Button("Return");
        //Add nodes to pane
        djKhaledBox.getChildren().addAll(ticket1,kahledTitle,djKhaled,kahledPrice);
        djKhaledBox.setAlignment(Pos.CENTER);

        foxBox.getChildren().addAll(ticket2,foxTitle,fox,foxPrice);
        foxBox.setAlignment(Pos.CENTER);

        tupacBox.getChildren().addAll(ticket3,tupacTitle,tupac,tupacPrice);
        tupacBox.setAlignment(Pos.CENTER);

        dennisBox.getChildren().addAll(ticket4,dennisTitle,dennis,dennisPrice);
        dennisBox.setAlignment(Pos.CENTER);

        kahledFoxBox.getChildren().addAll(djKhaledBox,foxBox);
        kahledFoxBox.setSpacing(65);
        tupacDennisBox.getChildren().addAll(tupacBox,dennisBox);
        tupacDennisBox.setSpacing(50);
        buttonBox.getChildren().addAll(returnButton,buyATicketButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(50);

        pane.getChildren().addAll(introText,kahledFoxBox,tupacDennisBox,buttonBox);
        pane.setSpacing(30);
        pane.setAlignment(Pos.CENTER);
        buyATicketPane.getChildren().add(pane);
        buyATicketPane.setAlignment(Pos.CENTER);
        buyATicketPane.setStyle("-fx-background: #AFCEC4;");
        scene = new Scene(buyATicketPane,1000,1000);

    }
    public Scene getScene(){
        return scene;
    }

    public Button getBuyATicketButton(){
        return buyATicketButton;
    }
    public Button getReturnButton(){
        return returnButton;
    }

    public CheckBox getTicket1() {
        return ticket1;
    }

    public CheckBox getTicket2() {
        return ticket2;
    }

    public CheckBox getTicket3() {
        return ticket3;
    }

    public CheckBox getTicket4() {
        return ticket4;
    }
}
