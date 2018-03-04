package contacts;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    
    @Override
    public void start(Stage primaryStage) throws Exception {
    
        Parent root = FXMLLoader.load(getClass().getResource("AllContactTableView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("All Contacts");
        primaryStage.setScene(scene);
        primaryStage.show();    
    }
       public static void main(String[] args) {
        launch(args);
    }
}
