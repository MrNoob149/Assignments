package view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import controller.ConverterController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class ConverterUI extends Application {

    public void start(Stage stage) {
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);


        Label mine = new Label("Enter your currency: ");
        Label yours = new Label("Converted currency: ");
        Label welcome = new Label("Welcome to Currency Converter");
        TextField converter = new TextField();
        converter.setPromptText("Enter your currency");

        Button button = new Button("convert");
        TextField results = new TextField();
        results.setEditable(false);
        Label instruct = new Label("Choose the currency, enter the amount and click 'convert'");

        String currency[] = {"USD", "JPY", "VND"};
        ComboBox fromCurrency = new ComboBox<>(FXCollections.observableArrayList(currency));
        ComboBox toCurrency = new ComboBox(FXCollections.observableArrayList(currency));

        ConverterController controller = new ConverterController();
        button.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                try {

                    double amount = Double.parseDouble(converter.getText());

                    String from = fromCurrency.getValue().toString();

                    String to = toCurrency.getValue().toString();


                    double result = controller.convert(amount, from, to);


                    results.setText(String.format("%.2f", result));


                } catch (Exception e) {

                    results.setText("Invalid input");

                }

            }
        });





        layout.add(welcome, 0, 0);
        layout.add(instruct, 0, 1);

        layout.add(mine, 0, 2);
        layout.add(converter, 1, 2);
        layout.add(button, 2, 2);

        layout.add(fromCurrency, 0, 3);

        layout.add(yours, 0, 4);
        layout.add(results, 1, 4);

        layout.add(toCurrency, 0, 5);

        Scene view = new Scene(layout, 500, 300);

        stage.setTitle("Converter");
        stage.setScene(view);
        stage.show();
    }
}