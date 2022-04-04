package pratice

fun main() {

    //보조 생성자 사용
    var obj1 =ByeClass(100,200,300)
    var obj2 =HiClass(1,2,3,)

//===================================================================
    //클래스와 데이터 클래스 차이점 1
    var obj3 = ByeClass(3,4,5,)
    var obj4 = ByeClass(3,4,5,)

    //일반 클래스는 주소값이 달라 다른객체로 나옴
    //일반 클래스는 Any클래스 상속 -> Any클래스의 == 는 주소값 비교
    if(obj3==obj4) println("같은객체입니다") else print("다른 객체 입니다")

//===================================================================
    //클래스와 데이터 클래스 차이점 1
    var obj5 = HiClass(3,4,5,)
    var obj6 = HiClass(3,4,5,)

    //데이터 클래스는 주소값이 달라도 같은객체로 나옴
    //코틀린은 연산자를 사용하면 그냥 사용하는게 아니라 연산자와 관련된 메서드를 호출해서 사용
    //여기서는 == 를 그냥 사용하는게 아니라 equals() 를 호출해서 사용
    if(obj3==obj4) println("같은객체입니다") else print("다른 객체 입니다")

//===================================================================
    //DataCLass Copy Method
    //주생성자 매개변수 a1,a2로 메서드 만들기때문에 a3 복제 대상이 아님
    var obj7 = obj5.copy()
    println(obj7.a1)
    println(obj7.a2)
    println(obj7.a3)

//===================================================================

    //DataCLass toString Method

    println(obj5.toString())
    println(obj6.toString())

//===================================================================

    //DataClass component Method
    //그냥 객체.변수로 불러도 된다 하지만 이것은
    //<주생성자에 있는 매개변수> 순서대로 반환

    print(obj5.component1())
    print(obj5.component2())


    //이러 방법도 <주생성자 매개변수> 순서대롭 반환
    var (num1 ,num2 ) = obj5
    println(num1)
    println(num2)



}



class ByeClass(var a1:Int , var a2:Int){

    var a3 = 0


    init {
        print("일반 클래스 init")
    }

    //보조 생성자 사용시 주생성자 호출 먼저
    constructor(a1:Int ,a2:Int , a3:Int) :this (a1,a2){
        this.a3 = a3
    }

}


//데이터 클래스는 매개체에대한 정보관리를 위한 목적
//그래서 변수 하나이상 , 주생성자 필수
// 데이터 클래스는 메서드를 만들떄 주생성자에 있는 매개변수 위주로 만든다. 밑의 a3는 메서드에 포함 안됌
data class HiClass(var a1:Int , var a2:Int){


    var a3 =0;

    init {
        print("Data 클래스 init")
    }

    constructor(a1:Int,a2:Int,a3:Int) : this(a1,a2){
        this.a3= a3
    }
}