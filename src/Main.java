import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // 这里的root从FXML文件中加载进行初始化，这里FXMLLoader类用于加载FXML文件
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Elevator.fxml"));
            Scene scene = new Scene(root, 1280, 764);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Elevator Animation");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

//按键说明
//A：Alarm 警报 暂停该部电梯所有活动 直到Recover
//R：Recover 恢复 恢复电梯活动
//O：Open  开门 延长电梯门开启时间2s
//C：Close 关门 缩短电梯门开启时间5s