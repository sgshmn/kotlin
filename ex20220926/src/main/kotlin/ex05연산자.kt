fun main() {

    // = 대입 연산자
    val numOfApple = 12

    // 복합대입연산자
    // += -= *= /= ...
    // numOfApple += 1    numOfApple = numOfApple + 1

    // 증감연산자
    // ++ --
    var num1 = 10
    var num2 = 10

    var result1 = ++num1
    var result2 = num2++

    println(num1) // 11
    println(num2) // 11
    println(result1) // 11
    println(result2) // 10

    // 비교 연산자
    // > < >= <=

    // ==
    // 값만 비교. 같으면 true
    // !=
    // 값만 비교. 다르면 true

    // ===
    // 주소만 비교. 주소가 같으면 true. 근데 주소가 같은데 값이 다를 수 있나?
    // !==
    // 주소만 비교. 주소가 다르면 true

    val a : Int = 128 // 기본 자료형은 주소가 없다
    val b = 128

    println(a === b) // true

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c // 주소도 대입한다

    println(c == d) // true
    println(c === d) // false
    println(c === e) // true

    

}