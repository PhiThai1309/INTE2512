//package sample;
//
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//    @FXML
//    private Circle circle1;
//    @FXML
//    private Circle circle2;
//    @FXML
//    private Line line;
//    @FXML
//    private Label distance;
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        updateDistance();
//    }
//
//    private void updateDistance() {
//        int dist = (int) Math.sqrt(Math.pow((circle1.getCenterX() - circle2.getCenterX()), 2)
//                + Math.pow((circle1.getCenterY() - circle2.getCenterY()), 2));
//        distance.setText(Integer.toString(dist));
//    }
//
//    private void moveLabel() {
//        double midX = (circle1.getCenterX() + circle2.getCenterX()) / 2;
//        double midY = (circle1.getCenterY() + circle2.getCenterY()) / 2;
//        distance.setLayoutX(midX);
//        distance.setLayoutY(midY);
//    }
//
//    @FXML
//    protected void onMouseDragged1(MouseEvent mouse) {
//        circle1.setCenterX(mouse.getX());
//        circle1.setCenterY(mouse.getY());
//        line.setStartX(mouse.getX());
//        line.setStartY(mouse.getY());
//        updateDistance();
//        moveLabel();
//    }
//
//    @FXML
//    protected void onMouseDragged2(MouseEvent mouse) {
//        circle2.setCenterX(mouse.getX());
//        circle2.setCenterY(mouse.getY());
//        line.setEndX(mouse.getX());
//        line.setEndY(mouse.getY());
//        updateDistance();
//        moveLabel();
//    }
//}