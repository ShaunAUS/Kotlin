package pratice


fun main() {
    printDirection(enumClass.EAST)
    printDirection(enumClass.WEST)

    var dir:enumClass = enumClass.NORTH
    println(dir)



}


enum class  enumClass{

    NORTH,WEST,EAST,SOUTH
}

fun printDirection(aa:enumClass){

     when(aa){

         enumClass.EAST -> println("east")
         enumClass.WEST -> println("west")
         enumClass.SOUTH -> println("south")
         enumClass.NORTH -> println("north")
     }
}



//enum값에 값넣기
enum class numberEnumClass(var number:Int,var words:String){

    NUM(1,"일"),NUM2(2,"이"),NUM3(3,"삼")

}

fun printNum(bb:numberEnumClass){

    when(bb){

        numberEnumClass.NUM -> println("숫자 1")
        numberEnumClass.NUM2 -> println("숫자 2")
        numberEnumClass.NUM3 -> println("숫자 3")

    }

    println(bb.number)
    println(bb.words)

    when(bb.number){

        1-> println("일입니다")
        2-> println("2입니디")

    }
}














