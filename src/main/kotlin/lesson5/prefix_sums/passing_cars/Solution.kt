package lesson5.prefix_sums.passing_cars

class Solution {
    /***
     * 풀이
     * 배열 A 에는 0 : 동쪽방면 or 1 : 서쪽방면 의 값만 있다.
     * 배열의 값이 0, 1 이 되는 Pair 의 경우의 수를 찾는 문제.
     * 0 이 새로 등장하면, 이전의 값은 참조하지 않는다.
     * 경우의 수가 1,000,000,000 초과 시 -1 리턴
     */
    fun solution(A: IntArray): Int {
        var count = 0
        var sum = 0
        for(i in A.indices) {
            if(A[i] == 0) {
                sum += 1
            }
            else {
                count += sum
                if(count > 1_000_000_000) {
                    return -1
                }
            }
        }

        return count
        /* 결과
        https://app.codility.com/demo/results/training9R8J9R-9CS/
         */

        /* 풀이 1
        // 우선 무식하게 카운팅 해보자.
        // A[i] 의 값이 0 인 경우 이후 A[i + N] 이 1 인 갯수를 센다.
        // 이후 다음 A[i + N] 이 0 인 인덱스를 찾아서 위의 짓거리를 반복한다.
        var count = 0
        for(i in A.indices) {
            if(A[i] == 0) {
                count += A.slice(i until A.size).count { item -> item == 1 }
                if(count > 1_000_000_000) {
                    return -1
                }
            }
        }
        return count
        // 결과
        // 역시 시간복잡도에서 걸린다.
        // https://app.codility.com/demo/results/trainingDVKA4E-EB4/
        */
    }
}
