package lesson4.counting_elements.perm_check

class Solution {
    // 1 부터 N 까지의 순열이 구성되는 배열 A 가 있다.
    // 배열 A 는 1 부터 N 까지 중복되지 않는 숫자로 구성된다.
    // 배열 A 가 순열일 경우 1: true, 아닌 경우 0: false 를 리턴한다.
    fun solution(A: IntArray): Int {
        // 우선 해당 배열을 정렬한다.
        if(A.isEmpty()) {
            return 0
        }

        var isPerm = true
        A.sortedArray().also { ints ->
            if(ints[0] != 1) {
                return 0
            }

            for(i in 1 until ints.size) {
                if(ints[i - 1] + 1 != ints[i]) {
                    isPerm = false
                    break
                }
            }
        }
        return if(isPerm) 1 else 0
    }
}
/*
https://app.codility.com/demo/results/trainingKCNAC5-CGA/
 */
