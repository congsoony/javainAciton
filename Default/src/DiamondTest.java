public class DiamondTest {
    public static void main(String[] args) {
        new C().hello();
        //세가지 규칙
        // 클래스가 항상이긴다. 클래스나 ㅎ슈퍼클래스에서 정의한 메서드가 디폴드 메서드보다 우선권을갖음
        // 위 규츼의 이외의 상황에서는 서브 인터페이스가 이김 상속 관계를 갖는 인터페이스에서
        // 같은 시그니처를 갖는 메서드를 정의할 때는 서브인터페이스가 이김 즉 B가 A를 상속받아 B가 A를이김
        // 여전히 디폴트 메서드의 우선순위가 결정됟지 않았다면 여러 인터페이스를 상속받는 클래스가
        //오버라이드 하고 호출해야함

    }
}

interface A{
    default void hello(){
        System.out.println("Hello from A");
    }
}
interface B extends A{
    default void hello(){
        System.out.println("Hello from B");
    }
}

class C implements B,A{
}