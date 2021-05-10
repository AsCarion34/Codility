package lesson8.leader.equileader

class Solution {
    /***
     * 분석)
     * 주어진 배열에서 Leader 를 구한다.
     * - 배열 내에 가장 빈도수가 많아야 한다.
     * - 빈도수가 배열의 반이 넘어야 한다.
     * 주어진 배열을 2개의 부분 배열로 나누었을 때, 각 부분 배열에서 위의 Leader 가 만족하는지 갯수를 찾는다.
     * ex)
     * A[0], A[1]~A[N-1] 이 모두 Leader 가 만족하는가?
     * A[0]~A[1], A[2]~A[N-1] 이 모두 Leader 가 만족하는가? 등...
     */
    /*
     * 풀이)
     * 우선 Leader 값을 구한다. (Kotlin 인라인 함수 사용)
     * 이후 A 배열을 크기별로 쪼개면서 Leader 빈도수를 계산한다.
     * 조건에 맞는지 체크하면서 카운팅을 진행한다.
     */
    fun solution(A: IntArray): Int {
        if(A.size <= 1) {
            return 0
        }

        // leader 와 갯수를 구한다.
        var leader = Int.MIN_VALUE
        var leaderCount = 0
        val countMap = mutableMapOf<Int, Int>() // 각 값과 빈도수를 저장한다.
        A.forEach { i ->
            countMap[i]?.also { countMap[i] = it + 1 } ?: countMap.put(i, 1)
            if(countMap[i]!! > A.size / 2) {
                leader = i
                leaderCount = countMap[i]!!
            }
        }

        if(leader == Int.MIN_VALUE) {
            return 0
        }

        // 배열을 순회하면서 왼쪽/오른쪽 카운트를 구하여 계산한다.
        var result = 0
        var leftCount = 0
        for(i in A.indices) {
            // 현재 값이 leader 인 경우 왼쪽 배열 카운트 누적
            if(A[i] == leader) {
                leftCount += 1
            }

            val rightCount = leaderCount - leftCount    // 오른쪽 남은 갯수 계산
            // 왼쪽 배열과 오른쪽 배열의 equiLeader 여부를 체크한다.
            val leftLeaderCheck = leftCount > ((i + 1) / 2)
            val rightLeaderCheck = rightCount > (A.size - (i + 1)) / 2
            // 조건이 맞는 경우 갯수를 카운트 한다.
            if( leftLeaderCheck && rightLeaderCheck ) {
                result += 1
            }
        }
        return result
    }
    /* 결과
     * https://app.codility.com/demo/results/trainingRG4JRS-PG2/
     */
    /*
     * 풀이)
     * 우선 Leader 값을 구한다. (Kotlin 인라인 함수 사용)
     * 이후 A 배열을 크기별로 쪼개면서 Leader 빈도수를 계산한다.
     * 조건에 맞는지 체크하면서 카운팅을 진행한다.
     */
    /*
    fun solution(A: IntArray): Int {
        if(A.size <= 1) {
            return 0
        }

        // val leader = A.groupBy { it }.filter { it.value.size > A.size / 2 }.keys.first()
        var leader = Int.MIN_VALUE
        val countMap = mutableMapOf<Int, Int>()
        A.forEach { i ->
            countMap[i]?.also { countMap[i] = it + 1 } ?: countMap.put(i, 1)
            if(countMap[i]!! > A.size / 2) {
                leader = i
            }
        }

        if(leader == Int.MIN_VALUE) {
            return 0
        }

        var count = 0
        for(i in 1 until A.size) {
            val leftCount = A.toList().subList(0, i).let { list ->
                list.count { it == leader }
            }
            val rightCount = A.toList().subList(i, A.size).let { list ->
                list.count { it == leader }
            }

            if(leftCount > i / 2 && rightCount > ( (A.size - i ) / 2 )) {
                count += 1
            }
        }
        return count
    }
    */
    /* 결과
     * O(N**2) 가 나온다.. 줄여보자...
     * https://app.codility.com/demo/results/trainingSXVTGP-457/
     */
}
