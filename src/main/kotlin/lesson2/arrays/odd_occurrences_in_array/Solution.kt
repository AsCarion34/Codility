package lesson2.arrays.odd_occurrences_in_array

// 주어진 배열 중 Pair 가 아닌 하나의 수를 찾아서 리턴한다.
class Solution {
    // https://app.codility.com/demo/results/trainingSN72CS-5JC/
    // 비트연산을 이용한 방법으로 처리.. 이렇게는 잘 안쓰지 않나? 싶긴 하다.
    fun solution(A: IntArray): Int {
        var oddInt = 0;
        for(i in A.indices) {
            oddInt = oddInt xor A[i]
        }
        return oddInt
    }
}

/***
 https://app.codility.com/demo/results/trainingCNUSZU-YWM/
 타임아웃 문제가 있다..
 fun solution(A: IntArray): Int {
   return A.groupBy { it }.filter { entry -> entry.value.size % 2 != 0 }.keys.first()
 }
 ***/

/***
 https://app.codility.com/demo/results/trainingYDUZ7G-6DU/
 같은 결과인 것을 확인하였다. filter 의 속도 문제가 아닌 GroupBy 의 속도 문제인 것으로 의심하였다.
    fun solution(A: IntArray): Int {
        A.groupBy { it }.forEach { (t, u) ->
            if(u.size % 2 != 0) {
                return t
            }
        }
        return 0
    }
 ***/

/***
 https://app.codility.com/demo/results/training2KKTTC-X7B/
 세번쨰 시도.. legacy 하게 풀어보았지만 마지막 테스트케이스에서 timeout...
 웃긴건, java 코드로 변환하여 테스트하면 통과된다. kotlin 의 속도가 java 보다 느린것인가?
fun solution(A: IntArray): Int {

    if(A.isEmpty() || A.size > 1000000) {
        return 0
    }

    var oddInt = 0
    val elementMap = mutableMapOf<Int, Int>()
    // A.groupBy { it } 을 풀어서 한다...
    for(i in A.indices) {
        if(elementMap.containsKey(A[i])) {
            elementMap[A[i]]?.also { elementMap[A[i]] = it + 1 }
        }
        else {
            elementMap[A[i]] = 1
        }
    }
    // filter { entry -> entry.value.size % 2 != 0 }.keys.first() 를 풀어서...
    for(keyValue in elementMap) {
        if(keyValue.value % 2 != 0) {
            oddInt = keyValue.key
            break
        }
    }

    return oddInt
}
***/
