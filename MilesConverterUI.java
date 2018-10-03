import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;

class MilesToKmUI extends Application{
    @Override
    public void start(Stage primaryStage) {
        Scene converterScene = new Scene(new Group());

        primaryStage.setTitle("Miles to Kilometers converter.");
        primaryStage.setScene(converterScene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}