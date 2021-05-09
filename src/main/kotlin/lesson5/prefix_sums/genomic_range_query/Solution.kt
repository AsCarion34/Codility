package lesson5.prefix_sums.genomic_range_query

class Solution {
    /***
     * 풀이)
     * S 의 DNA 의 뉴클리오티디스 계수
     * A: 1, C: 2, G: 3, T: 4
     * 배열 P, Q 의 각 인덱스 i 의 값이 S 의 indexFrom - indexTo 가 되고,
     * 이 인덱스의 사이에 해당하는 최소의 뉴클리오티디스 계수를 배열로 반환한다.
     */
    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
        /* 풀이
        // 일반적으로 풀어서는 시간복잡도를 통과하지 못한다.
        // 입력 된 S 의 값에 대하여 각 뉴클리오티디스 계수로 빈도수를 표현하는 배열을 만든다..
         */

        // 주어진 S 를 기준으로 각 시퀀스 별 빈도 수 를 계수 배열로 변환한다.
        // 뉴클리오티디스 계수 정보
        val nucleotidesMap = mapOf('A' to 0, 'C' to 1, 'G' to 2, 'T' to 3)
        val templateCount = IntArray(nucleotidesMap.size) { 0 }
        val dnaSequenceArray = Array(S.length) { IntArray(templateCount.size) }

        for(i in S.toCharArray().indices) {
            templateCount[nucleotidesMap[S[i]]!!] += 1
            for(j in templateCount.indices) {
                dnaSequenceArray[i][j] = templateCount[j]
            }
        }

        // 주어진 P, Q 인덱스의 계산을 위 배열로 처리한다.
        val M = P.size
        val returnArray = IntArray(M) { 0 }
        for(i in 0 until M) {
            for(j in templateCount.indices) {
                val qData = dnaSequenceArray[Q[i]][j]
                val pData = if(P[i] == 0) 0 else dnaSequenceArray[P[i] - 1][j]
                if(qData - pData > 0) {
                    returnArray[i] = j + 1
                    break
                }
            }
        }

        return returnArray
        /* 결과
        // https://app.codility.com/demo/results/training55MJ3Q-TVN/
         */


        /* 풀이 1
        // 우선 S 를 각 계수의 IntArray로 변환한다.
        // 이후 S[P[i]] - S[Q[i]] 의 최소값을 찾는다.
        */
        /*
        val queries = IntArray(P.size) { 0 }
        S.toCharArray().map { c ->
            when(c) {
                'A' -> 1
                'C' -> 2
                'G' -> 3
                else -> 4
            }
        }.also { list ->
            (queries.indices).forEach { i ->
                // codility 에서는 Kotlin 버전 문제로 minOrNull() 대신 deprecated 된 min() 을 사용
                queries[i] = list.slice(P[i]..Q[i]).minOrNull() ?: 0
            }
        }
        return queries
        */
        /* 결과
        // https://app.codility.com/demo/results/trainingWM5QJH-X6Q/
        // 또 타임아웃이다...
        // O(M + N) 이하의 복잡도가 나와야 된다고 한다.
         */
    }
}
