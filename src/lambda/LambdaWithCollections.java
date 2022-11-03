package lambda;

import java.util.*;

public class LambdaWithCollections {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C");

        /*
        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
         */

        /*
        Collections.sort(myList, (s1, s2) -> s1.compareTo(s2));
         */

        Collections.sort(myList, String::compareTo);

        for(String s : myList) {
            System.out.println(s);
        }
        System.out.println();
    }
}

/*
    이 프로그램은 컬렉션인 List에 담긴 문자열을 정렬하는 프로그램임
    복잡한 코드들을 람다를 사용해 간단한 코드를 만들고 다형성의 효율을 극대화
    (::) 메소드 참조 표현식
 */
