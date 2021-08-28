//package sample;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//import java.util.Random;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Pane root = new Pane();
//        primaryStage.setScene(new Scene(root, 400, 400));
//
//        Circle circle1 = new Circle();
//        circle1.setRadius(15);
//        circle1.setFill(Color.WHITE);
//        circle1.setStroke(Color.PINK);
//        circle1.setStrokeWidth(2);
//
//        Circle circle2 = new Circle();
//        circle2.setRadius(15);
//        circle2.setFill(Color.WHITE);
//        circle2.setStroke(Color.SKYBLUE);
//        circle2.setStrokeWidth(2);
//
//        circle1.setCenterX(getRandom());
//        circle1.setCenterY(getRandom());
//        circle2.setCenterX(getRandom());
//        circle2.setCenterY(getRandom());
//
//        Line line = new Line();
//        line.setStartX(circle1.getCenterX());
//        line.setStartY(circle1.getCenterY());
//        line.setEndX(circle2.getCenterX());
//        line.setEndY(circle2.getCenterY());
//
//        Text text1 = new Text("1");
//        Text text2 = new Text("2");
//        text1.setLayoutX(circle1.getCenterX());
//        text1.setLayoutY(circle1.getCenterY());
//        text2.setLayoutX(circle2.getCenterX());
//        text2.setLayoutY(circle2.getCenterY());
//
//        root.getChildren().addAll(line, circle1, circle2, text1, text2);
//
//        primaryStage.show();
//    }
//
//    private int getRandom() {
//        Random random = new Random();
//        int r = random.nextInt(400);
//        return r;
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
