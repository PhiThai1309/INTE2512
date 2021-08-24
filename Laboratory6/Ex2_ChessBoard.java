//package sample;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class Main extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        try {
//
//            GridPane pane = new GridPane();
//            boolean isBlack = false;
//            for (int i = 0; i < 8; i++) {
//                for (int j = 0; j < 8; j++) {
//                    Rectangle rec = new Rectangle(50, 50, (isBlack) ? Color.BLACK : Color.WHITE);
//                    pane.add(rec,j,i);
//                    isBlack = !isBlack;
//                }
//                isBlack = !isBlack;
//            }
//
//
//            Scene scene = new Scene(pane);
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("hBox");
//            primaryStage.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
