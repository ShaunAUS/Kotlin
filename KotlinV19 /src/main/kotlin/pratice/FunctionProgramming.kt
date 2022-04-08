package pratice


fun funMethod(a1:Int,a2:Int): Int {

    return a1+a2
}

//메서드 내용이 단순 매개변수를 더하고 반환하는거면 이렇게 한줄로 정의가 가능함
fun funMethod2(a1:Int,a2: Int) : Int = a1+a2


fun main() {


    // var test:String ="안녕"
    var lamda1: (Int,Int) -> Int = {a1:Int,a2:Int -> a1+a2}

    //코틀린은 타입 추론 가능이라 람다식 타입 생략 가능
    var lamda2 =  {a1:Int,a2:Int -> a1+a2}

    //람다호출
    var lamdaResult = lamda2(100,200)

//==============================================================


    // 함수는 return을 써야하지만 람다식 마지막 반환은 return 필요 없다
  var lamda4 = {c1:Int,c2:Int ->

      var x1 = c1+c2
      var x2 = c1-c2

      x1*x2
  }

}


