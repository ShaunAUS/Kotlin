package pratice

fun main() {


    //기본 상속
    var obj1 = childClass()
    println(obj1.b1)
    println(obj1.childMethod())

    println(obj1.a1)
    println(obj1.parentMethod())

//==================================================
    //자식타입클래스를 부모타입 참조변수에 넣기
    var obj2:ParentClass = obj1


    println(obj2.a1)
    println(obj2.parentMethod())

    //부모타입이라 자식타입은 호출 불가
    /*println(obj2.b1)
    println(obj2.childMethod)*/

//==================================================
    //오버라이딩

    var obj3 = childClass()
    print(obj3.parentMethod2())


    var obj4 = ParentClass2()
    overrideTestMethod(obj4)
}

open class ParentClass{

    var a1 = 100

    //멤벼 변수도 오버라이딩 가능
    open var a2 = 200


    fun parentMethod(){
        println("부모 클래스 메서드")
    }

    open fun parentMethod2(){
        println("오버라이딩 될 메서드")
    }
}

class childClass : ParentClass(){

    var b1 = 300

    //부모 클래스 멤버변수 오버라이딩
    override var a2 = 300

    fun childMethod(){
        println("자식 클래스 메서드 ")
    }

    override fun parentMethod2() {
        println(" 오버라이드 된 메서드")
    }
}

//==========================================
open class ParentClass2(){

    open fun parentClass2(){
        print("parentClass2 메서드")
    }
}

//부모클래스타입의 매개변수라 부모클래스타입 참조변수 전달 가능
fun overrideTestMethod(obj1:ParentClass2){

    obj1.parentClass2()
}