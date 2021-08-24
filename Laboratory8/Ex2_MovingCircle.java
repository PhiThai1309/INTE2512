//package sample;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    private double newY, newX = 0;
//    @Override
//    public void start(Stage primaryStage) {
//        VBox vbox = new VBox();
//
//        Circle circle = new Circle();
//        circle.setRadius(50);
//        circle.setStroke(Color.BLACK);
//        circle.setFill(Color.WHITE);
//
//        HBox hbox = new HBox();
//        Button button = new Button("Left");
//        Button button2 = new Button("Right");
//        Button button3 = new Button("Up");
//        Button button4 = new Button("Down");
//        hbox.getChildren().addAll(button, button2, button3, button4);
//        hbox.setSpacing(20);
////        hbox.getChildren().add(button2);
////        hbox.getChildren().add(button3);
////        hbox.getChildren().add(button4);
//
//
//        vbox.getChildren().add(circle);
//        vbox.getChildren().add(hbox);
//        vbox.setSpacing(50);
//
//        Pane root = new Pane(vbox);
//
//        button.setOnAction(event -> {
//            if (circle.getLayoutX() >= root.getLayoutX()) {
//                newX = circle.getCenterX() - 10 + newX;
//
//                circle.setTranslateX(newX);
////            circle.setTranslateY(newY);
//            }
//        });
//
//        button2.setOnAction(event -> {
//            newX = circle.getCenterX() + 10 + newX;
//
//            circle.setTranslateX(newX);
////                circle.setTranslateY(newY);
//        });
//        button3.setOnAction(event -> {
//            newY = circle.getCenterX() - 10 + newY;
//
//            //                circle.setTranslateX(newX);
//            circle.setTranslateY(newY);
//        });
//        button4.setOnAction(event -> {
//            newY = circle.getCenterX() + 10 + newY;
//
//            //                circle.setTranslateX(newX);
//            circle.setTranslateY(newY);
//        });
//
//        Scene scene = new Scene(root);
//        scene.setFill(Color.BLACK);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
