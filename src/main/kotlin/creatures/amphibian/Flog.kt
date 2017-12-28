package creatures.amphibian

import creatures.Amphibian

// カエルクラス
class Flog(override val name: String,
            var full_length: Any? = null,
            var weight: Any? = null) : Amphibian(){
    override val family: String = "Flog"
    override val info: String
        get() {
            return super.info + "height: ${this.full_length}\n" + "weight: ${this.weight}\n"
        }
}