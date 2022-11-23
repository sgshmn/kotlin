fun main() {

    // Kotlin 에서 null을 허용하는 방법 : ? safe call

    var str1 : String = "Hello Kotlin" // 그냥 String 이면 null을 허용하지 않는다. 허용하고 싶으면 뒤에 ?를 붙여주자
    // str1 = null

    var str2 : String? = "Hello Kotlin"
    str2 = null

    // Hello Kotlin or null
    // str1의 길이 str1.length

    println(str1.length)
    println(str2?.length) // ?를 쓰면 null이 될 수 있음을 컴퓨터에게 알린다

    // !! null이 될 수 없다. ? 처럼 쓰면 된다

    // 엘비스(Elvis) 연산지 : null을 처리하는 두 번째 방법
    // 값(변수일수도 있고 아닐 수도 있고)?:값이 null 일 때
    println("length of str2 : ${str2?.length ?:-1}")



}

// String : 기본형 데이터 저장
// String? : 참조형 데이터 주소 저장