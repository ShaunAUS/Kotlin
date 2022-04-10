package pratice

fun main() {

    //두 타입의 인터페이스를 구현 했기때문에 두 메서드 매개변수 타입에 알맞음
    var obj1 = implementClass()
    call(obj1)
    call2(obj1)
}

open abstract class AbstractClass1(){

    open abstract fun abstractMethod1()
}

open abstract class AbstractClass2(){

    open abstract fun abstractMethod2()
}

fun testFun1(a1:AbstractClass1){
    a1.abstractMethod1()
}

fun testFun2(a2:AbstractClass2){
    a2.abstractMethod2()
}


class KimClass : AbstractClass1(){
    override fun abstractMethod1() {
        print("abstractMethod1")
    }
}

class JunClass : AbstractClass2(){
    override fun abstractMethod2() {
        print("abstractMethod2")
    }
}

//open abstract 생략 가능
interface Inter1{

    fun interMethod1(){
        print("Inter1의 interMethod 1")
    }

    fun interMethod2()
}

interface Inter2{

    fun interMethod3(){
        print("Inter2의 interMethod 3")
    }

    fun interMethod4()
}

//매개변수로 인터페이스 구현한 자료타입
fun call(a1:Inter1){

    a1.interMethod1()
    a1.interMethod2()
}

fun call2(a1:Inter2){

    a1.interMethod3()
    a1.interMethod4()
}

//인터페이스 구현 클래스
//인터페이스이기 때문에 () 생략 가능
// 이 클래스로 객체만든뒤 참조변수의 자료타입이 각각 인터페이스 타입마다 호출할수 있는 메서드가 다르다.
class implementClass : Inter1,Inter2{

    //인터페이스 -일반메서드도 오버라이딩 가능
    override fun interMethod1() {
        super.interMethod1()
    }

    override fun interMethod2() {
        TODO("Not yet implemented")
    }

    override fun interMethod4() {
        TODO("Not yet implemented")
    }


}