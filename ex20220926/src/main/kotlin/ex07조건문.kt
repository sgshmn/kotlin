fun main() {

    // if- else

    var num1 = 11
    var num2 = 24

    var result : Int

    if (num1 > num2) {
        result = num1
    } else {
        result = num2
    }

    println("큰 수 : $result")


    // 위 if - else 간략화 하기
    // 실행코드가 1줄이면 중괄호 생략가능
    var result2 = if (num1 > num2) num1 else num2
    print("큰 수 : $result2")

}