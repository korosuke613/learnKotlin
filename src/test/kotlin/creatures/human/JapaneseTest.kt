package creatures.human

import creatures.mammalian.human.Japanese
import org.junit.Assert.assertEquals
import org.junit.Test

class JapaneseTest {
    @Test
    fun japaneseTest1() {
        // 人間クラスのヒラコバインスタンスを作成
        val rikiya = Japanese("市山　力也")

        // 身長、体重の登録
        rikiya.height = 144
        rikiya.weight = 45

        assertEquals(rikiya.height, 144)
        assertEquals(rikiya.weight, 45)
    }

    @Test
    fun japaneseTest2() {
        // 人間クラスのヒラコバインスタンスを作成
        val yamiji = Japanese("闇地　TOSHIHIRO", 3100, 2111)

        assertEquals(yamiji.info.length > 40, true)
    }

    @Test
    fun japaneseTest3(){
        val hirakoba = Japanese("平木場　風太", 174, 60.4)
        hirakoba.sayHello("宮地")
    }

    @Test
    fun japaneseTest4(){
        val hirakoba = Japanese("平木場　風太", 174, 60.4)
        val yamiji = Japanese("闇地　TOSHIHIRO", 3100, 2111)
        hirakoba.sayHello(yamiji)
    }

    @Test
    fun japaneseTest5(){
        val hirakoba = Japanese("ひらこば")
        val miyaji = Japanese("みやじ")
        hirakoba.seppuku(miyaji)
        miyaji.seppuku()
    }
}