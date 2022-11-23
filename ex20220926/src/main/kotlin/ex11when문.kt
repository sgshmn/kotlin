fun main() {

    // x가 1이거나 2라면 "x는 1 또는 2 입니다"
    var x = 3

    when (x) {
//        1 -> print("x는 1 또는 2 입니다")
//        2 -> print("x는 1 또는 2 입니다")

        1, in 2..3 -> println("x는 1 또는 2 입니다") // 원래는 1, 2 였는데 내가 궁금해서 바꿔봤다
        in 3..4 -> println("?")
        else -> println("결과 : $x")
    }

}