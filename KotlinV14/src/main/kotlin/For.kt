

// for(변수 in 배열){}
// 배열 개수만큼 반복하며 배열 첫번째 원소부터 차례대로 대입되서 코드실행
fun main() {


    var a1 = 1..10

    for (item in a1){

        println("결과는 $item 입니다")
    }


    println("=====================")


    var a2 = 1..10 step 2   // 2씩 증가

    for(item in a2){

        println("결과는 $item 입니다")
    }


    println("=====================")
    //역순
    //var a3 = 10 ..1      //왼쪽항은 무조건 증가, 오른쪽항에 도착을 했나 확인한다// 이건 불가능

    var a3 = 10 downTo 1  // 역순

    for(item in a3){
        println("역순 $item 입니다")
    }
}