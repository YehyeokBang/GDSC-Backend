package collections;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List
        List<Integer> myArrayList = new ArrayList<>(); // 배열 리스트
        List<Integer> myLinkedList = new LinkedList<>(); // 연결 리스트

        // Set
        Set<Integer> myHashSet = new HashSet<>(); // 순서가 없고, 중복 허용 x
        Set<Integer> myTreeSet = new TreeSet<>(); // 정렬, 검색에 높은 성능

        // Queue -
        Queue<Integer> myPriorityQueue = new PriorityQueue<>(); // 우선순위 큐
        Queue<Integer> myArrayDeque = new ArrayDeque<>(); // 덱

        // Map - Collection으로 분류되지만 Collection 인터페이스를 상속받지 않음
        Map<String, Integer> myHashMap = new HashMap<>();
    }
}

/*
    컬렉션은 객체의 그룹을 표현하는 객체
    Java는 JCF(Java Collections Framework)라고 불리는
    Collection들을 모아둔 프레임워크를 제공함

    여러 컬렉션들이 있으니 직접 찾아보며 공부하기
 */
