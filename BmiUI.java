import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

class BmiUi extends Application{

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        setPane(pane);
        Scene scene = new Scene(pane);
        stage.setTitle("BMI Calculator");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public void setPane(GridPane pane) {
        Button button = new Button("test");
        pane.add(button, 0, 0, 1, 1);
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}