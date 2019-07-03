import JCoreFX.JCoreFX;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        JCoreFX jCoreFX = new JCoreFX();
        jCoreFX.init(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
