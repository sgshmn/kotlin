fun main() {

    // when문 변수 x의 값이 1 또는 2와 일치하는지 확인해보자

    var x = 1


    // when은 끝에 else를 꼭 써야한다
    when (x) {

        // 값 -> 값이 일치할 때 실행할 문장
        1 -> println("x = 1")
        2 -> println("x = 2")
        else -> println("x != 1 and x != 2")

    }

    var number = readLine()!!.toInt()
    // 입력한 숫자가 10~20인지 확인
    // !! 나중에는 이렇게 쓰면 안 된다. 지금은 공부하고 있으니까 숫자만 입력하면 되지만 나중에는 아닐 수도 있다.

    // in : 데이터가 범위에 속하는지 확인
    when (number) {
        in 10..20 -> println("10 <= number <= 20")
        else -> println(number)
    }

    var str = "안녕하세요" // String


    // is : 데이터 타입이 무엇인지 판단
    when (str) {
        is String -> println("문자열입니다")

        else -> println("문자열이 아닙니다")
    }
}