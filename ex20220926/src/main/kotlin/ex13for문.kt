fun main() {

    // for문으로 5 ~ 15 출력하기

    for (x in 5..15) { // ..은 default로 1씩 증가한다
        print("$x ")
    }
    println()

    // 15 ~ 1 출력하기
    // 1씩 감소해야한다
    // .. 대신 downTo : 1 씩 감소

    for (x in 15 downTo 1) {
        print("$x ")
    }
    println()

    // 1 ~ 50 에서 홀수만 출력
    // 1 3 5 7 9 ...
    // x in 1 .. 49 step 2
    // step : 시작점에서 도착점까지 이 간격으로 이동한다

    for (x in 1 .. 50 step 2) {
        print("$x ")
    }
    println()

    // 50 ~ 1 에서 짝수만 출력
    // 50 48 46 44 ...
    // x in 50 downTo 1 step 2

    for (x in 50 downTo 1 step 2) {
        print("$x ")
    }
    println()

}