import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun commisTest() {
        val amount: Double = 40000.0
        val card: String = "Visa"

     val actual = commis(amount,card)

        assertEquals(3500.0,actual)

    }

    @Test
    fun commisTest2() {
        val amount: Double = 40000.0
        val card: String = "Maestro"

        val actual = commis(amount,card)

        assertEquals(0.0,actual)

    }

    @Test
    fun commisTest3() {
        val amount: Double = 40000.0
        val card: String = "QIWI"

        val actual = commis(amount,card)

        assertEquals(0.0,actual)

    }



    @Test
    fun visaWorldTest() {
        val amount: Double = 40000.0
      val actual =  visaWorld(amount)
       assertEquals(3500.0,actual)
    }

    @Test
    fun visaWorldTes2() {
        val amount: Double = 400000.0
        val actual =  visaWorld(amount)
        assertEquals(30000.0,actual)
    }

    @Test
    fun mmTest() {
        val amount: Double = 40000.0
      val actual =  mm(amount)
        assertEquals(0.0,actual)
    }

    @Test
    fun mmTest2() {
        val amount: Double = 4000.0
        val actual =  mm(amount)
        assertFalse(actual <= 0)
    }
}