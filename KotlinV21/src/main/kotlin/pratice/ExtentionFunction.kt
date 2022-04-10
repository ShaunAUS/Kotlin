package pratice


// String 클래스에 메서드를 추가한것 처럼 보이지만 자바코드를 보면 그냥 일반메서드 upperMethod가 만들어지며 문자열값(str1)이 매개변수로 넘겨진것뿐
fun main() {

    var str1 = "abcd"
    println(str1.upperMethod())

}

//함수이름 옆은...어떤타입(누가) 사용할지 표시?
fun String.upperMethod(): String {

    return this.toUpperCase()
}