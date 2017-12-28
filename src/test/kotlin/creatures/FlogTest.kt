package creatures

import creatures.amphibian.Flog
import org.junit.Assert.assertEquals
import org.junit.Test

class FlogTest {
    @Test
    fun flogTest1() {
        // 人間クラスのヒラコバインスタンスを作成
        val rikiya = Flog("RIKIYA")

        // 身長、体重の登録
        rikiya.full_length = 12
        rikiya.weight = 6

        assertEquals(rikiya.full_length, 12)
        assertEquals(rikiya.weight, 6)
    }

    @Test
    fun flogTest2() {
        // 人間クラスのヒラコバインスタンスを作成
        val yamiji = Flog("YAMIJI", 3100, 2111)

        assertEquals(yamiji.info.length > 40, true)
    }
}