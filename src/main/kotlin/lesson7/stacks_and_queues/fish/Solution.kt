package lesson7.stacks_and_queues.fish

import java.util.*

class Solution {
    /***
     * 분석
     * A 배열 : 물고기의 크기 (큰놈이 작은놈을 먹는다.)
     * B 배열 : 방향 (0 : upstream, 1: downstream)
     * 각 물고기 P 는 A 배열의 크기로 B 배열의 해당 인덱스의 값으로 방향을 갖는다
     * 각 물고기의 방향이 다른 경우, 크기가 큰 물고기가 살아남는다.
     */
    fun solution(A: IntArray, B: IntArray): Int {
        /* 풀이
        // Stack 을 이용한다.
         */
        var aliveCount = 0
        val stack = Stack<Int>()
        A.indices.forEach { i ->
            if(B[i] == 1) {
                stack.push(i)
            }
            else {
                while(!stack.isEmpty()) {
                    if(A[stack.peek()] > A[i]) {
                        break
                    }
                    stack.pop()
                }
                if(stack.isEmpty()) {
                    aliveCount += 1
                }
            }
        }

        return aliveCount + stack.size
    }
    /* 결과
    // https://app.codility.com/demo/results/trainingVA6W28-2RS/
     */
}
