package pratice

fun main() {

    //익명 중첩 클래스 //인터페이스나 추상클래스 생성과 동시에 바로 오버라이딩해서 사용
    // 한번만 사용 가능 //객체화 불가
    var t1 = object : ttest{
        override fun ttestMethod() {
            println("익명 중첩 클래스 입니다")
        }

    }


}
//내부 클래스 사용하려면 먼저 외부 클래스가 객체화 되있어야함 -> 내부 객체 사용가능하다라는 의미는 외부객체는 이미 100프로 생성되있음
//내부클래스에서 외부 클래스 사용은 자유롭지만 반대는 그렇지 못함
class Outer1 {

    var a1 = 100

    fun outerMethod(){
        println("outerMethod 입니다")
    }
    //내부 클래스
    //내부 클래스는 외부클래스로부터 생성 객체를 통해서 생성 가능하다.
    inner class Inner1{

        var a2 = 200

        fun innerMethod(){
            println("innterMethod 입니다")
        }
   }
}


interface ttest{

    fun ttestMethod()

}