package pratice

fun main() {

}

class DelayClassTest(){

    //a1 은 정수값이 있어서 타입추론가능
    //a2는  값이 없으니 자료타입 안써주면 오류남
    //var 은 사용하기전 값이 무조건 초기화 되야함// val은 setter가 없어서 lateinit 사용 불가
    var a1= 100
    var a2:Int
    lateinit var a3:String   // 초기화 하지 않고 사용할수있다는게 아니라 변수선언시 초기화하지 않을수 있다는 의미


    //사용할때 그때 초기화가 일어난다. 선언시 초기화되지 않고
    val a4:String by lazy {
        println("a4 init")
        "문자열"
    }


    init {
        a2= 200
    }

    fun testMethod(){

        //리플렉션  + 초기화 여부
        if(::a3.isInitialized == false ){
            a3 = "문자열"
        }
    }



}