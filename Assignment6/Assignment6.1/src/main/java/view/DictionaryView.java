package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Spinner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class DictionaryView extends Application {

    public void start(Stage window) {
        Label text = new Label("Hello !");
        Button button = new Button("Search");
        TextField word = new TextField();
        word.setPromptText("Enter your word");

        DictionaryController controller = new DictionaryController();
        button.setOnAction(event -> {
            String result = controller.searchword(word.getText());
            if (result == null) {
                text.setText("Error. Cannot find word.");
            } else {
                text.setText(result);
            }
        });


        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(text);
        componentGroup.getChildren().add(word);
        componentGroup.getChildren().add(button);


        Scene view = new Scene(componentGroup);


        window.setTitle("Dictionary");
        window.setScene(view);
        window.show();


    }
}
