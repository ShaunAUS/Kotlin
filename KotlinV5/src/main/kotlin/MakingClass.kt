fun main() {


    // 만들어진 객체는 메모리상에 올라와 cpu가 사용가능하다
    // 메모리어디에 있는지 나태내기위해 변수에 객체의 주소값이 들어간다
    var obj1 = TestClass()
    var obj2 = TestClass()  //다른 객체

    var obj5 = TestClass()
    println("obj5.a1 = ${obj5.a1}")  //코틀린은 접근제한자 초반에 다 private  이것도 게터임

}

//내용 없으면 중가로 생략가능
class TestClass{

    //코틀린은 변수에 대한 setter , getter 자동 생성
    var a1 = 0
    var a2 = 0

}