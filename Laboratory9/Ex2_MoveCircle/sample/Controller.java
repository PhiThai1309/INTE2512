//package sample;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Pane;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
//
//public class Controller {
//    @FXML
//    private Button right;
//
//    @FXML
//    private Button left;
//
//    @FXML
//    private Button up;
//
//    @FXML
//    private Button down;
//
//    @FXML
//    private Pane pane;
//
//    @FXML
//    private Circle circle;
//
//    @FXML
//    void onDownClick(ActionEvent event) {
//        if (circle.getLayoutY() + circle.getRadius() + 5 < pane.getHeight()) {
//            circle.setLayoutY(circle.getLayoutY() + 5);
//        }
//    }
//
//    @FXML
//    void onLeftClick(ActionEvent event) {
//        if (circle.getLayoutX() - circle.getRadius() - 5 > 0) {
//            circle.setLayoutX(circle.getLayoutX() - 5);
//        }
//    }
//
//    @FXML
//    void onRightClick(ActionEvent event) {
//        if (circle.getLayoutX() + circle.getRadius() + 5 <pane.getWidth()) {
//            circle.setLayoutX(circle.getLayoutX() + 5);
//        }
//    }
//
//    @FXML
//    void onUpClick(ActionEvent event) {
//        if (circle.getLayoutY() - circle.getRadius() - 5 > 0) {
//            circle.setLayoutY(circle.getLayoutY() - 5);
//        }
//    }
//
//}
