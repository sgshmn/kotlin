fun main() {

    // ArrayOf()
    // 값을 직접 넣을 수 있다
    // int[] arr = {1,2,3,4,5,6} 이것처럼 쓴다
    var arr = arrayOf(1,2,3)

    // 타입을 지정하지 않으면 모든 타입이 들어갈 수 있다
    var arr2 = arrayOf(1,"가", true, 2.71)

    // 데이터 타입을 지정할 수도 있다
    // 지정한 데이터 타입만 넣을 수 있다

    // 제네릭
    var arr3 = arrayOf<Int>(10,20,30)
    // 코틀린 제공함수
    var arr4 = intArrayOf(100,200,300)

    // 비어있는 배열을 선언하고 싶다면
    // arrayOfNulls() 사용
//    var arr6 = arrayOfNulls<Button>(10) // Button??

    // array.first() : 첫번째 요소 확인
    println(arr4.first())

    // array.last() : 마지막 요소 확인
    println(arr4.last())

    // array.average() : 배열의 평균 출력
    println(arr4.average())

    // array.sum() : 모든 값을 더하기
    // array.count() : 값이 몇 개 있냐?


}