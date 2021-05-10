package lesson7.stacks_and_queues.nesting

import java.util.*

class Solution {
    /***
     * 분석
     * bracket ( ) 에 대하여
     * 올바른 중첩 여부 확인하는 문제로 보인다.
     */
    fun solution(S: String): Int {
        val stack = Stack<Char>()
        S.toCharArray().forEach { char ->
            if(stack.isEmpty()) {
                stack.push(char)
            }
            else {
                if(stack.peek() == '(' && ')' == char) {
                    stack.pop()
                }
                else {
                    stack.push(char)
                }
            }
        }

        return if (stack.size > 0) 0 else 1
    }
    /* 결과
    // https://app.codility.com/demo/results/training9MXY7D-ABC/
     */
}
