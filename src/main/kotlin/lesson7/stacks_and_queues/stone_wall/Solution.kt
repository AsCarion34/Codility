package lesson7.stacks_and_queues.stone_wall

import java.util.*

class Solution {
    /***
     * 분석)
     * H 배열의 길이만큼 돌담을 쌓으려 한다.
     * H 배열에는 각 돌담의 N 위치 별 높이가 있다.
     * 최소 필요한 블럭의 갯수를 구한다.
     * ex)
     * H[0] = 8    H[1] = 8    H[2] = 5
     * H[3] = 7    H[4] = 9    H[5] = 8
     * H[6] = 7    H[7] = 4    H[8] = 8
     * 이 경우 최소 7 개의 블럭이 필요하다.
     */
    /* 풀이
     * 블럭을 쌓는다고 생각하면..
     * stack 에 아무것도 없으면 Stack 에 블럭이 될 것을 넣는다.
     * stack.peek() < H[i] 이면, H[i] 를 push 하고 블럭 카운트를 증가시킨다.
     * stack.peek() > H[i] 이면, H[i] 높이의 새로운 블럭으로 교체하므로 stack 의 블럭을 없애준다. (pop)
     * 같은 경우 동일 블럭으로 간주할 수 있으므로 아무 작업이 필요 없다.
     */
    fun solution(H: IntArray): Int {
        val stack = Stack<Int>()
        var count = 0
        H.forEach { height ->
            while(stack.size > 0 && stack.peek() > height) {
                stack.pop()
            }
            if(stack.isEmpty() || stack.peek() < height) {
                stack.push(height)
                count += 1
            }
        }
        return count
    }
    /* 결과
    // https://app.codility.com/demo/results/trainingCB4DBV-8GZ/
     */
}
