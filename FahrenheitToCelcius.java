import javafx.event.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
/** 
 * 
 * @author Anna Mälkiä
 * @version 2018.1002
 *
 */
public class FahrenheitToCelcius extends Application {
    String fahrenString;
    String celciString;
    int fahrenInt;
    int celciInt;
    TextField textFieldF;
    TextField textFieldC;

    /**
     * This method handles the construction of the window.
     * 
     * This method is the first on to be called in this class.
     * @param stage Mandatory by Application-class
     */
    
    @Override public void start(Stage stage) {
        GridPane pane = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(325);
        ColumnConstraints column3 = new ColumnConstraints(50);
        pane.getColumnConstraints().addAll(column1, column2, column3);
        initializePane(pane);
        Scene scene = new Scene(pane);
        
        stage.setTitle("Fahrenheit to Celcius converter"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    /**
     * Initializes the given GridPane.
     * 
     * Adds all needed elements, like buttons and text.
     * 
     * @param pane GridPane, where the elements will be added
     */
    public void initializePane(GridPane pane){
        Text calc = new Text(10, 40, "Calculate fahrenheits to celcius");
        calc.setFont(new Font(30));
        calc.setTextAlignment(TextAlignment.CENTER);
        Text fahren = new Text(10, 40, "Fahrenheit:");
        fahren.setFont(new Font(20));
        fahren.setTextAlignment(TextAlignment.CENTER);
        Text celci = new Text(10, 40, "Celcius:");
        celci.setFont(new Font(20));
        celci.setTextAlignment(TextAlignment.CENTER);
        Button calculate = new Button("Calculate");
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("Accepted");
            }
        });
        
        textFieldF = new TextField("1");
        textFieldC = new TextField("-17.22");
        //textFieldF.addActionListener(this);

        pane.add(calc, 0, 0, 1, 1);
        pane.add(fahren, 1, 1, 1, 1);
        pane.add(celci, 1, 2, 1, 1);
        pane.add(calculate, 1, 3, 1, 1);
        pane.add(textFieldF, 2, 1);
        pane.add(textFieldC, 2, 2);
        pane.setHalignment(calculate, HPos.CENTER);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
    }

    public void handle(ActionEvent e) {
        String text = textFieldF.getText();
        System.out.println(text);
        //textField.selectAll();
 
        //Make sure the new text is visible, even if there
        //was a selection in the text area.
        //textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public static void main(String[] args){
        Application.launch(args);
    }
    
}