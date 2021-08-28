//package sample;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    protected Circle circle1 = new Circle(15);
//    protected Circle circle2 = new Circle(15);
//
//    @Override
//    public void start(Stage primaryStage) {
//        Pane pane = new Pane();
//        Scene scene = new Scene(pane, 400, 400);
//
//        circle1.setCenterX(getRandomX(pane));
//        circle1.setCenterY(getRandomY(pane));
//
//        circle2.setCenterX(getRandomX(pane));
//        circle2.setCenterY(getRandomY(pane));
//
//        Line line = new Line();
//        line.setStartX(circle1.getCenterX());
//        line.setStartY(circle1.getCenterY());
//
//        line.setEndX(circle2.getCenterX());
//        line.setEndY(circle2.getCenterY());
//
//        pane.getChildren().addAll(line, circle1, circle2);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }
//
//    public int getRandomX(Pane pane) {
//        int min = 15;
//        int max = (int) pane.getWidth();
//
//        int width = (int) (Math.random() * (max - min + 1) + min );
//        return width;
//    }
//    public int getRandomY(Pane pane) {
//        int min = 15;
//        int max = (int) pane.getHeight();
//
//        int height = (int) (Math.random() * (max - min + 1) + min);
//        return height;
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
