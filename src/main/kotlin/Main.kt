import javafx.application.Application

/**
 * メインメソッド
 */
fun main(args: Array<String>) {
    // MyApplicationクラスを開始させる
    //(MyApplicationクラスはJavaのClassクラスとして渡す)
    Application.launch(View::class.java, *args)
}