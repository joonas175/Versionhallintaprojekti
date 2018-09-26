import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
/* 
 *
 *
 */
public class UI extends Application{
    
    @Override public void start(Stage stage) {
        GridPane pane = new GridPane();
        Text text = new Text(10, 40, "Pick a feature");
        text.setFont(new Font(40));
        text.setTextAlignment(TextAlignment.CENTER);
        Button bmiButton = new Button("BMI Calculator");
        pane.add(text, 0, 0, 1, 1);
        pane.add(bmiButton, 0, 1, 1, 1);
        pane.setHalignment(bmiButton, HPos.CENTER);
        Scene scene = new Scene(pane);
        

        stage.setTitle("Welcome to JavaFX!"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    public static void main(String[] args){
        Application.launch(args);
    }
    
}