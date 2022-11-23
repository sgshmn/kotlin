import com.sun.xml.internal.fastinfoset.util.StringArray

fun main() {


    // 1 Array()

    // var array = Array(크기, {값})
    // var array = Array(크기){값}

    // 크기는 10이고 모든 자리에 0을 넣은 배열을 만들자
    var array1 = Array(10){0}

//    for (element in array1) {
//        println(element)
//    }

    // 크기는 10이고 모든 자리에 인덱스*3의 값이 들어가게 해보자
    var array2 = Array(10){i ->  i*3}

    for (element in array2) {
        println(element)
    }

    // 크기는 5, 모든 자리에 공백
    var array3 = Array(5){""}

    // 2 Array()에 특정 데이터를 지정하고 싶을 때

    // 제네릭 <> : ArrayList<String> 자바에서 제네릭 쓰는 예시
    var array4 = Array<String>(5){""}

    // 코틀린이 제공하는 기본타입 배열(클래스)
    var array5 = IntArray(10){0} // 뒤에 {0}을 안 써도 0이 들어간다
    // 자료형+Array() 기본자료형 배열


    // array2 get, set
    array2[0] = 100
    array2.set(1, 200) 
    println(array2.get(1))

    for (element in array4) {
        println(element)
    }

//    var array6 = StringArray<String>(5){""}
    var array6 = arrayOfNulls<String>(5) // 위에처럼 쓰지말고 여기처럼 쓰자

}

