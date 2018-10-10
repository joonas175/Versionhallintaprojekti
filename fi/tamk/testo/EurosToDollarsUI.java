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
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import java.text.NumberFormat;

import fi.tamk.testo.EurosToDollars;

import java.io.IOException;
import java.text.DecimalFormat;


public class EurosToDollarsUI extends Application {
    GridPane pane;
    TextField textField;
    TextField textFieldOutput;
    RadioButton button1;
    RadioButton button2;
    ToggleGroup group;


    
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
        Text euros = new Text(10, 40, "Euros:");
        euros.setFont(new Font(20));
        euros.setTextAlignment(TextAlignment.CENTER);
        Text dollars = new Text(10, 40, "Dollars: ");
        dollars.setFont(new Font(20));
        dollars.setTextAlignment(TextAlignment.CENTER);

        Button calculate = new Button("Calculate");
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                calculateButtonEvent();
            }
        });
        
        textField = new TextField("1");
        textFieldOutput = new TextField("Output");

        group = new ToggleGroup();
        button1 = new RadioButton("From euros");
        button1.setToggleGroup(group);
        button1.setSelected(true);
        button2 = new RadioButton("From dollars");
        button2.setToggleGroup(group);

        pane.add(calc, 0, 0, 1, 1);
        pane.add(euros, 1, 1, 1, 1);
        pane.add(dollars, 1, 2, 1, 1);

        pane.add(calculate, 3, 4, 1, 1);

        pane.add(textField, 3, 1, 2, 1);
        pane.add(textFieldOutput, 3, 2, 2, 1);
        pane.add(button1, 1, 3);
        pane.add(button2, 2, 3, 2, 1);
        pane.setHalignment(calculate, HPos.CENTER);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
    }

    public void calculateButtonEvent() {
        if(button1.isSelected()){
            try{
                textFieldOutput.setText(EurosToDollars.convertEURToUSD(Integer.parseInt(textField.getText())) + " USD");
            } catch(Exception e){
                textFieldOutput.setText("Error");
            }
        } else if(button2.isSelected()){
            try{
                textFieldOutput.setText(EurosToDollars.convertUSDToEUR(Integer.parseInt(textField.getText())) + " EUR");
            } catch(Exception e){
                textFieldOutput.setText("Error");
            }
        }

    }

}