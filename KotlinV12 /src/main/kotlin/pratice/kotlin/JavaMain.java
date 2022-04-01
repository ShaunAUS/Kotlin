package pratice.kotlin;

public class JavaMain {

    int a = 300;

    static int a2 = 400;

    public void javaMethod(){
        System.out.println("자바 메서드 입니다");
    }

    public static void javaMethod2(){
        System.out.println("자바 static 메서드 입니다");
    }



    public static void main(String[] args) {

        //코틀린(companion X) ->자바에서 호촐
        comClass c1 = new comClass();
        System.out.println(c1.getA1());   // 코틀린은 모든 변수를 property로 생성해주기 떄문에 getter을 호출해줘야함
        c1.comMethod();

        //코틀린(companion O) ->자바에서 호촐
        //자바에서 코틀린 companion 호출시 Companion 없애고 싶으면 코틀린에 @JvmStatic 추가
        System.out.println(comClass.Companion.getA2());
        comClass.Companion.comMethod2();

    }
}
