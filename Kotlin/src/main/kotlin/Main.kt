fun main() {
    //문자열
    //세미콜론 선택사항
    print("정수" + 100); //자바
    print("정수 ${100}") //코틀린 //변수만 있으면 {} 생략 가능

    //정수형
    print(10000000000000)    //자동으로 L이 붙는다
    print(232_124_524_323) //숫자 한눈에보기

    //실수형
    print(11.11)  // 더블타입
    print(11.11F) // float

    //Raw String
    print("동해물과\n백두산이\n마르고\n닳도록")  //자바

    print("""동해물과
        |백두산이
        |마르고
        |닳도록
    """.trimMargin())                   //코틀린

    //var = 선언이후 값을 변경할수 있다 // 메모리 많이먹고 느리다
    //val = 선언이후 값을 변경 x  (ReadOnly)
    // 변수 타입 자동 추론

    println("===================")

    var a1 = "안녕하세요"
    print("a1 :$a1")


    println("===================")
    //null

    var number = 100 //물음표 없으면 null이 아닌값만 허용
    var number2:Int? = null   //물음표는 null허용+null이 아닌값 허용

    var number3:Int? = number  //가능하다
    var number4:Int = number2  //불가능
    var number4:Int = number2!!  // !! 는  물음표있는걸 물음표 없는 타입으로 바꿔준다



}