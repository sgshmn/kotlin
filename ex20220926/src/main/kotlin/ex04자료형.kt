import kotlin.reflect.typeOf

fun main() {

    // 자료형 : 자바와 유사. 근데 첫 글자가 대문자다

    // Boolean, Char, Byte, Int
    // String

    val isHot : Boolean = true

    // 형변환
    // Int -> String : toString()
    val number1 : Int = 56
    println(number1::class.java.simpleName)  // int
    val str1 : String = number1.toString()
    println(str1::class.java.simpleName) // String

    // Double -> Float : toFloat()
    val number2 : Double = 3.14
    val number3 : Float = number2.toFloat()
    val number4 : Float = 3.14f // 실수형 데이터는 Double이 기본형이다.
    // 실수 뒤에 f를 붙여야 Float으로 바꾸면서 생기는 손실이 있다는 것을 알릴 수 있다.

    // 스마트 캐스트
    // 내가 저장하고 싶은 값이 정수일 수도 있고 실수일 수도 있을 때
    // Number : Int, Float, Double, Short, Byte 등등의 부모 자료형
    var score : Number = 12.2
    println(score::class.java.simpleName) // .class.java.simpleName 자료형. Double
    score = 12
    println(score::class.java.simpleName) // Integer ???? int와 Integer ?? 뭐가 다르지? Integer 는 null가능

    // Any : Java의 Object와 비슷한 것
    // 코틀린 최상위 자료형
    var test : Any = "yyw"
    println(test::class.java.simpleName)
    test = 23
    println(test::class.java.simpleName)

    var test2 = 12
    println(test2::class.java.simpleName) // int
//    test2 = "" // Kotlin: Type mismatch: inferred type is String but Int was expected
    
}