package examples;

import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 

public class GridPaneExample extends Application { 
   @Override 
   public void start(Stage stage) {      
      //creating label email 
      Label email_lbl = new Label("Email");       
      
      //creating label password 
      Label pass_lbl = new Label("Password"); 
      Label action_label = new Label("");
	  
      //Creating Text Filed for email        
      TextField email_field = new TextField();       
      
      //Creating Text Filed for password        
      TextField pass_field = new TextField();  
       
      //Creating Buttons 
      Button submit_btn = new Button("Submit"); 
      Button clear_btn = new Button("Clear"); 
      
      submit_btn.setOnAction(e -> {
         action_label.setText("Form Submitted");
      });
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane  
      gridPane.setMinSize(400, 200); 
       
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(email_lbl, 0, 0);   // (col, row)
      gridPane.add(email_field, 1, 0); 
      gridPane.add(pass_lbl, 0, 1);       
      gridPane.add(pass_field, 1, 1); 
      gridPane.add(submit_btn, 0, 2); 
      gridPane.add(clear_btn, 1, 2); 
      gridPane.add(action_label, 0, 3); 
      
      //Creating a scene object 
      Scene scene = new Scene(gridPane);  
      
      //Setting title to the Stage 
      stage.setTitle("Grid Pane Example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
} 