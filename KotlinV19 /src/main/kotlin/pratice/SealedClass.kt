package pratice

fun main() {


    //SealedClass 안의 클래스에 데이터 넣기
    //sealedCleass 는 객체를 생성할때 값을 넘겨주면 되기때문에 변경가능하다
    var v1 =testSealed.tsClass2(2)
    var v2 =testSealed.tsClass2(3)


    sealedMethod(v1)
    sealedMethod(v2)

}

//enum 이 상수들을 관리하는 개념이면 sealedClass 는 객체들을 관리하는 개념
//sealedClass 상속받는다
sealed class testSealed{

    class tsClass1(var n1:Int) : testSealed()
    class tsClass2(var n2:Int) : testSealed()
    class tsClass3(var n3:Int) : testSealed()
}

//내용체크가 아닌 클래스 타입 체크
fun sealedMethod(ee:testSealed){

    when(ee){

        //객체 타입체크 = is
        //스마트 캐스팅 일어남
        //enum.클래스타입 -> 클래스타입에따라 사용가능한 변수가 다르다.
        is testSealed.tsClass1 -> {
            println("테스트 1")
            ee.n1
        }
        is testSealed.tsClass2 ->{
            println("테스트 2")
            ee.n2
        }
        is testSealed.tsClass3 -> {
            println("테스트 3")
            ee.n3
        }
    }

}


//==========================================================================================
enum class testEnum(var qq:Int){

    ONE(1), TWO(2),THREE(3),

}

fun testEnumMethod(ww:testEnum){

    when(ww){

        testEnum.ONE -> println("ONE")
        testEnum.TWO -> println("TWO")
        testEnum.THREE -> println("THREE")
    }

    when(ww.qq){
         1-> println("1")
        2-> println("2")
        3-> println("3")
    }
}



