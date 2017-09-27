package creatures

// 哺乳類クラス
abstract class Mammalian : Creature() {
    override val type: String
        get() = "Mammalian"
}

