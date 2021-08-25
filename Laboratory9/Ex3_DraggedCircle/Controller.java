//package sample;
//
//import javafx.fxml.FXML;
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
//    private Circle circle1;
//
//    @FXML
//    private Circle circle2;
//
//    @FXML
//    private Line line;
//
//    double clickX, clickY;
//
//    @FXML
//    void onCircle1Click(MouseEvent event) {
//        clickX = event.getSceneX();
//        clickY = event.getSceneY();
//
//    }
//
//    @FXML
//    void onCircle1Drag(MouseEvent event) {
//        double offsetX = event.getSceneX() - clickX;
//        double offsetY = event.getSceneY() - clickY;
//
//        circle1.setLayoutX(circle1.getLayoutX() + offsetX);
//        circle1.setLayoutY(circle1.getLayoutY() + offsetY);
//
//        line.setStartX(line.getStartX() + offsetX);
//        line.setStartY(line.getStartY() + offsetY);
//
//        clickX = event.getSceneX();
//        clickY = event.getSceneY();
//    }
//
//    @FXML
//    void onCircle2Click(MouseEvent event) {
//        clickX = event.getSceneX();
//        clickY = event.getSceneY();
//    }
//
//    @FXML
//    void onCircle2Drag(MouseEvent event) {
//        double offsetX = event.getSceneX() - clickX;
//        double offsetY = event.getSceneY() - clickY;
//
//        circle2.setLayoutX(circle2.getLayoutX() + offsetX);
//        circle2.setLayoutY(circle2.getLayoutY() + offsetY);
//
//        line.setEndX(line.getEndX() + offsetX);
//        line.setEndY(line.getEndY() + offsetY);
//
//        clickX = event.getSceneX();
//        clickY = event.getSceneY();
//    }
//
//}
