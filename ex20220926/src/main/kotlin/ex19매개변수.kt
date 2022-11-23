fun main() {

    // 만약 회원이 이메일을 안 쓰면
    // "default" 를 저장하고 싶다
    addList("이영웅", "default")
    addList("오지영", "default")
    addList("조승재", "default")
    addList("이호준", "default") // 너무 귀찮다

    addList2("yyw")
    addList2("강성관", "kang@ai.com")





}
// 1 회원정보 저장 프로그램 (이름, 이메일)
fun addList(name : String, email : String) {
    // 저장하는 어떤 코드

}

// 2 email을 쓰지 않았을 때 기본값을 설정하자
fun addList2(name: String, email: String = "default") {
    println("$name : $email")
}

