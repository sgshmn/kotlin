fun main() {
    print("금액을 입력하세요 >> ")

    var str = readLine()!!
    var donStr = if (str == "") "0" else str
    var don = donStr.toInt()

    var price : Int

    println("메뉴를 고르세요")
    println("[1]  아우터 700원")
    println("[2]  이구동성 1000원")
    println("[3]  에그몽 500원")
    print(">> ")

    var menu = readLine()

    when (menu) {

        "1" -> price = 700
        "2" -> price = 1000
        "3" -> price = 500

        else -> price = 0
    }

    if (don >= price) don -= price else println("잔액이 부족합니다")

    println("잔돈 : $don")

}