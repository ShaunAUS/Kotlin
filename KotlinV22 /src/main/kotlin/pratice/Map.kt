package pratice


//map 도 list와 같이 불변형/가변형으로 나뉘어진다
fun main() {


    //map 도 list처럼 데이터를보고 타입추론 가능
    var map1 = mapOf<String,Int>("값1" to 1,"값2" to 2, "값3" to 3)

    //가변형 Map
    var map2 = mutableMapOf<String,Boolean>("a1" to true, "a2" to false)

    //Map - any타입(다양한 타입 가능)
    var map3 = mapOf<String,Any>("key1" to true, "key2" to "안녕하세요", "key3" to 10)


    //호출
    //리스트, 배열과 같음   -> get() or  []

    val get = map1.get("값1")
    val i = map1["값2"]

    // Map 의 다양한 메서드들
    map1.keys
    map1.size
    map1.values

    //해당 key값이 있나 확인
    map1.containsKey("값4")

    //해당 value 값이 있나 확인
    map1.containsValue(1)

//=============가변형 Map 메서드===============

    //없으면 추가, 있으면 덮어씌우기

    //가변형에 데이터 추가
    map2.put("a3",false )
    map2["a4"] = true


    //가변형 ->불변형
    //map2 가 바뀌는게 아니라 새로운 map이 생기는것임
    val toMap = map2.toMap()

    //불변형 -> 가변형
    val toMutableMap = toMap.toMutableMap()

}