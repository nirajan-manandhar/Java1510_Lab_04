/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Making a self-portrait.
 * @author nirajanmanandhar
 * @version 1.0
 *
 */
public class Face extends Application {

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        
        //This is the face.
        final Ellipse face = new Ellipse(250, 250, 100, 110);
        face.setFill(Color.rgb(206, 136, 74));
        
        //These are the eyes.
        final Circle lefteye = new Circle(210, 230, 20);
        lefteye.setFill(Color.WHITE);
        final Circle righteye = new Circle(290, 230, 20);
        righteye.setFill(Color.WHITE);
        
        //These are the irises.
        final Circle leftiris = new Circle(210, 230, 15);
        leftiris.setFill(Color.SADDLEBROWN);
        final Circle rightiris = new Circle(290, 230, 15);
        rightiris.setFill(Color.SADDLEBROWN);
        
        //These are the pupils
        final Circle leftpupil = new Circle(210, 230, 10);
        leftpupil.setFill(Color.BLACK);
        final Circle rightpupil = new Circle(290, 230, 10);
        rightpupil.setFill(Color.BLACK);
        
        Rectangle neck = new Rectangle(210, 270, 80, 230);
        neck.setFill(Color.rgb(206, 136, 74));
        
        Ellipse shoulders = new Ellipse(250, 500, 140, 110);
        shoulders.setFill(Color.LIGHTGREEN);
       
        Arc rhair = new Arc(250, 240, 100, 110, 10, 80);
        rhair.setFill(Color.BLACK);
        
        Arc lhair = new Arc(250, 230, 100, 110, 55, 120);
        lhair.setFill(Color.BLACK);
        
        Arc mouth = new Arc(250, 290, 40, 30, 180, 180);
        mouth.setFill(Color.PINK);
        
        Arc nose = new Arc(250, 260, 10, 10, 180, 180);
        nose.setStroke(Color.SANDYBROWN);
        nose.setFill(Color.rgb(206, 136, 74));
                
        final Text disc = new Text(0, 50, "I'm wearing contacts, ok!");
        disc.setFill(Color.WHITE);
        disc.setFont(new Font(45));
        
        Group lefteyeball = new Group(lefteye, leftiris, leftpupil);
        Group righteyeball = new Group(righteye, rightiris, rightpupil);

        
        Group eyes = new Group(lefteyeball, righteyeball);
        Group head = new Group(face, mouth, nose, eyes, rhair, lhair);
        
        Group body = new Group(neck, shoulders, head, disc);
        final Scene scene = new Scene(body, 500, 500);
        
        scene.setFill(Color.rgb(144, 180, 237));
        
        primaryStage.setTitle("My first JavaFX program.");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * Drive the program.
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);

    }

}
