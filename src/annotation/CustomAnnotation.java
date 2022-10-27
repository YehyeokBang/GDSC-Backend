package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    int myAge() default 24;
}

/*
    직접 만든 CustomAnnotation의
    적용 대상 : 메소드, 적용 범위 : 실행 시간 중
    -> 해당 어노테이션을 가지는 메소드는 값의 변경이 가능함

    @Target 어노테이션의 파라미터 ElementType의 종류
    - PACKAGE, TYPE, METHOD, FIELD, PARAMETER 등

    @Retention 어노테이션의 파라미터 RetentionPolicy의 종류
    - RetentionPolicy.SOURCE : 컴파일 전까지만 유효
    - RetentionPolicy.CLASS : 컴파일러가 클래스를 참조할 때까지 유효
    - RetentionPolicy.RUNTIME : 컴파일 이후에도 JVM에 의해 계속 참조 가능
 */