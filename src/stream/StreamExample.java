package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("lee", "han", "cho");
        List<String> concatTarget = Arrays.asList("GDSC CORE");
        List<List<String>> complexList = Arrays.asList(
                Arrays.asList("core", "lee"),
                Arrays.asList("core", "han"),
                Arrays.asList("core", "cho")
        );
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

        // 스트림 생성하기
        Stream<String> listStream = list.stream();
        IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
        LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
        Stream<String> unitedStream = Stream.concat(concatTarget.stream(), listStream);

        // 스트림 가공하기
        // Filtering
        System.out.println(list.stream().filter(name -> name.contains("h")).collect(Collectors.toList()));
        // Mapping
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
        // FlatMapping
        System.out.println(complexList.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList()));
        // Sorting
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        // Iterating
        list.stream().peek(System.out::print).collect(Collectors.joining());
        System.out.println();

        // 스트림 결과 만들기
        // Calculating
        long count = intStream.count();
        System.out.println(count);
        long sum = longStream.sum();
        System.out.println(sum);
        // Reduction
        System.out.println(numList.stream().reduce(0, Integer::sum));
        // Collecting
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        // Matching
        System.out.println(list.stream().allMatch(s -> s.length() == 3));
        // Iterating
        list.stream().forEach(System.out::println);
    }
}

/*
    스트림은 연속적인 데이터에 대한 처리를 편리하게 하는 기술
    메소드 체이닝을 통해 배열이나 컬렉션의 데이터를 스트림으로 만들고
    스트림으로 들어온 데이터들을 가공해서
    원하는 형태로 결과물을 만듬
    가장 많이 사용하는 가공 방법은 필터링과 매핑임
 */