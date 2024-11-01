package examples;

import java.util.Stack;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;



public class EventExplorer extends Application{

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        System.out.println("Hello World");

        // stet 1: set title
        stage.setTitle("Hello World");
        stage.show();

        //setp 2: Define your container / layout
        VBox parent = new VBox();
        


        //setp 3: Define your elements
        Button btn = new Button();
        btn.setText("Click");

        Label lbl = new Label();
        lbl.setText("");

        // btn.setOnAction(e -> {
        //     lbl.setText("Button Clicked");
        // });

        btn.setOnAction(event -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Button Clicked");
            alert.setHeaderText(null);
            alert.setContentText("Button " + 1);
            alert.showAndWait();
        });

        // btn.setOnMouseClicked(new EventHandler<Event>() {

        //     @Override
        //     public void handle(Event event) {
        //         lbl.setText("Mouse Clicked");
        //     }
        // });

        

        //setp 4: Add your element to the container
        parent.getChildren().add(btn);
        parent.getChildren().add(lbl);

        parent.setAlignment(Pos.CENTER);
        

        //setp 5: Add your container to the scene
        Scene scene = new Scene(parent, 300, 250);

        //setp 6: Add your scene to the stage
        stage.setScene(scene);

        //setp 7: Show your stage
        stage.show();

    }
    
}
