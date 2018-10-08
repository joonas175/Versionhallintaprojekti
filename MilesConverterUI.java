import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * Interface of the Miles-To-Kilometers converter.
 * 
 * This is interface for the converter. Start method creates a new window which houses the converter.
 * @author Lauri Laiho
 * @since 08.10.2018
 */
public class MilesConverterUI extends Application{

    /**
     * This method creates the window for the converter
     * 
     * Method is invoked to create the window, with which the user can interact with.
     * @param stage Mandatory by Application-class
     */
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        initPane(pane);
        Scene converterScene = new Scene(pane);

        primaryStage.setTitle("Miles to Kilometers converter.");
        primaryStage.setScene(converterScene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    /**
     * Initializes the given GridPane.
     * 
     * Adds and initializes all needed elements, like buttons and text.
     * 
     * @param pane GridPane, where the elements will be added
     */
    public static void initPane(GridPane pane) {
        Text text = new Text(10, 40, "Miles - Km converter");
        Button convertToMilesButton = new Button("Convert to miles!");
        Button convertToKmButton = new Button("Convert to kilometers!");
        Button exitButton = new Button("Exit");
        TextArea inputArea = new TextArea();
        TextArea resultArea = new TextArea();

        setTextAreaPrompts(inputArea, resultArea, "Miles/Kilometers", "Result");
        text.setFont(new Font(40));
        text.setTextAlignment(TextAlignment.CENTER);

        convertToMilesButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Convert to miles");
                MilesConverterLogic logic = new MilesConverterLogic();
                resultArea.setText(Float.toString(logic.convertMilesToKm(Float.parseFloat(inputArea.getText()))));
            }
        });

        convertToKmButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Convert to kilometers");
                MilesConverterLogic logic = new MilesConverterLogic();
                resultArea.setText(Float.toString(logic.convertKmToMiles(Float.parseFloat(inputArea.getText()))));
            }
        });

        exitButton.setOnAction((e) -> Platform.exit());

        pane.add(text, 0, 0, 1, 1);
        pane.add(convertToMilesButton, 2, 3, 1, 1);
        pane.add(convertToKmButton, 1, 3, 1, 1);
        pane.add(exitButton, 3, 3, 1, 1);
        pane.add(inputArea, 0, 1, 1, 1);
        pane.add(resultArea, 0, 2, 1, 1);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
    }

    /**
     * Adds given Strings as text prompts to given TextAreas.
     * 
     * Adds given Strings as text prompts to given TextAreas.
     * 
     * @param ia TextArea, where the input prompt will be added
     * @param ra TextArea, where the result prompt will be added
     * @param ip String, which is added as a prompt to the input area
     * @param rp String, which is added as a prompt to the result area
     */
    public static void setTextAreaPrompts(TextArea ia, TextArea ra, String ip, String rp) {
        ia.setPromptText(ip);
        ra.setPromptText(rp);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}