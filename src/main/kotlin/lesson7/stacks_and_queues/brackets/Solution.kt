package lesson7.stacks_and_queues.brackets

import java.util.*

class Solution {
    /***
     * 분석
     * 아래 조건 중 하나라도 참이면 적절한 중첩으로 간주
     * 1) S 가 비어있는 경우
     * 2) S는 "(U)", "[U]"또는 "{U}"형식을 가지며 여기서 U는 적절하게 중첩 된 문자열
     * 3) S는 "VW"형식을 가지며 여기서 V와 W는 적절하게 중첩 된 문자열
     * 적절한 중첩문인 경우 1 반환, 아닌경우 0 반환
     * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
     *
     * N은 [0..200,000] 범위 내의 정수
     * 문자열 S는 "(", "{", "[", "]", "}", ")" 문자로만 구성
     */
    fun solution(S: String): Int {
        /* 풀이
        // Stack 을 이용하여 "(", "{", "[" 인 경우 Push,
        // ")", "}", "]" 인 경우 pop 하면서 맞는 쌍인지 비교한다.
         */
        val stack = Stack<Char>()
        S.toCharArray().forEach { c ->
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c)
            }
            else {
                // pop 한다.
                if(stack.isEmpty()) {
                    // 짝이 맞지 않으므로 0 리턴
                    return 0;
                }
                stack.pop().also { popChar ->
                    when {
                        popChar == '(' && c != ')' -> return 0
                        popChar == '{' && c != '}' -> return 0
                        popChar == '[' && c != ']' -> return 0
                    }
                }
            }
        }
        return if (stack.isEmpty()) 1 else 0
        /* 결과
        // https://app.codility.com/demo/results/trainingPZ7U9K-ZGQ/
         */
    }
}
