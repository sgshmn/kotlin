fun main() {

    println("sum(3,7) = ${sum(3, 7)}")
    println("sum1(3,7) = ${sum1(3, 7)}")
    println("sum2(3,7) = ${sum2(3, 7)}")

    println()




}

// main() 밖에 함수를 선언하고 구현해야한다

fun sum(n1 : Int, n2 : Int) : Int{
    return n1 + n2
}

// 함수 간략화 하기

// 1 {} (body)가 한줄이면 중괄호와 return키워드를 생략할 수 있다
// 그리고 = 로 대체한다

fun sum1(n1: Int, n2: Int) : Int = n1 + n2

// 2 매개변수 Int 두 개를 더한 결과값을 반환하는 것을 통해
// 결과값이 Int 자료형임을 추론할 수 있다
// 자료형을 생략할 수 있다

fun sum2(n1: Int, n2: Int) = n1 + n2

// 2를 실무에서 많이 쓴다
// 코드를 줄일 수 있고 가독성이 좋기 때문이다



