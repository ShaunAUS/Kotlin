package pratice

fun main() {


    //제네릭 = 객체 생성시 타입결정
    var obj1 = noLegDayClass<Int>()
    obj1.noLegMethod(11)

    var obj2 = noLegDayClass<String>()
    obj2.noLegMethod("String 제네릭")


    var obj3 = noClass<Int>( 5)
    println(obj3.a1)
    obj3.noClassMethod(6)


    //복합
    var obj4 = noClass2<Int,Int,String,String>(10,20)
    obj4.noClassMethod2("인냥","안녕")




    //일반제네릭은 무조건 자기와 같은 제네릭타입만
    //상속 x , 부모 x
    var b1:TestClass5<subClass> = TestClass5<subClass>()
    var b2:TestClass5<subClass2> = TestClass5<subClass>()
    var b3:TestClass5<superClass> = TestClass5<subClass>()

    //재네릭 자식->부모
    //out
    var c1:TestClass6<subClass> = TestClass6<subClass>()
    var c2:TestClass6<subClass2> = TestClass6<subClass>()
    var c3:TestClass6<superClass> = TestClass6<subClass>()


    //재네릭 부모->자식
    //in
    var v1:TestClass7<subClass> = TestClass7<subClass>()
    var v2:TestClass7<subClass2> = TestClass7<subClass>()
    var v3:TestClass7<superClass> = TestClass7<subClass>()


}
//예시1
class noLegDayClass <T>(){

    fun noLegMethod(a1:T){

        println("a1 = ${a1}")
    }
}
//예시2
class noClass<T>(var a1:T){

    fun noClassMethod(a2:T){
        println("a1 = ${a1}")
        println("a2 = ${a2}")
    }

}

//예시3
class noClass2<A,B,C,D>(var a1:A ,var a2 :B){


    fun noClassMethod2(a3:C,a4:D){

        println("a1 = ${a1}")
        println("a2 = ${a2}")
        println("a3 = ${a3}")
        println("a4 = ${a4}")

    }
}
//예시 4
open class superClass()
open class subClass:superClass()
class subClass2 : subClass();

//불변성
//재내렉이 같은 타입에 담을수 있다.
class TestClass5<A>()

//공변성(out)
//재네릭   자식-> 부모
class TestClass6<out A>()

//반 공변성(in)
//재네릭 부모 ->자식
class TestClass7<in A>()

