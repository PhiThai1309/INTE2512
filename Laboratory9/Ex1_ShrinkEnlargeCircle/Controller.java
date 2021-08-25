//package sample;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.shape.Circle;
//
//public class Controller {
//
//    @FXML
//    private Pane pane;
//
//    @FXML
//    private Circle circle;
//
//    @FXML
//    private Button enlarge;
//
//    @FXML
//    private Button shrink;
//
//    @FXML
//    void onEnlargeClick(ActionEvent event) {
//        if (circle.getCenterX() - circle.getRadius() - 5 > 0 &&
//                circle.getCenterX() + circle.getRadius() + 5 < pane.getWidth() &&
//                circle.getCenterY() - circle.getRadius() - 5 > 0 &&
//                circle.getCenterY() + circle.getRadius() + 5 < pane.getHeight()) {
//
//            circle.setRadius(circle.getRadius() + 5);
//        }
//    }
//
//    @FXML
//    void onShrinkClick(ActionEvent event) {
//        circle.setRadius(circle.getRadius() - 5 > 0? circle.getRadius() - 5 : circle.getRadius());
//    }
//}
