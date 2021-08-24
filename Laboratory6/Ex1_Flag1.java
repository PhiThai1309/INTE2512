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
//    GridPane createGridPane() {
//        String[] urls = {"https://cdn.pixabay.com/photo/2012/04/10/23/04/vietnam-26834_1280.png",
//                "https://www.countryflags.com/wp-content/uploads/europe-flag-jpg-xl.jpg",
//                "https://png.pngtree.com/png-clipart/20200226/original/pngtree-australia-flag-transparent-with-fabric-png-image_5312022.jpg",
//                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Flag_of_Japan_%28bordered%29.svg/640px-Flag_of_Japan_%28bordered%29.svg.png"
//        };
//
//        GridPane gridPane = new GridPane();
//        ImageView iv;
//        for (int i = 0; i < 4; i++) {
//            iv = new ImageView(urls[i]);
//            iv.setFitWidth(400);
//            iv.setPreserveRatio(true);
//            iv.setSmooth(true);
//            gridPane.add(iv, (i < 2)? 1 : 2, i % 2 + 1);
//        }
//
//        return gridPane;
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//
//        Scene scene = new Scene(createGridPane());
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Four Flags");
//        primaryStage.show();
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
