var b1 = ""
var b2 = 10


fun main() {

    //자바
    if (b2 ==10){
        b1 = "10입니다"
    }else {
       b1 ="10이 아닙니다"
    }

    //코틀린
    var b1 = if(b2 == 10 ) "10입니다" else "10이 아닙니다"  //방법 1

    b1 = if(b2 ==10){                                   //방법 2
        "10입니다"
    } else {
        "10이 아닙니다"
    }


}
