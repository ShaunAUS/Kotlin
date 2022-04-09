package pratice

//고차함수
fun main() {


//===================익명함수 매개변수로 넘겨주기==============================
    //익명함수 = m1
    var v1 = fun(c1:Int,c2:Int):Int{
        return c1+c2
    }

    //호출 방법 1
    HighFunction(200,200,v1)

    //호출 방법 2
    //익명함수라 바로 넣어주기
    HighFunction(200,200,fun(c1:Int,c2:Int):Int{
        return c1+c2
    })
//==========================람다 매개변수로 넘겨주기 ==============================

    var lamda22 = {x1:Int,x2:Int -> x1*x2}

    //호출 방법 1
    HighFunction(200,200,lamda22)

    //호출방법 2
    //람다 바로 넣어주기
    HighFunction(200,200,{x1:Int,x2:Int->x1*x2})

    //람다식이 길어질 경우를 대비해서 () 밖으로도 작성이 가능하다
    //그래서 람다식을 매개변수 마지막에 받는것이 일반적이다
    HighFunction(200,200){x1:Int,x2:Int ->x1*x2}

//==========================반환값을 함수로 ==============================


    //반환값 익명함수
    //n1 = 익명함수가 들어옴
    val n1 = HighFunction2()
    val n2 = n1(100, 200)
    println("n2 = ${n2}")
        
    //반환값 람다식
    var w1 =HighFunction3()
    val w2 = w1(200, 300)
    println("w2 = ${w2}")
    

    //매개변수가 하나인 함수를 매개변수로 받는 함수
    HighFunction4({j1:Int -> j1 + 100},200)

    //매개변수가 한개인 함수를 매개변수로 받는경우 = it 사용! 무조건 한개일떄
    HighFunction4({it},200)



}

//매개변수에 함수 넣어주기
fun HighFunction(a1:Int, a2:Int , m1:(Int,Int)->Int){

}

//반환값 함수로
fun HighFunction2(): (Int, Int) -> Int {

    return fun(q1:Int,q2:Int): Int{

        return q1+q2

    }

}
//반환값을 람다식으로
fun HighFunction3():(Int,Int) -> Int{

    return {t1:Int,t2:Int -> t1+t2}
}

// 매개변수가 하나인 함수를 매개변수로 받는 함수
fun HighFunction4(m2:(Int) ->Int,y1:Int){

    var r4 = m2(y1)
    println("r4 = ${r4}")
}