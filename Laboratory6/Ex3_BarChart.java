//package sample;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.chart.BarChart;
//import javafx.scene.chart.CategoryAxis;
//import javafx.scene.chart.NumberAxis;
//import javafx.scene.chart.XYChart;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.util.Arrays;
//
//public class Main extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        //Defining the x axis
//        CategoryAxis xAxis = new CategoryAxis();
////        xAxis.setLabel("category");
//
//        //Defining the y axis
//        NumberAxis yAxis = new NumberAxis();
////        yAxis.setLabel("percentage");
//
//        //Creating the Bar chart
//        BarChart<String, Number> bar = new BarChart<>(xAxis, yAxis);
//
//        //Prepare XYChart.Series objects by setting data
//        XYChart.Series<String, Number> series = new XYChart.Series<>();
//        series.getData().add(new XYChart.Data("Project", 20));
//        series.getData().add(new XYChart.Data("Quiz", 10));
//        series.getData().add(new XYChart.Data("Midterm", 30));
//        series.getData().add(new XYChart.Data("Final", 40));
//
//        //Adding series to the barchart
//        bar.getData().add(series);
//
//        // configuring group and scene
//        Group root = new Group();
//        root.getChildren().add(bar);
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("BarChart Example");
//        primaryStage.show();
//
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
