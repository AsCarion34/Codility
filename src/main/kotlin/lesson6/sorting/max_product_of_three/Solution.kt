package lesson6.sorting.max_product_of_three

class Solution {
    /***
     * 풀이
     * 주어진 배열 중 세개의 값의 곱이 가장 큰 수를 찾는다.
     */
    fun solution(A: IntArray): Int {
        /*
        // 풀이
        // 내림차순 정렬 후 앞의 세 값을 곱한 값을 반환한다.
        // 음수가 존재 할 경우 경우의 수가 존재한다.
        //
         */
        var result = 0
        A.sortedArrayDescending().also { sortedArray ->
            result = sortedArray[0]
            for(i in 1..2) {
                result *= sortedArray[i]
            }
        }
        return result
    }
}
