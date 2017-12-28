package creatures.mammalian.human

import creatures.Greeter
import creatures.mammalian.Human

class Japanese(name: String,
               height: Any? = null,
               weight: Any? = null): Human(name, height, weight), Greeter{
    override val language: String = "Japanese"

    override fun sayHello(target: String) {
        println("こんにちは！ $target")
    }

    fun sayHello(target: Human){
        println("こんにちは！ ${target.name}")
    }

    fun seppuku(killer: Japanese){
        println("${name}「${killer.name}殿、介錯かたじけない」")
        seppuku()
        println("${killer.name}「御免！」")
        println("ズバッ！！！")
    }

    fun seppuku(){
        println("${name}「うっ！ううっ！！」")
    }
}
