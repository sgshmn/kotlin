fun main() {

    // 변수에 담지 않은 함수를 람다식으로 선언한 상태
    {x: Int, y: Int -> x + y}
    // 더하기 기능을 필효할 때마다 쓰려면 저장해야한다 : 변수에 저장하자
    val sum : (Int, Int) -> Int = {x:Int, y:Int -> x+y}
    // 이름 : (매개변수의 자료형, 매개변수의 자료형, ...) -> 리턴 자료형 = { 매개변수:자료형, 매개변수:자료형, ... -> 리턴}

    sum(3,4)

    println(sum(3,4))
    
    // 1 람다식의 매개변수에 자료형을 명시하면
    // 변수(sum)의 자료형을 생략할 수 있다
    val sum1 = {x:Int, y:Int -> x+y}
    
    // 2 sum의 매개변수에 자료형을 명시하면
    // 람다식의 매개변수 자료형을 생략할 수 있다
    val sum2 : (Int, Int) -> Int = {x,y -> x+y}
    
    // 단, 람다식과 변수의 자료형을 둘 다 생략할 수 없다
    // 둘 중 하나는 꼭 있어야 한다


    // "Hello Kotlin"출력하는 람다식 함수 선언
    val greet : () -> Unit = {println("Hello Kotlin")}
    // 매개변수가 없다
    // -> 가 없기 때문에 리턴이 없다 = 리턴 타입이 Unit이다
    // 매개변수의 자료형, 리턴타입 생략할 수 있다

    // 정사각형의 넓이를 구하는 람다식 함수 선언
    // 매개변수 Int

    val square = {x:Int -> x*x}

    // 람다식 단점
    // 안드로이드에서 쓰는 데이터 타입을 잘 알고 있어야 잘 쓸 수 있다



    // Data Structure

    // stack : FILO First In Last Out  안드로이드의 activity가 이 방법과 같다
    // Queue : FIFO First In First Out
    // Tree : 나뭇가지
    // List : 목록????
    // Array : ???? 같은 타입의 변수를 하나로 묶어서 다루는 자료구조



}