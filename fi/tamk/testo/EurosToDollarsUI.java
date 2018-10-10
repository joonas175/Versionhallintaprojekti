package fi.tamk.testo;

import javafx.event.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class EurosToDollarsUI extends Application {
    GridPane pane;
    TextField textField;
    TextField textFieldOutput;
    Text error;


    
    @Override public void start(Stage stage) {
        pane = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(200);
        ColumnConstraints column3 = new ColumnConstraints(50);
        ColumnConstraints column4 = new ColumnConstraints(100);
        pane.getColumnConstraints().addAll(column1, column2, column3, column4);
        initializePane();
        Scene scene = new Scene(pane);
        
        stage.setTitle("Euros to Dollars converter"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }



    public void initializePane(){
        Text calc = new Text(10, 40, "Convert euros to dollars");
        calc.setFont(new Font(30));
        calc.setTextAlignment(TextAlignment.CENTER);
        Text fahren = new Text(10, 40, "Euros:");
        fahren.setFont(new Font(20));
        fahren.setTextAlignment(TextAlignment.CENTER);
        Text celci = new Text(10, 40, "Dollars: ");
        celci.setFont(new Font(20));
        celci.setTextAlignment(TextAlignment.CENTER);

        error = new Text(10, 40, "not valid numbers");
        error.setFont(new Font(10));
        error.setFill(Color.WHITESMOKE);

        Button calculate = new Button("Calculate");
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                calculateButtonEvent();
            }
        });
        
        textField = new TextField("1");
        textFieldOutput = new TextField("-17.22");

        pane.add(calc, 0, 0, 1, 1);
        pane.add(fahren, 1, 1, 1, 1);
        pane.add(celci, 1, 2, 1, 1);
        pane.add(calculate, 3, 3, 1, 1);
        pane.add(textField, 3, 1);
        pane.add(textFieldOutput, 3, 2);
        pane.add(error, 1, 3, 1, 1);
        pane.setHalignment(calculate, HPos.CENTER);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
    }

    public void calculateButtonEvent() {


    }

}