//package sample;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    protected int total = 0;
//
//    @Override
//    public void start(Stage primaryStage) {
//        HBox hbox1 = new HBox();
//        hbox1.setPrefHeight(100);
//        hbox1.setPrefWidth(500);
//
//        HBox hbox2 = new HBox();
//        VBox vbox = new VBox();
//        vbox.setPrefHeight(700);
//        vbox.setPrefWidth(1000);
//
//        getCard(hbox1);
//        Text text = new Text(String.valueOf(total));
//        total = 0;
//
//        Button button = new Button("Deals");
//        Button button1 = new Button("Exits");
//
//        hbox2.getChildren().addAll(button, button1);
//        hbox2.setAlignment(Pos.BOTTOM_CENTER);
//        hbox2.setSpacing(50);
//
//        button.setOnAction(e -> {
//            getCard(hbox1);
//            text.setText(String.valueOf(total));
//            total = 0;
//        });
//        button1.setOnAction(e -> {
//            System.exit(1);
//        });
//
//
//        vbox.getChildren().addAll(hbox1, text, hbox2);
//        vbox.setAlignment(Pos.CENTER);
//        vbox.setSpacing(50);
//
//        Scene scene = new Scene(vbox);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }
//
//    public void getCard(HBox hbox) {
//        int count = 1;
//        hbox.getChildren().clear();
//
//        VBox vbox = new VBox();
//        while(count < 4) {
//            int card = (int) (Math.random() * 52);
//            hbox.getChildren().add(new ImageView(new Image("image/" + (++card) + ".png", 300, 450, false, true)));
//            count++;
//            total = total + card;
//        }
//        hbox.setAlignment(Pos.CENTER);
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
