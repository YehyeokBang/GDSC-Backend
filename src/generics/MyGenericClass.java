package generics;

public class MyGenericClass<T> {
    private T value;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}

/*
    제네릭은 클래스 내부에서 사용할 자료형을 외부에서 사용자가 선언 시에
    직접 지정할 수 있도록 한 개념, 일종의 다형성

    제네릭에 사용할 수 있는 타입 파라미터의 종류
    - E : Element (Java 컬렉션 프레임워크에서 광범위하게 사용됨)
    - K : Key
    - N : Number
    - T : Type
    - V : Value
    - ? : Wildcard (Unknown Type, 메소드와 변수에서만)

    제네릭 타입 파라미터의 여러 활용법은 크게 Unbounded와 Bounded로 나뉨
    Bounded
    - Upper Bound : 지정한 클래스와 그 자식들만 가능하게 함
                    (모든 파라미터 타입 가능)
    - Lower Bound : 지정한 클래스와 그 부모들만 가능하게 함
                    (Wildcard를 사용해서 구현)

    예를 들어 MyGenericClass의 타입 파라미터에 <T extends Number>로 작성하고
    이 제네릭 클래스를 인스턴스화 할 때 타입 매개변수를 String으로 작성하면 오류 발생함
 */