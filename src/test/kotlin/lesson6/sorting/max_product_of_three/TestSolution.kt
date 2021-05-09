package lesson6.sorting.max_product_of_three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(-3, 1, 2, -2, 5, 6)
        Assertions.assertEquals(60, Solution().solution(A))
    }
}
