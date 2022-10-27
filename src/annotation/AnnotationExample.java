package annotation;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException {
        Method m1 = AnnotationExample.class.getDeclaredMethod("printAgeDefault");
        CustomAnnotation customAnnotation1 = m1.getDeclaredAnnotation(CustomAnnotation.class);
        System.out.println(customAnnotation1.myAge());

        Method m2 = AnnotationExample.class.getDeclaredMethod("printAgeCustom");
        CustomAnnotation customAnnotation2 = m2.getDeclaredAnnotation(CustomAnnotation.class);
        System.out.println(customAnnotation2.myAge());
    }

    @CustomAnnotation
    public static void printAgeDefault() {

    }

    // 메소드에서 값을 변경할 수 있음
    @CustomAnnotation(myAge = 28)
    public static void printAgeCustom() {

    }
}


/*
    어노테이션은 주석이라는 뜻을 가진 단어
    주석과 같이 데이터를 위한 데이터(메타 데이터)를 알려줌
    -> 그 코드에 대한 정보를 줌

    직접 만든 어노테이션을 무분별하게 사용하면
    다른 사람이 코드를 이해할 때 많은 불편함을 줄 수 있음
    -> 모든 어노테이션을 알고 있어야 하기 때문
 */