
package fxexam;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author moham
 */
public class FXExam extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnsquare = new Button("Square");
        Button btnrec = new Button("Rectangle");
        GridPane home = new GridPane();
        home.add(btnsquare, 0, 0);
        home.add(btnrec, 1, 0);
        home.setAlignment(Pos.CENTER);
        home.setHgap(20);
        
        
        Button Asquare = new Button("Area");
        Button Psquare = new Button("Perimeter");
        Label sqaurecalc = new Label("Square Calculations");
        Label side = new Label("Side");
        TextField sidetext = new TextField();
        Label Alabel = new Label("?");
        Label Plabel = new Label("?");
        GridPane squarepane = new GridPane();
        squarepane.add(sqaurecalc, 0, 0 , 2, 1);
        squarepane.add(side, 0, 1);
        squarepane.add(sidetext, 1, 1);
        squarepane.add(Asquare, 0, 2);
        squarepane.add(Psquare, 1, 2);
        squarepane.add(Alabel, 0, 3);
        squarepane.add(Plabel, 1, 3);
        squarepane.setAlignment(Pos.CENTER);
        squarepane.setHgap(20);


        Button Arec = new Button("Area");
        Button Prec = new Button("Perimeter");
        Label recalc = new Label("Rectangle Calculations");
        Label width = new Label("Width");
        Label height = new Label("Height");
        TextField htext = new TextField();
        TextField wtext = new TextField();
        Label Areclabel = new Label("?");
        Label Preclabel = new Label("?");
        GridPane recpane = new GridPane();
        recpane.add(recalc, 0, 0,2,1);
        recpane.add(width, 0, 1);
        recpane.add(wtext, 1, 1);
        recpane.add(height, 0, 2);
        recpane.add(htext, 1, 2);
        recpane.add(Arec, 0, 3);
        recpane.add(Prec, 1, 3);
        recpane.add(Areclabel, 0, 4);
        recpane.add(Preclabel, 1, 4);
        recpane.setAlignment(Pos.CENTER);
        recpane.setHgap(20);

        
        
        


        btnsquare.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Scene square = new Scene(squarepane,300,300);
                
                primaryStage.setTitle("Midterm");
                primaryStage.setScene(square);
                primaryStage.show();
                 
            }
        });
        
        btnrec.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                Scene rec = new Scene(recpane,300,300);
                
                primaryStage.setTitle("Midterm");
                primaryStage.setScene(rec);
                primaryStage.show();
                
            }
        });
                
        Asquare.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int s = Integer.parseInt(sidetext.getText())*Integer.parseInt(sidetext.getText());
                Alabel.setText(""+s);
                
            }
        });
                        
        Psquare.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            Plabel.setText(""+Integer.parseInt(sidetext.getText())*2+Integer.parseInt(sidetext.getText())*2);

            }
        });
                                
        Arec.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                Areclabel.setText(""+Integer.parseInt(wtext.getText())*Integer.parseInt(htext.getText()));
                
            }
        });
                                        
        Prec.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                Preclabel.setText(""+Integer.parseInt(wtext.getText())*2+Integer.parseInt(htext.getText())*2);
                
            }
        });
        
        
        Scene scenehome = new Scene(home, 300, 250);
        
        primaryStage.setTitle("Midterm");
        primaryStage.setScene(scenehome);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
