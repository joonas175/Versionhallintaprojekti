import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.application.Application;
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

public class MilesConverterUI extends Application{

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

    public static void initPane(GridPane pane) {
        Text text = new Text(10, 40, "Miles - Km converter");
        text.setFont(new Font(40));
        text.setTextAlignment(TextAlignment.CENTER);
        Button convertToMilesButton = new Button("Convert to miles!");
        Button convertToKmButton = new Button("Convert to kilometers!");
        TextArea inputArea = new TextArea();
        TextArea resultArea = new TextArea();
        inputArea.setPromptText("Miles/Kilometers");
        resultArea.setPromptText("Result");

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

        pane.add(text, 0, 0, 1, 1);
        pane.add(convertToMilesButton, 2, 3, 1, 1);
        pane.add(convertToKmButton, 1, 3, 1, 1);
        pane.add(inputArea, 0, 1, 1, 1);
        pane.add(resultArea, 0, 2, 1, 1);
        //pane.setHalignment(convertToMilesButton, HPos.CENTER);
        //pane.setHalignment(convertToKmButton, HPos.CENTER);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}