//package sample;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Line;
//import javafx.scene.shape.Polygon;
//import javafx.scene.shape.Polyline;
//import javafx.stage.Stage;
//
//import java.util.Random;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        VBox root = new VBox();
//        primaryStage.setScene(new Scene(root, 400, 400));
//        Button button = new Button("Refresh");
//
//
//        drawArrow(random(), random(), random(), random(), root);
//
//        button.setOnAction(e -> {
//            drawArrow(random(), random(), random(), random(), root);
//            root.getChildren().add(button);
//        });
//
//        root.getChildren().add(button);
//
//        primaryStage.show();
//    }
//
//    public static void drawArrow(double startX, double startY, double endX, double endY, Pane pane) {
//        pane.getChildren().clear();
//        Line line = new Line();
//        line.setStartX(startX);
//        line.setStartY(startY);
//        line.setEndX(endX);
//        line.setEndY(endY);
//
//        pane.getChildren().addAll(line);
//    }
//
//    public double random() {
//        Random random = new Random();
//        double r = random.nextInt(400);
//        return r;
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
