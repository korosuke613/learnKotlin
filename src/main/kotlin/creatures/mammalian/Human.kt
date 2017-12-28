package creatures.mammalian

import creatures.Mammalian

// 人間クラス
open class Human(override val name: String,
            var height: Any? = null,
            var weight: Any? = null) : Mammalian(){
    override val family: String = "Human"
    override val info: String
        get() {
            return super.info + "height: ${this.height}\n" + "weight: ${this.weight}\n"
        }
}