package pratice


//모든 클래스의 부모 클래스= Any 클래스
fun main() {

    testMethod(testClass1())
    testMethod(testClass2())
    testMethod(testClass3())

}

class testClass1 (){

    override fun toString(): String {
      return   "testClass1 입니다"
    }

}

class testClass2 (){

    override fun toString(): String {
        return   "testClass2 입니다"
    }

}

class testClass3 (){

    override fun toString(): String {
        return   "testClass3 입니다"
    }

}

//모든 클래스의 부모클래스는 Any
//고로 모든타입의 클래스가 매개변수로 들어올수 있다.
fun testMethod(a1:Any){

    println("a1 : $a1")

}