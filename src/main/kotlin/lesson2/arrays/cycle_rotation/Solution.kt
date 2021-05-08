package lesson2.arrays.cycle_rotation

class Solution {
    fun solution(A: IntArray, K: Int): IntArray {
        // K % A.size 로 처리하면 시간 복잡도를 줄일 수 있다.
        // Array 의 K 번째 부터 재정렬 하면 된다.
        if(A.isEmpty()) {
            return A
        }

        val retArray = A.copyOf()
        for(i in A.indices) {
            retArray[(i + K) % A.size] = A[i]
        }
        return retArray
    }
}

/*
https://app.codility.com/demo/results/trainingGGM2HU-Z7U/
 */
