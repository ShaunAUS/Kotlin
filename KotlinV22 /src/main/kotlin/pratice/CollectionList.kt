package pratice


// 리스트 = 배열하고 매우 흡사  다만 불변형/가변형으로 나뉘어진다는점
fun main() {


    //불변형 리스트
    //타입 추론 가능
    var list1 = listOf(10,20,30)
    var list2 = listOf<Int>(10,20,30)
    var list3 = listOf("안녕","하이")


    //가변형 리스트
    //가변형이든,불변형이든 안에 값이 없으면 타입추론 불가
    //나중에 추가가 가능하기떄문에 제네릭만 설정해서 많이 쓴다
    var mlist1 = mutableListOf<Int>()
    var mlist2 = mutableListOf("문자열1","문자열2")


    //비어있는 리스트 = 불변형
    val emptyList = emptyList<Int>()
    println(emptyList)


    //널만 뺴고 나머지로 리스트만들기
    val listOfNotNull = listOfNotNull(10, 20, null, 30, null, 1)
    println(listOfNotNull)

    //값 가져오기
    list1.get(0)
    list1.get(1)

    list1[0]
    list1[1]

    //list 메서드

    var v7 = listOf(10,20,30,10,20,30)


    //20이 몇번째에 위치해있는지
    val index = v7.indexOf(20)

    //20을 뒤에서 부터 찾아서 그 index값 반환
    val lastIndexOf = v7.lastIndexOf(20)

    //index  1~2 값으로 새로운 list 만들기
    val subList = v7.subList(1, 3)


//====================가변형 리스트 메서드====================================

    //불변형 -> 가변형
    val toMutableList = list1.toMutableList()

    toMutableList.add(100)
    toMutableList.addAll(listOf(20,30,40))


    //가변형 ->불변형
    val toList = toMutableList.toList()


}
