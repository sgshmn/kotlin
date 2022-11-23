fun main() {

    // 1. val : value. 상수. 한 번 초기화하면 바꿀 수 없다

    // 선언
    // 공간 만들기
    // int num

    // 초기화
    // 값 대입
    // num = 1

    val name = "이영웅" // 선언하고 동시에 초기화를 하면 자료형을 생략해도 된다

    // 자료형 명시 방법
//    val age : Int = 20 써도 되긴 하다
    val age : Int
    age = 20
//    age = 21  // Val cannot be reassigned : val은 바꿀 수 없다

    // 2. var : variable. 변수. 바꿀 수 있다
    var weight = 50
    weight = 51

//    weight = 3.14 // Remove redundant assignment : 불필요한 할당을 지운다
    // ctrl + shift + p : 자료형을 확인할 수 있다

    // 선언, 초기화를 같이 하면 자료형을 안 써도 된다
    // 위 경우에서 자료형을 써도 된다
    // 선언과 초기화를 따로 하면 자료형을 써야 한다

    println("이름 : $name") // $ 뒤에 변수를 쓰면 변수를 출력한다. 코틀린 포맷

}