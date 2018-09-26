import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.Button;

/* 
 *
 *
 */
public class UI extends Application{
    
    @Override public void start(Stage stage) {
        Text text = new Text(10, 40, "Pick a feature");
        text.setFont(new Font(40));
        Button bmiButton = new Button("BMI Calculator");
        Group group = new Group();
        group.getChildren().add(text);
        Scene scene = new Scene(group);
        

        stage.setTitle("Welcome to JavaFX!"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    public static void main(String[] args){
        Application.launch(args);
    }
    
}