import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class JavaMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // FXMLのレイアウトをロード
            Parent root = FXMLLoader.load(
                    getClass().getResource(getClass().getSimpleName() + ".fxml"));

            // タイトルセット
            primaryStage.setTitle("JavaFXSample");

            // シーン生成
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}