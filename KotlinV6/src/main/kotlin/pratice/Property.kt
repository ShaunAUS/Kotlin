package pratice

fun main() {


    var obj1 = PropertyTestClass(100,200)

    println(obj1.a1)
    println(obj1.a2)

    obj1.a1 = 2000

    var obj2 = PropertyTestClass2()
    obj2.v3 = 5000   //setter
    println(obj2.v3) //getter

}


//기본 생성자로 생성시 ->  getter/setter/멤버변수 설정 자동
//기본 생성자 생략 가능
class PropertyTestClass (var a1:Int , val a2:Int){


    //var or val 은 주 생성자한테만 붙일수 있다.
    //constructor(var a1:Int,var a2:Int,var a3:Int) : this(a1,a2){}
}


//멤버변수 선언 -> getter/setter 설정 자동
class PropertyTestClass2{
    var v1 = 0
    val v2 = 30
    var v3 = 100

        //코틀린은 게터,세터 자동생성이기떄문에 직접작성시 이렇게 해야함
        get(){
            println("get메서드 호출")
            return field   //field 는 v3를 의미함
        }
        set(value){
            println("set메서드 호출")
            field = value // field 는 v3를 의미함
        }
}