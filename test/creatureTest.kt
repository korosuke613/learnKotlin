import creatures.mammalian.Human
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

@Test
fun humanTest1(){
    // 人間クラスのヒラコバインスタンスを作成
    val futa = Human("Futa HIRAKOBA")

    // 身長、体重の登録
    futa.height = 174
    futa.weight = 60

    assertEquals(futa.height as Int, 174)
    assertEquals(futa.weight as Int, 60)
}

@Test
fun humanTest2(){
    // 人間クラスのヒラコバインスタンスを作成
    val yamiji = Human("YAMIJI")

    // 身長、体重の登録
    yamiji.height = 180
    yamiji.weight = 75

    assertEquals(yamiji.info.length > 40, true)
}