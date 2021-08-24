//package sample;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    public Circle circle;
//    @Override
//    public void start(Stage primaryStage) {
//
//        circle = new Circle(100,60, 50, Color.WHITE);
//        circle.setStroke(Color.BLACK);
//
//        Pane root = new Pane(circle);
//
//        root.setOnMouseMoved(e -> {
//            root.getChildren().clear();
//            Text text = new Text(e.getX(), e.getY(), "Mouse point is " +
//                    (circle.contains(e.getX(), e.getY()) ? "inside " : "outside ") +
//                    "the circle");
//            root.getChildren().addAll(circle, text);
//        });
//
//        Scene scene = new Scene(root, 300, 300);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
