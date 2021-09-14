//package sample;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.geometry.Pos;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    private Circle circle;
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Pane root = new Pane();
//        primaryStage.setScene(new Scene(root, 400, 400));
//
//        circle = new Circle(100, 60, 50);
//        circle.setFill(Color.WHITE);
//        circle.setStroke(Color.BLACK);
//        circle.setStrokeWidth(2);
//
//        root.setOnMouseMoved(e -> {
//            if (circle.contains(e.getX(), e.getY())) {
//                getInside(root, e);
//            }   else {
//                getOutside(root, e);
//            }
//        });
//
//        root.getChildren().add(circle);
//        primaryStage.show();
//    }
//
//    public void getInside(Pane root, MouseEvent e) {
//        root.getChildren().clear();
//        Text text = new Text("Mouse inside the circle");
//        text.setLayoutX(e.getX());
//        text.setLayoutY(e.getY());
//        root.getChildren().addAll(circle, text);
//    }
//    public void getOutside(Pane root, MouseEvent e) {
//        root.getChildren().clear();
//        Text text = new Text("Mouse outside the circle");
//        text.setLayoutX(e.getX());
//        text.setLayoutY(e.getY());
//        root.getChildren().addAll(circle, text);
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
