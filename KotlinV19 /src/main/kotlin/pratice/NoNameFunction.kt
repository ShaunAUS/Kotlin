package pratice

fun main() {


    //코틀린에서 메서드를 변수에 담는건 불가
  //  var no = noNameFunction

    //익명 함수 = 이름이 없기 떄문에 변수에 담아서 사용한다
    //변수명으로 호출한다
    var no = fun(){
        println("익명 함수입니다.")
    }
}

fun noNameFunction(){
    println("일반함수")
}
