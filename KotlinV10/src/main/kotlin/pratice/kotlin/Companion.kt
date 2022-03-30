package pratice.kotlin

fun main() {

    var obj1 = comClass()

    //자바에서는 static이라도 객체생성하고 호출 가능하지만 코틀린은 불가
   /*obj1.a2
    obj1.comMethod2*/
    println(comClass.a2)
    println(comClass.comMethod2())


    //자바(Static X) ->코틀린에서 호촐
    var obj2 = JavaMain()
    print(obj2.javaMethod())
    print(obj2.a)

    //자바(Static O) -> 코틀린에서 호촐
    //똑같이 자바이름 가지고 용한다
    print(JavaMain.javaMethod2())
    print(JavaMain.a2)

}

class comClass{

    var a1 = 100

    //자바의 static
    companion object{

        var a2 = 200

        @JvmStatic var a3 = 400

        fun comMethod2(){
          println("companion Method")
          //companion은 인스턴스필요 없음 //하지만 클래스는 객체필요// companion 외부데이터 사용 불가
          //print(a1)
        }

    }

    fun comMethod(){
        print("comClass Method ")
    }
}