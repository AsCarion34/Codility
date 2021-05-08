package lesson1.iteration.binarygap

import lesson1.iterations.binarygap.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase01() {
        val N = 1041
        Assertions.assertEquals(5, Solution().solution(N))
    }
    @Test
    fun testCase02() {
        val N = 32
        Assertions.assertEquals(0, Solution().solution(N))
    }
}
