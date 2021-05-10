package lesson8.leader.dominator

class Solution {
    /***
     * 분석)
     * 주어진 배열 A 에서 절반 이상의 빈도수가 있는 Element 의 인덱스 중 아무거나 반환한다.
     * 만약 없으면 -1 을 반환한다.
     */
    /* 풀이)
     * 배열의 반 이상의 갯수로 존재하는 원소를 찾아야 한다.
     * 전체를 순회하게 되면 무조건 시간 복잡도에 걸린다.
     * map 을 이용하는데.. Map<Int, Set<Int>> 형을 사용해보자.
     * key : 값, value : 인덱스 값의 Set (인덱스는 중복될 일이 없으므로 List 로 사용하여도 무방할 듯)
     * 배열을 순회하면서 Set 에 값을 넣어주는데, 넣어줄 때마다 갯수가 배열의 반 이상인지 확인한다.
     * 이렇게 한번 순회하면 최대 O(n) 으로 동작할 것으로 예상된다.
     */
    fun solution(A: IntArray): Int {
        val dominateSize = A.size / 2
        val elementMap = mutableMapOf<Int, MutableList<Int>>()
        A.forEachIndexed { index, i ->          // A 배열을 인덱스 번호와 같이 순회
            // map 에 key 가 있으면 인덱스를 추가하고, 없는 경우 새로 만들어준다.
            elementMap[i]?.also { it.add(index) } ?: elementMap.put(i, mutableListOf(index))
            elementMap[i]!!.also {
                if(it.size > dominateSize) {    // 원소 갯수의 크기가 절반 이상이면
                    return it[0]                // 처음 인덱스를 반환한다.
                }
            }
        }
        return -1       // 모두 순회해버린 경우는 dominator 가 없는 경우이므로 -1 을 리턴한다.
    }
    /* 결과)
     * https://app.codility.com/demo/results/trainingZH6CJS-RZ8/
     */
    /*
     * 풀이)
     * 절반 이상의 빈도수 이므로 하나만 존재한다.
     * 우선 각 배열의 수를 Group 화 후에, 갯수가 배열의 반 이상인 것을 찾는다.
     * 이후 해당 값의 인덱스를 반환한다.
     */
    /*
    fun solution(A: IntArray): Int {
        return A.groupBy { it }.filter { it.value.size > (A.size / 2) }.let {
            if(it.isEmpty()) -1 else A.indexOf(it.keys.first())
        }
    }
    */
    /* 결과
     * 역시나 이렇게 풀면 편한 대신 시간복잡도에선 문제가 생긴다...
     * 최대 O(N**2) 인 경우가 생기므로..
     * https://app.codility.com/demo/results/trainingQTH45D-P4M/
     */
}
