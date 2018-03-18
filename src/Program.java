import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

public class Program extends Application {
//    public static void main(String[] args) {
//        String key = "parola parola";
//        File inputFile = new File("/Users/Andrei/Workspaces/IdeaProjects/CommandLineEncryption/testFiles/my_file.txt");
//        File encryptedFile = new File("/Users/Andrei/Workspaces/IdeaProjects/CommandLineEncryption/testFiles/text.encrypted");
//        File decryptedFile = new File("/Users/Andrei/Workspaces/IdeaProjects/CommandLineEncryption/testFiles/decrypted_text.txt");
//
//        try {
//            CryptoUtils.encrypt(key,inputFile,encryptedFile);
//            CryptoUtils.decrypt(key,encryptedFile,decryptedFile);
//            System.out.println("Sucess");
//        } catch (CryptoException ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
//    }

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FileCrypto");

        button = new Button();
        button.setText("Click me");
        button.setOnAction(event -> {
            AlertBox.display("Error", "File needs to be .txt");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
