import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
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

    private static void configureFileChooser(final FileChooser fileChooser) {
        fileChooser.setTitle("View Files");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("./FileCrypto.fxml"));
            //    Parent root = FXMLLoader.load(getClass().getResource("view/Calculatorview.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(Exception e)    {
            e.printStackTrace();
        }
    }

//        primaryStage.setTitle("FileCrypto");
//
//        final FileChooser fileChooser = new FileChooser();
//
//        button = new Button();
//        button.setText("Chose File");
//        button.setOnAction(event -> {
////            AlertBox.display("Error", "File needs to be .txt");
//            configureFileChooser(fileChooser);
//            File file = fileChooser.showOpenDialog(primaryStage);
////            if (file != null) {
////                openFile(file);
////            }
//        });
//
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
}
