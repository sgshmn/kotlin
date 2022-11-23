fun main() {

    var n1 = 24
    var n2 = 24
    var result = largerNumber(n1, n2)

    print(result)
}

fun largerNumber(n1: Int, n2:Int) = if (n1 > n2) n1 else if (n1 < n2) n2 else null
