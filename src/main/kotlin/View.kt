import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * GUI全体に関するクラス
 */
class View : Application() {
    /**
     * GUIをスタートさせる
     * @param primaryStage 土台となるコンテナ(トップレベルコンテナ)
     */
    override fun start(primaryStage: Stage) {
        //GUIのタイトルを設定
        primaryStage.title = "Hello World"

        //Scene(見えないコンテナ)にsample.fxmlの内容を当てはめる
        //primaryStage.scene = Scene(FXMLLoader.load<Parent>(this.javaClass.getResource("Main.fxml")))
        primaryStage.scene = Scene(FXMLLoader.load<Parent>(this.javaClass.getResource("creatures/mammalian/Human.fxml")))

        //GUIを表示
        primaryStage.show()
    }
}