package creatures

// 生き物クラス
abstract class Creature {
    abstract val type: String
    abstract val family: String
    abstract val name: String
    open val info: String
        get() = "type: ${this.type}\n" +
                "family: ${this.family}\n" +
                "name: ${this.name}\n"

    open fun printInfo(){
    print( "type: ${this.type}\n" +
            "family: ${this.family}\n" +
            "name: ${this.name}\n")
}
}

