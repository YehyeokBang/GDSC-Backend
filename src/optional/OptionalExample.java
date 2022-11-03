package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String neverNullStr = "Null이면 안됩니다!";
        String nullableStr = null;

        // null이 아닌 값이 넘어오면 해당 값을 가진 Optional 인스턴스 반환
        Optional<String> optNotNull = Optional.of(neverNullStr);

        // null이 넘어오면 빈 Optional 반환 (null이 아닌 값이 넘어오면 of와 같은 동작)
        Optional<String> optNullable = Optional.ofNullable(nullableStr);

        System.out.println(optNotNull);
        System.out.println(optNullable);
    }
}

/*
    Optional은 NullPointerException을 더 효과적으로 처리할 수 있는 클래스
    옵셔널 객체는 기본적으로 Wrapper 클래스임 => Integer나 Double처럼 내부의
    값을 감싸 클래스의 내부 메소드를 사용할 수 있도록 해줌
 */