package pratice


//연사자 오버로딩
fun main() {

    //코틀린에서는 정수가 아닌 객체와 객체가 연산된다
    var num1 = 100
    var num2 = 200

    //왼쪽에있는 객체가 가지고있는 메서드호출하고 오른쪾을 전달
    var add = num1+num2
    println(add)

    var add2 = num1.plus(num2)

//======================================================================

    var obj1 =hiClass(100,200)
    var obj2 =hiClass(200,300)

    //왼쪽에있는 객체가 가지고있는 메서드호출하고 오른쪾을 전달
    //왼쪽이 this, 오른쪽 target
    var cc = obj1+obj2


}

class hiClass(var a1:Int,var a2:Int){

    operator fun plus(target:hiClass): hiClass{

       var m1 = this.a1+target.a1
       var m2 = this.a2+target.a2

        var result = hiClass(m1,m2)
        return result



    }

}