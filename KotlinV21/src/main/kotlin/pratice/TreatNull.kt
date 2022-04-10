package pratice

fun main() {

}

// ? = 널일수도 , 널이 아닐수도
// !! = 널일수도 ,널이 아닐수도 -> 널안됌
fun testFun1(str:String?){

    val value1 =str!!

}

// ? = 널이면 기본 디폴트값 설정 가능
// ?: 붙여야함 띄어쓰기 x
fun testFun2(str:String?){

    val value2 = str ?: "널이면 기본 디폴특값"

}


// ?.   ->  널이 들어올수도 있는값에 변수나 ,메서드 사용시 사용
// 널이면 그냥 널 반환
fun testFun3(str:String?){

    println("str.length = ${str.length}")
    println("str.length = ${str?.length}")  //널이 아니면 값 반환 // 널이면 str length = null

}