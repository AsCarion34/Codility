package lesson3.time_complexity.perm_missing_elem

class Solution {
    // 주어진 배열을 정렬 후, index 와 index + 1 의 값이 1 이 아닌 값을 찾으면 된다.
    // 조금 더 효율적인 방법은 없을까?
    fun solution(A: IntArray): Int {
        A.sortedArray().also { sortedArray ->
            for(i in sortedArray.indices) {
                if(sortedArray[i] != i + 1) {
                    return i + 1
                }
            }
        }
        return A.size + 1
    }
}

/*
https://app.codility.com/demo/results/trainingTUJB7H-BH5/
 */
