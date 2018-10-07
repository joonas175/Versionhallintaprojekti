import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BmiUI extends Application {

    @Override public void start(Stage stage) {
        GridPane pane = new GridPane();
        makePane(pane);
        Scene scene = new Scene(pane);

        stage.setTitle("BMI Calculator"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    public static void makePane(GridPane pane) {

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}