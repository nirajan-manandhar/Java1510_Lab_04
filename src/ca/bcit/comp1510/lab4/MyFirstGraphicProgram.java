/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * A graphic program.
 * @author nirajanmanandhar
 * @version 1.0
 *
 */
public class MyFirstGraphicProgram extends Application {

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        final Circle myCircle = new Circle(250, 250, 100);
        myCircle.setFill(Color.GREEN);
        
        final Text name = new Text(250, 250, "Nirajan");
        name.setFill(Color.WHITE); 
        
        Group root = new Group(myCircle, name);
        final Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("My first JavaFX program.");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);

    }

}
