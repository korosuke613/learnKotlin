package creatures

import creatures.mammalian.Dolphin
import org.junit.Assert.assertEquals
import org.junit.Test

class DolphinTest {
    @Test
    fun dolphinTest1() {
        // 人間クラスのヒラコバインスタンスを作成
        val rikiya = Dolphin("RIKIYA")

        // 身長、体重の登録
        rikiya.full_length = 174
        rikiya.weight = 60

        assertEquals(rikiya.full_length, 174)
        assertEquals(rikiya.weight, 60)
    }

    @Test
    fun dolphinTest2() {
        // 人間クラスのヒラコバインスタンスを作成
        val yamiji = Dolphin("YAMIJI", 300, 200)

        assertEquals(yamiji.info.length > 40, true)
    }
}