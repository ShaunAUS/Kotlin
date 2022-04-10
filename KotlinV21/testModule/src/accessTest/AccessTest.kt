package accessTest

//클래스 접근제한자
private class privateClass1
public class publicClass1
protected class protectedClass1  // 자바와 다르게 코틀린에서는 클래스 앞에 protected불가
internal class internalClass1  // 같은 모듈에서만 호출 가능



class filedAccessTest {

    //변수, 메서드 접근제한자
    private var private1 = 100;
    public var public1 = 200
    protected var pro = 300    // 상속관계일 경우에만 접근 가능  //모듈이 달라도 상속관계이면 사용 가능
    internal var internal = 400

}