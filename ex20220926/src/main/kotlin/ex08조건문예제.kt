import java.util.Random

fun main() {

    // Random rd = new Random()
    val rd = Random()

    // rd를 사용해서 정수를 랜덤으로 1~10 사이의 수를 2개 가져오기

    var n1 = rd.nextInt(9) + 1
    var n2 = Random().nextInt(9) + 1 // 안드에서 많이 쓴다

    println("$n1 + $n2 = ?")

    // 사용자가 입력하는 답

    print("Enter the Answer : ")

    var answer = readLine()?.toInt() // ? 필요하다

    var result = if (n1 + n2 == answer) "정답" else "오답"

    print("결과 : ${result}입니다")
}