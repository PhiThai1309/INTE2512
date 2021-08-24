//package sample;
//
//import javafx.application.Application;
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
//    public Circle circle;
//    public Circle circle2;
//    @Override
//    public void start(Stage primaryStage) {
//
//        circle = new Circle(40,40, 20, Color.WHITE);
//        circle.setStroke(Color.BLACK);
//
//        circle2 = new Circle(120,150, 20, Color.WHITE);
//        circle2.setStroke(Color.BLACK);
//
//        Pane root = new Pane();
//        root.getChildren().addAll(getLine(circle, circle2), circle, circle2);
//
//        root.setOnMouseDragged(e -> {
//            if(circle.contains(e.getX(), e.getY()) && isInRootX(root, e, circle) && isInRootY(root, e, circle2)) {
//                root.getChildren().clear();
//                circle.setCenterX(e.getX());
//                circle.setCenterY(e.getY());
//                root.getChildren().addAll(getLine(circle, circle2), circle, circle2, getText(circle, circle2));
//            } else if (circle2.contains(e.getX(), e.getY()) && isInRootX(root, e, circle) && isInRootY(root, e, circle2)) {
//                root.getChildren().clear();
//                circle2.setCenterX(e.getX());
//                circle2.setCenterY(e.getY());
//                root.getChildren().addAll(getLine(circle, circle2), circle, circle2, getText(circle, circle2));
//            }
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
//    private Line getLine(Circle circle, Circle circle2) {
//        return new Line(circle.getCenterX(), circle.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
//    }
//
//    private Text getText(Circle circle, Circle circle2) {
//        double a = circle2.getCenterX() - circle.getCenterX();
//        double b = circle2.getCenterY() - circle.getCenterY();
//        double d = Math.sqrt(a*a + b*b);
//        return new Text((circle.getCenterX() + circle2.getCenterX()) / 2, (circle.getCenterY() + circle2.getCenterY()) / 2, String.format("%.0f", d));
//    }
//
//    private boolean isInRootX(Pane root, MouseEvent e, Circle circle) {
//        return root.getLayoutX() <= e.getX() - circle.getRadius();
//    }
//    private boolean isInRootY(Pane root, MouseEvent e, Circle circle) {
//        return root.getLayoutY() <= e.getY() - circle.getRadius();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
