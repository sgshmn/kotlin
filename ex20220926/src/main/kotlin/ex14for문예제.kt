fun main() {

    // 1 부터 100 까지의 홀수의 합과 짝수의 합을 구하자!
    var gkq = 0
    for (x in 1..100 step 2) gkq += x

    println("홀수의 합 : $gkq")

    for (x in 2 .. 100 step 2) gkq += 1

    println("짝수의 합 : $gkq")

}