//package sample;
//
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        red.setFill(Color.RED);
//    }
//
//    @FXML
//    private Button next;
//
//    @FXML
//    private Button exit;
//
//    @FXML
//    private Circle red;
//
//    @FXML
//    private Circle yellow;
//
//    @FXML
//    private Circle green;
//
//    @FXML
//    void onExitClicked(MouseEvent event) {
//        System.exit(2);
//    }
//
//    protected int count = 2;
//
//    @FXML
//    void onNextClicked(MouseEvent event) {
//        if(count == 1) {
//            setRed(red, yellow, green);
//            count++;
//        } else if(count == 2) {
//            setYellow(red, yellow, green);
//            count++;
//        } else if(count == 3) {
//            setGreen(red,yellow, green);
//            count = 1;
//        }
//    }
//
//    public void setRed(Circle red, Circle yellow, Circle green){
//        red.setFill(Color.RED);
//        yellow.setFill(Color.GREY);
//        green.setFill(Color.GREY);
//    }
//    public void setYellow(Circle red, Circle yellow, Circle green){
//        red.setFill(Color.GREY);
//        yellow.setFill(Color.YELLOW);
//        green.setFill(Color.GREY);
//    }
//    public void setGreen(Circle red, Circle yellow, Circle green){
//        red.setFill(Color.GREY);
//        yellow.setFill(Color.GREY);
//        green.setFill(Color.GREEN);
//    }
//
//}