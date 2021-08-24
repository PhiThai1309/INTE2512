//package sample;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//
//        ImageView iv1 = new ImageView("https://www.countryflags.com/wp-content/uploads/europe-flag-jpg-xl.jpg");
//        iv1.setFitWidth(400);
//        iv1.setPreserveRatio(true);
//        iv1.setSmooth(true);
//
//        ImageView iv2 = new ImageView("https://www.countryflags.com/wp-content/uploads/europe-flag-jpg-xl.jpg");
//        iv2.setFitWidth(400);
//        iv2.setPreserveRatio(true);
//        iv2.setSmooth(true);
//
//        ImageView iv3 = new ImageView("https://www.countryflags.com/wp-content/uploads/europe-flag-jpg-xl.jpg");
//        iv3.setFitWidth(400);
//        iv3.setPreserveRatio(true);
//        iv3.setSmooth(true);
//
//        ImageView iv4 = new ImageView("https://www.countryflags.com/wp-content/uploads/europe-flag-jpg-xl.jpg");
//        iv4.setFitWidth(400);
//        iv4.setPreserveRatio(true);
//        iv4.setSmooth(true);
//
//        GridPane grid = new GridPane();
//        grid.add(iv1, 1, 1);
//        grid.add(iv2, 1, 2);
//        grid.add(iv3, 2,1);
//        grid.add(iv4, 2, 2);
//
//        Scene scene = new Scene(grid);
////        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
