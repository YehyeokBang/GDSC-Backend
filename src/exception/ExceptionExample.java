package exception;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;

        try {
            result = a / b;
            System.out.println(result);
        }
        // 정수를 0으로 나누면 예외가 발생함
        catch (Exception e) {
            System.out.println("0으로는 나눌 수 없습니다.");
        }
        // 예외 처리와 상관 없이 항상 실행
        finally {
            System.out.println("정말 재미있는 Java 스터디!");
        }
    }
}
/*
    try : 검사하고 싶은 로직

    catch : 발생한 예외에 대한 처리

    finally : 항상 실행할 코드, 예외 처리와 상관 없음
 */
