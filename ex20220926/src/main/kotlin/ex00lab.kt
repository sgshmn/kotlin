fun main() {
    var email = "@.cc"

    var k = email.split("@")

    println(k.size)

    println(k)
    var a = k[1]

    var b = a.split(".")

    println(b.size)

    println(b)

    println(email[1])

}