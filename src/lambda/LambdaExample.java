package lambda;

import java.util.Scanner;

public class LambdaExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        PrintResult pr = (a, b) -> a > b ? a : b;
        System.out.println(pr.printResult(num1, num2));
    }
}

// 함수형 인터페이스
@FunctionalInterface
interface PrintResult {
    int printResult(int a, int b);
}

/*
    람다식(Lambda Expression)은 함수를 하나의 식으로 나타낸 것
    식으로 나타내기에 따로 이름이 필요 없는 익명 함수(Anonymous Function)이며,
    변수처럼 사용할 수도 있음, 그러므로 당연히 매개 변수로 전달도 가능함
    람다식은 극한의 효율을 추구하기에 생략되는 표현이 많음
    람다를 사용하려면 함수형 인터페이스를 사용해야 함 (@FunctionalInterface)
    함수형 인터페이스는 멤버 메소드를 단 하나만 가지고 있으며 함수처럼 사용 가능한 인터페이스

    람다식의 기본 형태 : ( 매개 변수 ) -> { 함수 식; }
 */