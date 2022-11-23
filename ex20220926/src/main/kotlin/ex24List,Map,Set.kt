fun main() {
    // Collection

    // MutableList
    // MutableMap
    // MutableSet
    // ArrayOf(크기) {처음에 초기화 시킬 값}

//    var a = listOf<Int>(1, 2, 3)  // 이거랑 뭐가 다르지?

    // MutableList



    // 1 MutableList 생성하기 -> 가변배열
    val testList1 = mutableListOf("a", "b", "c")
    // testList1의 크기 : 3

    // 2 MutableList에 데이터 추가하기 : .add(데이터)
    testList1.add("d")
    testList1.add(1, "a1")
    println(testList1)


    // Map

    // Map : python의 dictionary, JSON과 비슷하다
    // key, value쌍이 있다
    // 1 Map 생성
    val newcoding = mutableMapOf<Int, String>()

    // 2 Map에 데이터 추가하기
    newcoding[1] = "이호준"
    newcoding[2] = "조승재"
    newcoding.put(3, "이영웅")
    newcoding.put(4, "오지영")

    // 3 한번에 출력하기
    for (i in newcoding) {
        println(i)

        // i의 key만 확인하기
        println(i.key)
        // i의 value만 확인하기
        println(i.value)
        println()
    }


    // Set

    // Set : 중복데이터를 없앤다
    // 데이터를 추가 : .add()
    // 데이터를 삭제 : .remove()

    // 1 Set 생성
    val testList2 = mutableSetOf("a", "b", "c")

    // 2 데이터 추가
    testList2.add("d")
    testList2.add("d")
    testList2.add("d")
    println(testList2)

}