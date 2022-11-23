fun main() {
    printSum(3,7) // 매개변수 2개 받아서 합을 출력한다
}

// Unit 함수 : 반환값이 없다
//fun printSum(n1:Int, n2:Int):Unit {
fun printSum(n1:Int, n2:Int):Unit {
    println(n1 + n2)
    // return 안 쓴다
}

// return 키워드가 없으면 Unit으로 추론할 수 있다
// Unit 리턴타입 생략가능
// 문장 하나라서 중괄호도 생략할 수 있다

//fun printSum(n1:Int, n2:Int) = println(n1 + n2)