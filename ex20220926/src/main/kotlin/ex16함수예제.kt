fun main() {

//    println("sum(10,4) = ${sum(10, 4)}") // 이게 왜 되냐???????????? // 이런 일을 방지하려면 파일을 패키지를 만들어야한다
    println("sum3(10,4) = ${sum3(10, 4)}") 
    println("sub(10,4) = ${sub(10, 4)}")
    println("mul(10,4) = ${mul(10, 4)}")
    println("div(10,4) = ${div(10, 4)}")
}

fun sum3(n1: Int, n2: Int) = n1 + n2

fun sub(n1: Int, n2: Int) = n1 - n2

fun mul(n1: Int, n2: Int) = n1 * n2

fun div(n1: Int, n2: Int) = n1 / n2
