import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

class MilesToKmUI extends Application{

    public MilesToKmUI(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        Scene converterScene = new Scene(pane);

        primaryStage.setTitle("Miles to Kilometers converter.");
        primaryStage.setScene(converterScene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}