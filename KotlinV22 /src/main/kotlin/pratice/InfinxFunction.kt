package pratice


//함수호출을 연산자처럼!
fun main() {


    var v1 =100
    var r1 = v1.add(50)
    println("v1 = ${v1}")

   /* val i = v1 add 500
    println("i = ${i}")*/

}

//함수명 옆은...  어떤타입(누가) 사용할지 표시?
infix fun Int.add(a1:Int) : Int{

    return this + a1
}