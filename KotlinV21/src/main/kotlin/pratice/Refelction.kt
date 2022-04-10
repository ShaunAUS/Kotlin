package pratice

import kotlin.reflect.KClass

fun main() {


    var obj1:KClass<String> = String::class
    var obj2:Class<String> = String::class.java

    println("코틀린에서의 String 타입 ${obj1}")
    println("자바에서의 String 타입 ${obj2}")

    println(String::class) //  스트링이라는 타입이 코틀린타입으로는 어떻게 되는지
    println(String::class.java) // 스트링이라는 타입이 자바에서는 어떤타입으로

    //===================================================================================================

    //변수에 들어간 -> out추가4

    var str1 = "안녕하세요"
    var obj3:KClass<out String> = str1::class
    var obj4:Class<out String> = str1::class.java

    println("코틀린에서 안녕하세요 타입 ${obj3}")
    println("자바에서 안녕하세요 타입 ${obj4}")
    //===================================================================================================

    // * = 모든타입 허용

    var obj5:KClass<*> = str1::class
    var obj6:Class<*> = str1::class.java

    println(obj5)
    println(obj6)
    //===================================================================================================

    //클래스
    var obj0 = testclass()
    var obj7:KClass<*> =obj0::class
    var obj8:Class<*> =obj0::class.java

    println("코틀린에서의 obj0 타입 ${obj7}")
    println("자바에서의 obj0 타입 ${obj8}")

    //클래스 분석
    //T or F
    println(obj0::class.isAbstract)
    println(obj0::class.isCompanion)
    println(obj0::class.isData)
    println(obj0::class.isInner)
    println(obj0::class.isOpen)
    println(obj0::class.isSealed)

//===================================================================================================
    //클래스 생성자 분석
    var cons =obj0::class.constructors


    //주생성자, 보조생성자1 ,보조생성자2 니까 for문 돌리기
    // for(변수 in 배열){}
    for(constructors in cons){

        println("constructors = ${constructors}")

        //생성자의 매개변수 추출
        for(param in constructors.parameters){

            println("param = ${param}")

            //매개변수 정보 // 이름,타입,순서
            println(param.index)//파라미터가 몇번째인지
            println(param.name)
            println(param.type)
        }
    }

    //주 생성자
    val priConstructor = obj0::class.primaryConstructor

    //주 생성자가 없을수도 있으니까
    if(priConstructor != null){

        println(priConstructor)

    }

    //주생성자 매개변수
    for(priParam in priConstructor){

        println(priParam.index)
        println(priParam.name)
    }

//===================================================================================================

    //멤버변수(프로퍼티)
    var properties = obj0::class.declaredMemberProPerties

    for(prop in properties){

        println(prop.name)


    }
//===================================================================================================

    //메서드
 var met= obj0::class.declaredMemberFunctions

    for(methods in met){
        println(methods.name)
    }

}

class testclass() {

    var t1 = 100
    var t2 = 200


    //부생성자 생성시 주생성자 필수
    constructor(a1:Int) : this(){

    }
    constructor(a1:Int,a2:Int): this(){

    }
    fun tMethod(){

    }
}