//함수

fun test(){
    println("hi")
}

fun test2(a1:Int, a2:Double){

    println(a1)
    println(a2)

}
//값이 안들어오면 기본값 설정할수 있다
//반환값은 뒤에 //unit는 생략가능
// 변수나 메서드 반환타입은 생략가능 but 매개변수는 생략 불가
fun test3(a3:Int=33 , a4:Int = 0):Unit{
    println("a3 : $a3")
    println("a4 : $a4")

}
//test5  지역함수는 외부에서 호출 불가
fun test4(){

    fun test5(){

    }
}