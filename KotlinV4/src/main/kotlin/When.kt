
//자바의 switch - case와 유사하다
//조건문에 코틀린에서 사용하는 모든 타입 가능하다
fun main() {

     var a1 = 10

    when(a1){

        10 -> print("a1은 10입니다")

        20 -> {
            print("a1은 20입니당")
            print("a1은 20입니다")
        }

        else-> print("a1이 10또는 20이 아닐경우 실행되는 공간")

    }


    var a2 = 20

    when(a2){

        20,30 -> print("a2 는 20 또는 30 입니다")
        40,50 -> print("a2는 40 또는 50입니다")
    }

    //when in   해당 되는 첫쨰값만 출력
    var a3 = 5

    when (a3){

        in 1..3 -> print("a3 은 1과 3사이에 있습니다")
        in 3..5 -> print("a3 은 3과 5사이에 있습니다")
    }


    val value1 = setValue(1)
    val value2 = setValue(2)
    val value3 = setValue(3)
    print(value1)
    print(value2)
    print(value3)



}
fun setValue(a1 : Int) = when(a1){
    1-> "문자열1"
    2-> "문자열2"
    else -> "그 외의 문자열"
}