
//상속
//부모클래스는 디폴트가 final,  상속 받게하려면 open 붙여줘야함
fun main() {


    var obj1 = childClass()
    println(obj1.a1)
    println(obj1.a2)
}

//자바처럼 생성자 지정안하면 매개변수 없는 생성자가 자동으로 생성된다
open class parentsClass{

    var a1 = 10
    var a2 = 20

}


//상속 할때 부모클래스의 생성자 호출해야함(이건 매개변수없는 생성자 호출)
class childClass : parentsClass(){

    var b1 = 30
    var b2 = 40
}

//매개변수가 있을 경우
/*
open class parentsClass(var x1:Int){

    var a1 = 10
    var a2 = 20

}
*/

/*
class childClass : parentsClass(10){

}
*/
