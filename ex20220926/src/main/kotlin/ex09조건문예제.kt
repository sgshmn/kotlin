fun main() {

    // !! : null이 될 수 없다
    // ? : null이 될 수 있다
    print("Enter the number : ")

    var number = readLine()!!.toInt() // !! 필요하다

    var result = if (number > 0) "양수 값" else if (number < 0) "음수 값" else "0" 

    println(result)

    // !! : readLine()에 입력 값은 null이 아니다
    // ? : readLine()에 입력 값은 null이 될 수도 있다

    print("Enter the Nubmer : ")
    var num = readLine()!!

    try {

        var num2 = num.toInt()
        if (num2 > 0){
            println("양수")
        }else{
            print("음수")
        }

    } catch (e : NumberFormatException){
        println("문자열입니다")
    }



}