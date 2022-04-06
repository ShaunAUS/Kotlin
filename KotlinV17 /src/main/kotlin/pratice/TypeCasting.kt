package pratice

//객체타입 형변환 = 상속관계 or 인터페이스 관계
fun main() {

    var obj1 = TestSubClass()  //일반상속 클래스
    var obj2 = TestSubClass2() //인터페이스 구현 클래스

    //스마트 캐스팅(=형변환)
    //부모 클래스 타입 참조변수에 담는다.
    //  자식 ->부모   / 구현클래스 ->인터페이스
    // ex) Car car = new Bmw()
    var super1:SuperClass = obj1
    var inter1:InterClass = obj2

    //그 반대로는 불가능
    // ex) Bmw bmw = new Car()
    var super2:TestSubClass = super1
    var inter2:TestSubClass2 = inter1


//=============================================

    //as = 지정된 클래스 타입으로 강제 형변환
    //부모타입  -> 자식타입
    var change = super1 as TestSubClass
    change.heyMethod()

    //자식 -> 부모
    var cc  = obj1 as SuperClass

    //인터페이스 -> 구현한 클래스
    var change2 = inter1 as TestSubClass2
    change2.byeMethod()

    //구현한 클래스 ->인터페이스
    var change3 = obj2 as InterClass

//===============================================

    //is = 객체가 형변환이 가능한지 여부만 T/F로 체크
    //자식 -> 부모
    var obj3  = TestSubClass()
    var result = obj3 is SuperClass   // TestSubClass -> SuperClass 로 형변환 가능한지?체크
    println(result)  // T or F

    //부모 ->자식
    var qwe:SuperClass = obj3
    var result2 = qwe is TestSubClass
    println(result2) // T or F


    // is + if문 =true이면
    // 자동으로 스마트캐스팅 하지만 if문을 벗어나는 순간 원상태로 돌아감
    if(qwe is TestSubClass){

        //qwe as TestSubClass
        qwe.heyMethod()
    }

//=============================================

    //Any + is
    var any1 = TestSubClass()
    var any2 = TestSubClass2()

    anyMethod(any1)
    anyMethod(any2)

//=============================================
    //기본타입 형변환
    //참조 변수 타입이 변경되는게 아니라 새로운 객체가 생성되어서 반환 된다

    var num1 = 100
    var changedNum1 = num1.toLong()


}



open class SuperClass{}
interface InterClass


class TestSubClass : SuperClass(){

    fun heyMethod(){
        println("heyhey")
    }
}


// 인터페이스는 ()뺴기
class TestSubClass2 : InterClass{

    fun byeMethod(){
        println("byebye")
    }
}
// 그냥 사용하면 any 타입 메서드만 사용기능 하지만
// If문 + is
//들어오는 타입에따라 메서드 다르게
fun anyMethod(obj:Any) {

    if(obj is TestSubClass){

        obj.heyMethod()

    }else if(obj is TestSubClass2){

        obj.byeMethod()
    }else if(obj is Int){
        println("정수입니다.")
    }else if(obj is String){
        println("문자열입니다.")
    }

}

//null 안정성을 위한 형 변환
fun nullCheckMethod(str:String?){

    println(str?.length)

    //null 을 허용하는 변수에 Null이 들어있지 않다는 것을 보장해주면 null을 허용하지 않는 타입으로 스마트 캐스팅 발생
    if(str is String){
        //스마트 캐스팅 발생
        println(str.length)
    }

    //null 을 허용하는 변수에 Null이 들어있지 않다는 것을 보장해주면 null을 허용하지 않는 타입으로 스마트 캐스팅 발생 2
    if(str != null){

        //스마트 캐스팅 발생
        println(str.length)
    }

    println(str.length) // if 문 밖은 형변환 원래대로
}


fun nummCheckMethod2(aa:Any?){


    // 확실히 널이 아니면서 + string 타입
    if(aa is String){
        aa.length
    }

    //널은 아니지만 any타입이라 string 타입이라고 보장못함
    if(aa !=null){
        aa.length
    }
}