package creatures.mammalian

import creatures.Mammalian

// 人間クラス
class Human(override val name: String) : Mammalian(){
    override val family: String = "Human"
    override val info: String
        get() {
            return super.info + "height: ${this.height}\n" + "weight: ${this.weight}\n"
        }
    var height: Any? = null
    var weight: Any? = null
}