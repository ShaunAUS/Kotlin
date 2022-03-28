fun main() {


    var obj1 = TestTestClass()
    var obj2= TestTestClass2()
    var obj3= TestTestClass2(10,20)

    println("=====================")

    var obj4 = TestTestClass5(5,6)

    println("=====================")

    var obj5 =TestTestClass5(100)
    println(obj5.x1)      //코틀린은 접근제한자 초반에 다 private  이것도 게터임
    println(obj5.x2)
}


//자바와 다르게 코틀린은   생성자와, init() 이 있다.
//생성자는 주로 멤버변수 초기화용 , init() 은  객체가 생성되면 반드시 생성되는 코드들이다
class TestTestClass{

    //생성자가 호출되도 init() 무조건 실행되서 둘다 호출된다
    //init() 안에 주생성자가 있으면 주생성자 실행뒤 init()실행
    init {

        println("객체가 생성되면 반드시 실행되는 부분")
    }

    constructor(){
        println("hihihi")
    }

}


//자바와 비교해서 이름만 바뀜
class TestTestClass2{


    //= 부생성자
    constructor(){
        println("매개변수 없는 생성자")
    }

    //= 부생성자
    constructor(c1:Int, c2:Int){
        print("매개변수 $c1 , $c2  가 있는 생성자" )
    }
}


//기본 생성자 ( =주 생성자)
//클래스를 생성할때 옆에 쓰는 생성자

class TestTestClass3(v1:Int, v2:Int){       //->매개변수 만 받는 생성자 생성

}

class TestTestClass4(var v1:Int, var v2:Int){    // -> getter,setter, 멤버변 선언, 매개변수 생성자로 필드값 지정 자동생성 // val 이면 게터만

}



//이런 경우는 대입된값, 즉 주생성자부터 실행되고 init()실행
//보조 생성자 호출시 순서 = 보조생성자에서 주생성자 호출-> init() -> 보조생성자 코드
class TestTestClass5(var x1:Int, var x2:Int){

    init{

        println("init() 실행")
        println("x1 :${x1}")
        println("x2 : ${x2}")
    }

    // 주생성자 부생성자 같이 있으면 주생성자를 무조건 호출 해야함 -> 여기서 this는 주생성자!
    //보조 생성자는 var/val 키워드 사용 불가
    constructor(x1:Int) : this(x1,100){
        println("보조 생성자 호출")
    }

}


