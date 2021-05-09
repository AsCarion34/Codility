package lesson4.counting_elements.missing_integer

class Solution {
    // 주어진 배열에서 존재하지 않는 0보다 큰 가장 최소의 positive 정수를 구한다.
    // negative 값과 0은 삭제 후 정렬한다. (중복 또한 제거)
    // 최소값 1 부터 쭉 찾아본다.
    fun solution(A: IntArray): Int {
        var smallest = 1
        A.sortedArray().also { ints ->
            for(i in ints.indices) {
                if(ints[i] == smallest) {
                    smallest += 1
                }
            }
        }
        return smallest
        /*  distinct 및 filter 에서 시간 복잡도 증가..
        // 중복 제거 및 양수만 남긴다.
        A.distinct().filter { i -> i > 0 }.sorted().also { list ->
            var smallest = 1
            for(i in list.indices) {
                if(list[i] == smallest) {
                    smallest += 1
                }
                else {  // list[i] > smallest
                    break
                }
            }
            return smallest
        }
        */
    }
}

/*
https://app.codility.com/demo/results/training4WCT5X-XPY/
 */
