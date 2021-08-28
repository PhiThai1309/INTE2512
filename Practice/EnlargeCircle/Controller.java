//package sample;
//
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.Pane;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//
//public class Controller {
//
//    @FXML
//    private Pane pane;
//
//    @FXML
//    private Button button1;
//
//    @FXML
//    private Button button2;
//
//    @FXML
//    private Circle circle;
//
//    @FXML
//    void onButton1Click(MouseEvent event) {
//        if (circle.getLayoutX() - circle.getRadius() > 0 && circle.getLayoutX() + circle.getRadius() < pane.getWidth() &&
//                circle.getLayoutY() - circle.getRadius() - 10> 0 && circle.getLayoutY() + circle.getRadius() < pane.getHeight()) {
//            circle.setRadius(circle.getRadius() + 10);
//        }
//    }
//
//    @FXML
//    void onButton2Click(MouseEvent event) {
//        circle.setRadius(circle.getRadius() - 10);
//    }
//
//}