import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.application.Application;
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
        Text text = new Text(10, 40, "Miles - KM converter");
        text.setFont(new Font(40));
        text.setTextAlignment(TextAlignment.CENTER);
        Button convertButton = new Button("Convert!");
        TextArea milesArea = new TextArea();
        TextArea kmArea = new TextArea();

        pane.add(text, 0, 0, 1, 1);
        pane.add(convertButton, 0, 2, 1, 1);
        pane.add(milesArea, 0, 1, 1, 1);
        pane.add(kmArea, 0, 0, 1, 1);
        pane.setHalignment(convertButton, HPos.CENTER);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}