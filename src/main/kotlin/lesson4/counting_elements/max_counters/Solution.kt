package lesson4.counting_elements.max_counters

import kotlin.math.max

class Solution {
    // N 은 카운터가 될 배열의 크기 (초기값 0)
    // A 배열의 각 값에 해당하는 N[A] 를 +1 씩 카운트한다.
    // A[X] 의 값이 N의 크기보다 큰 경우, 제일 큰 값으로 N 을 초기화 (시간초과가 생길 수 있다.)
    // 수정
    // max counter 조건 발생 시, 바로 바꾸지 말고, 나중에 한번에 maxCount 보다 작은 요소만 바꿔준다.
    fun solution(N: Int, A: IntArray): IntArray {
        // N 의 사이즈로 초기화 된 배열을 생성한다.
        var counterArray = IntArray(N) { 0 }
        var maxCount = 0    // 제일 큰 카운트 값을 지정한다.
        var localMax = 0    // 지역 최대값을 저장하기 위한 변수

        (A.indices).forEach { i ->
            // max count 처리
            if(A[i] > N) {
                maxCount = localMax
            }
            else {
                if(counterArray[A[i] - 1] < maxCount) {
                    counterArray[A[i] - 1] = maxCount + 1
                }
                else {
                    counterArray[A[i] - 1] += 1
                }

                localMax = max(localMax, counterArray[A[i] - 1])
            }
        }

        (counterArray.indices).forEach { i ->
            counterArray[i] = max(counterArray[i], maxCount)
        }
        return counterArray
    }
}

/*
extreme_large : all max_counter operations
TIMEOUT
https://app.codility.com/demo/results/trainingAMA8UV-UUE/
100%
https://app.codility.com/demo/results/trainingK35RMX-8SE/
 */
