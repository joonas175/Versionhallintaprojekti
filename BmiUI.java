import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BmiUI extends Application {

    @Override public void start(Stage stage) {
        GridPane pane = new GridPane();
        BmiLogic logic = new BmiLogic();
        makePane(pane, logic);
        Scene scene = new Scene(pane);

        stage.setTitle("BMI Calculator"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    public static void makePane(GridPane pane, BmiLogic logic) {
        Text heighttxt = new Text("Height: ");
        Text weighttxt = new Text("Weight: ");
        Text result = new Text("Result: ");
        TextArea heightInp = new TextArea();
        TextArea weightInp = new TextArea();
        Button calculateBtn = new Button("Calculate");

        calculateBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                logic.setHeight(Integer.parseInt(heightInp.getText()));
                logic.setWeight(Integer.parseInt(weightInp.getText()));
                logic.generateBMI();
                result.setText("Result: " + logic.getBmiValue());
            }
        });

        Button exitBtn = new Button("Exit");

        exitBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            }
        });

        pane.add(heighttxt, 0,0,2,1);
        pane.add(heightInp, 0,1,2,1);
        pane.add(weighttxt, 0,2,2,1);
        pane.add(weightInp, 0,3,2,1);
        pane.add(result, 0,4,2,1);
        pane.add(calculateBtn,0,5,1,1);
        pane.add(exitBtn,1,5,1,1);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}