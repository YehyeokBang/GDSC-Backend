package optional;

import java.util.Optional;

public class OptionalMethodExample {
    public static void main(String[] args) {
        MyData bang = new MyData();
        bang.setMyAge(23);
        bang.setMyName("Bang");

        // Filter
        Optional<MyData> bangOpt = Optional.of(bang);
        System.out.println(bangOpt.filter(a -> a.getMyAge() == 23));

        // Map
        System.out.println(bangOpt.map(s -> s.getMyName().toUpperCase()));

        // Get
        System.out.println(bangOpt.map(s -> s.getMyName().toUpperCase()).get());

        // isPresent
        // Optional 객체가 값을 가지고 있다면 true, 없다면 false 반환
        System.out.println(bangOpt.isPresent());

        // ifPresent
        // Optional 객체가 값을 가지고 있으면 실행 값이 없으면 넘어감
        // ifPresent가 반환한 데이터를 출력하라는 뜻
        bangOpt.ifPresent(System.out::println);
    }
}

/*
    옵셔널은 메소드 체이닝을 활용함
    간결한 코드를 만들 수 있지만, 한 라인에 너무 많은 일이 일어날 수 있어서
    디버깅하기 어렵다는 단점이 있음
 */
