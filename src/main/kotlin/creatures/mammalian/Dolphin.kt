package creatures.mammalian

import creatures.Mammalian

class Dolphin(override val name: String,
              var full_length: Int = -1,
              var weight: Int = -1) : Mammalian() {
    override val family: String = "Dolphin"
    override val info: String
        get() {
            return super.info + "full length: ${this.full_length}\n" + "weight: ${this.weight}\n"
        }
}