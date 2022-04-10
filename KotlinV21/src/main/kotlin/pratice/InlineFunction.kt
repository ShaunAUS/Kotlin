package pratice

fun main() {


    InlineFunction2()
    InlineFunction2()

    //인라인 함수
    //해당 메서드를 아예 복사를해서 하나의 메서드로 만듬
    InlineFunction2()
    InlineFunction2()

}

fun InlineFunction2(){
    println("=======")
    println("function2")
    println("=======")

}

inline fun InlineFunctio1(){

    println("=======")
    println("function1")
    println("=======")


}