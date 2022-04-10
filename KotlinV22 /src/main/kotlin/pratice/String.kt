package pratice

fun main() {


    //문자열 출력은 가능
    // 세팅은 불가
    var v1 = "안녕하세요"

    val c = v1[0]
    val c1 = v1[1]

    //v1[0] = 'a'

//==========================문자열 메서드 ==================================

    // 1~3 번쨰 문자 출력

    val substring = v1.substring(1..3)
    println(substring)


    val s = "Hello"
    val x = "hello"

    val compareTo = s.compareTo(x)// 대소문자 구분 o
    val compareTo1 = s.compareTo(x, true) //대소문자 구분 x
    val contentEquals = s.contentEquals(x) // = compareTo  = 대소문자 구분 o


//==========================문자열 변형 ==================================

    //String 원본이 유지되지만 메모리를 많이 먹는다
    var o1 = "hello world"
    val s1 = o1 + "hihi"
    println(s1)
    println(o1)

    //stirngBuffer 은 메모리를 적게먹지만 원본유지 x
    // 자바와 다르게 다양한 형태 사용가능 -> 마지막은 문자열로나옴
    val stringBuffer = StringBuffer()
    stringBuffer.append(1)
    stringBuffer.append("안녕하세요")
    stringBuffer.append(true)
    println(stringBuffer)

    // stringBuffer 중간에 삽입
    // 삭제는 delete()
    val insert = stringBuffer.insert(3, "중간에 삽입")
    println(insert)

}

