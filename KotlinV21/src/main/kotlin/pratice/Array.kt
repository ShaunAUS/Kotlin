package pratice

fun main() {


//============================== arrayOf 를 사용해 배열 만들기 ==================================================
    var v1 = arrayOf(10,20,30,40)
    var v2 = arrayOf(10,22.22,"다양한 타입 등록가능",true)

    println(v1)
    println(v1.contentToString())

    //타입 제한
    var v3 = arrayOf<String>("하하","히히","호호")
    var v4 = intArrayOf(10,11,12,13,14)

    println(v3.contentToString())
    println(v3.contentToString())

//=========================================Array 클래스를 사용해 배열 만들기 ========================================

     //Array(개수,{식})
    // 0이 5개인 배열
    var v5 =Array(5,{0})
    println(v5.contentToString())


    //0 2 4 6 8
    var v6 = Array(5,{it*2})
    println(v6.contentToString())

//=======for 문을 사용해 출력=============

//배열의 데이터 수만큼 돌아간다
 for(item in v1){
     println(item)
 }
//=========================================다차원 배열 만들기 ========================================


    //배열안에 배열들이 있는 형식
    var v7 = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))

    println(v7.contentDeepToString())

// ========= for문을 사용해 출력하기==============

 for(com1 in v7){
     for(com2 in com1){
         println(com2)
     }
 }

//======= 요소 접근 ========
    println(v1.get(0))
    println(v1.get(1))

    println(v1[0])
    println(v1[1])

//==== 요소 값 넣기========

    v1[0] = 100
    v1[1] = 200
    v1[3] = 300
//=================================== 다양한 배열 메서드   =================================

    //배열은 변경불가라 요소 추가시 plus메서드 사용
    //원본은 유지하면서 새로운 배열을 생성하는것임

    val plusArray = v1.plus(60)
    println(v1.contentToString())
    println(plusArray.contentToString())

    //sliceArray
    //인덱스 번호에 해당하는 요소들만 모아서 배열생성
    val sliceArray = v1.sliceArray(1..3)
    println(sliceArray.contentToString())

//=====================배열 정열 =======================

    var p1 = arrayOf(5,2,3,1)

    val sortedArray = p1.sortedArray() //오름차순
    val sortedArrayDescending = p1.sortedArrayDescending() //내림차순

    println(sortedArray.contentToString())
    println(sortedArrayDescending.contentDeepToString())



}