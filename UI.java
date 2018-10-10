import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import fi.tamk.testo.EurosToDollarsUI;
/** 
 * Main menu of the application. 
 * 
 * This is the main menu of the application. It's start method is called by the Main class, which creates
 * a new window.
 * @author Joonas Salojärvi
 * @version 2018.1001
 *
 */
public class UI extends Application{

    /**
     * This method handles the construction of the window.
     * 
     * This method is the first on to be called in this class.
     * @param stage Mandatory by Application-class
     */
    
    @Override public void start(Stage stage) {
        GridPane pane = new GridPane();
        initializePane(pane);
        Scene scene = new Scene(pane);
        
        stage.setTitle("Multipurpose app"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    /**
     * Initializes the given GridPane.
     * 
     * Adds all needed elements, like buttons and text.
     * 
     * @param pane GridPane, where the elements will be added
     */
    public static void initializePane(GridPane pane){
        Text text = new Text(10, 40, "Pick a feature");
        text.setFont(new Font(40));
        text.setTextAlignment(TextAlignment.CENTER);
        pane.add(text, 0, 0, 1, 1);

        Button bmiButton = new Button("BMI Calculator");
        bmiButton.setOnAction((event) ->new BmiUI().start(new Stage()));
        pane.add(bmiButton, 0, 1, 1, 1);
        pane.setHalignment(bmiButton, HPos.CENTER);

        Button mileToKmButton = new Button("Miles to Kilometers converter");
        mileToKmButton.setOnAction((event) -> new MilesConverterUI().start(new Stage()));
        pane.add(mileToKmButton, 0, 2, 1, 1);
        pane.setHalignment(mileToKmButton, HPos.CENTER);

        Button fahrenheitToCelciusButton = new Button("Fahrenheit to celcius converter");
        fahrenheitToCelciusButton.setOnAction((event) -> new FahrenheitToCelcius().start(new Stage()));
        pane.add(fahrenheitToCelciusButton, 0, 3, 1, 1);
        pane.setHalignment(fahrenheitToCelciusButton, HPos.CENTER);

        Button eurosToDollars = new Button("Euros to Dollars converter");
        eurosToDollars.setOnAction((event) -> new EurosToDollarsUI().start(new Stage()));
        pane.add(eurosToDollars, 0, 4, 1, 1);
        pane.setHalignment(eurosToDollars, HPos.CENTER);

        pane.setVgap(20);
        pane.setPadding(new Insets(20));
    }

    public static void main(String[] args){
        Application.launch(args);
    }

}