package pratice

fun main() {

    var obj1 = testClass4()

    var obj2 = testClass4()
    testObject(obj2)
}


open  abstract class testClass{

    fun testsMethod1(){
        print("testMethod 1")
    }

    open abstract fun testsMethod2()

}


class testClass4 : testClass(){

    override fun testsMethod2() {
        print("testclass4 의 testMethod2")
    }
}

//매개변수 타입이 추상 클래스
fun testObject(a1:testClass){
    a1.testsMethod1()
    a1.testsMethod2()
}