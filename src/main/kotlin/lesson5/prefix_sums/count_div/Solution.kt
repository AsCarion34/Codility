package lesson5.prefix_sums.count_div

class Solution {
    /***
     * 풀이)
     * 주어진 값 A, B, K 가 있다.
     * 범위 [A ~ B] 내에 K 로 나누어 떨어지는 수의 개수를 반환한다.
     */
    fun solution(A: Int, B: Int, K: Int): Int {
        /* 방법 1)
        // 주어진 범위를 순회하면서 K 로 나눈 나머지가 0인 경우 count 해보자.
        var count = 0

        for(i in A .. B) {
            if(i % K == 0) {
                count += 1
            }
        }
        return count
        // 결과)
        // https://app.codility.com/demo/results/trainingT9RX69-W4J/
        // 웬일로 쉽다 했다. 시간복잡도에서 문제가 생긴다. 좀 더 효율적인 방법을 찾자.
        */

        /* 방법 2)
        // 뭔가 공식이 있을 것 같다. 연산을 좀 더 줄일 만한..
        // A -> B 로 모두 순회하지 않는 방법이 Key 인듯 싶은데...
        // B / K 의 몫은 A / K 의 몫을 포함하므로 빼 주는데,
        // 여기서 A 가 K 의 배수인 경우도 있으므로 이 경우 1을 더하면?
         */
        ((B / K) - (A / K)).also { result ->
            if(A % K == 0) {
                return result + 1
            }
            return result
        }
        // 결과)
        // https://app.codility.com/demo/results/trainingNTPMAD-FP2/
    }
}
