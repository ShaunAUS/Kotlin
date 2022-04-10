package pratice

//set 도 불변형과 가변형으로 나뉘어진다
//순서보장 x , 중복 x
fun main() {


    //set 기본
    var set1 = setOf(1,5,10,1,5,10)
    println(set1)

    //가변형Set
    var set2 = mutableSetOf<Int>()

    //set은 관리주체가 없으므로 객체를 직접가지고 오는 메서드 제공 x
    //for문을 통해서 가져와야함

    for(item in set2){
        println(item)
    }

    //set메서드 => List와 같이 add,addAll 사용 하지만 중복된값은 무시함 / remove(값)   -해당 값 set에서 삭제


    //가변형 -> 불변형
    val toSet = set2.toSet()

    //불변형 -> 가변형
    val toMutableSet = toSet.toMutableSet()



    val listOf = listOf(1, 2, 3, 4, 5)

    //List -> Set
    //list 순서되잇다해도 set으로 변하는 순간 순서보장 안됌
    val toMutableSet1 = listOf.toMutableSet()
    val toSet1 = listOf.toSet()

    //Set -> List
    val toList = toMutableSet1.toList()
    val toMutableList = toSet1.toMutableList()


}