//package sample;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.chart.BarChart;
//import javafx.scene.chart.CategoryAxis;
//import javafx.scene.chart.NumberAxis;
//import javafx.scene.chart.XYChart;
//import javafx.scene.control.Button;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.util.Arrays;
//
//public class Main extends Application {
//    boolean first = false;
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        VBox vbox = new VBox();
//        Button button = new Button("Change text");
//        Text text = new Text("Java is powerful");
//        vbox.getChildren().add(text);
//        vbox.getChildren().add(button);
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                if(first) {
//                    text.setText("Java is powerful");
//                } else text.setText("Java is fun");
//                first = !first;
//            }
//        });
//
//        Pane root = new Pane(vbox);
//        Scene scene = new Scene(root);
//        scene.setFill(Color.BLACK);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
