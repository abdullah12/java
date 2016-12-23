// a modified skelton form the book:
// Introducing JavaFx 8 programming
// https://www.safaribooksonline.com/library/view/introducing-javafx-8/9780071842563/
// JavaFX application bootstrap
 
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
 
public class boo extends Application { 
 
  public static void main(String[] args) { 
  
       launch(args);   
  } 
 
  // Override the init() method. 
  public void init() { 
    
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    System.out.println("Inside the start() method."); 
 
    // Give the stage a title. 
    myStage.setTitle("JavaFX Skeleton"); 
 
    // Create a root node. In this case, a flow layout 
    // is used, but several alternatives exist. 
    FlowPane rootNode = new FlowPane(); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 300, 200); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Show the stage and its scene. 
    myStage.show(); 
  } 
 
  // Override the stop() method. 
  public void stop() { 
    
  } 
}
