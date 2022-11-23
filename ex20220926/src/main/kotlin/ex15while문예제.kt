fun main() {
    println("I know the n!")
    print("n = ")
    var n = readLine()!!.toInt()

    var rhq = 1
    while (n > 1) rhq *= n--

    println("n! = $rhq")
    
    // try-catch문으로 오류를 잡을 수 있다
}