import creatures.mammalian.Human

fun main(args: Array<String>){
    // 人間クラスのヒラコバインスタンスを作成
    val futa = Human("Futa HIRAKOBA")

    // 身長、体重の登録
    futa.height = 174
    futa.weight = 60

    // 情報をプリント
    print(message = futa.info)

    println()

    // 人間クラスのヒラコバインスタンスを作成
    val yamiji = Human("YAMIJI", 180, 75)

    print(message = yamiji.info)
}