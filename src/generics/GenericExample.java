package generics;

public class GenericExample {
    public static void main(String[] args) {
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>();
        MyGenericClass<String> exampleString = new MyGenericClass<>();

        exampleInteger.setValue(1);
        exampleString.setValue("Hello, generics!");
        System.out.println(exampleInteger.getValue());
        System.out.println(exampleString.getValue());
    }
}

/*
    제네릭을 사용한 클래스를 인스턴스화 하려면 <>안에 Wrapper 클래스를 작성하면 됨
 */
