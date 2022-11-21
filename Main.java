import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup; 
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;




public class Main extends Application 
{ 
  public Pane p = new Pane();

  
  @Override
  public void start(Stage primaryStage) {

    RadioButton rdRed = new RadioButton("Red");
    rdRed.setLayoutX(100);
    rdRed.setLayoutY(190);
    RadioButton rdYellow = new RadioButton("Yellow");
    rdYellow.setLayoutX(100);
    rdYellow.setLayoutY(210);
    RadioButton rdGreen = new RadioButton("Green");
    rdGreen.setLayoutX(100);
    rdGreen.setLayoutY(230);
    
    
    Rectangle r = new Rectangle();
    r.setX(100);
    r.setY(20);
    r.setWidth(75);
    r.setHeight(150);
    r.setFill(Color.WHITE);
    r.setStroke(Color.BLACK);

    
    Circle cR = new Circle();
    cR.setCenterX(137.5f);
    cR.setCenterY(60.0f);
    cR.setRadius(15.0f);
    cR.setStroke(Color.BLACK);
    cR.setFill(Color.WHITE);

    Circle cY = new Circle();
    cY.setCenterX(137.5f);
    cY.setCenterY(100.0f);
    cY.setRadius(15.0f);
    cY.setStroke(Color.BLACK);
    cY.setFill(Color.WHITE);

    Circle cG = new Circle();
    cG.setCenterX(137.5f);
    cG.setCenterY(140.0f);
    cG.setRadius(15.0f);
    cG.setStroke(Color.BLACK);
    cG.setFill(Color.WHITE);

    ToggleGroup tg = new ToggleGroup();

    rdRed.setToggleGroup(tg);
    rdGreen.setToggleGroup(tg);
    rdYellow.setToggleGroup(tg);

    rdRed.setOnAction(e -> {
      if (rdRed.isSelected()){
        cR.setFill(Color.RED);
        cY.setFill(Color.WHITE);
        cG.setFill(Color.WHITE);
      }
    });

    rdYellow.setOnAction(e -> {
      if (rdYellow.isSelected()){
        cY.setFill(Color.YELLOW);
        cR.setFill(Color.WHITE);
        cG.setFill(Color.WHITE);
      }
    });

    rdGreen.setOnAction(e -> {
      if (rdGreen.isSelected()){
        cG.setFill(Color.GREEN);
        cY.setFill(Color.WHITE);
        cR.setFill(Color.WHITE);
      }
    });
    
    p.getChildren().add(r);
    p.getChildren().add(cR);
    p.getChildren().add(cY);
    p.getChildren().add(cG);
    p.getChildren().add(rdRed);
    p.getChildren().add(rdYellow);
    p.getChildren().add(rdGreen);

    p.setStyle("-fx-background-color: white");
    Scene scene = new Scene(p, 600, 200);
    primaryStage.setTitle("Traffic light");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 