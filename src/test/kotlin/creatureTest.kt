import org.junit.Test
import org.junit.Assert.assertEquals

import creatures.mammalian.Human

class HumanTest {
    @Test
    fun humanTest1() {
        // 人間クラスのヒラコバインスタンスを作成
        val futa = Human("Futa HIRAKOBA")

        // 身長、体重の登録
        futa.height = 174
        futa.weight = 60

        assertEquals(futa.height as Int, 174)
        assertEquals(futa.weight as Int, 60)
    }

    @Test
    fun humanTest2() {
        // 人間クラスのヒラコバインスタンスを作成
        val yamiji = Human("YAMIJI", 180, 75)

        assertEquals(yamiji.info.length > 40, true)
    }
}