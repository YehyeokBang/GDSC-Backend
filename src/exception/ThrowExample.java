package exception;

import java.util.Scanner;

public class ThrowExample {
    public void checkChoice(int choice) throws NotFunnyException {
        // choice가 1이면 NotFunnyException를 던짐
        if(choice == 1) {
            throw new NotFunnyException();
        }
        // 아니라면 문자열을 출력
        else {
            System.out.println("저도 집에 가고 싶습니다.");
        }
    }

    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Java 스터디는 재미있습니까? (1 Yes / 2 No) : ");
        int choice = sc.nextInt();

        // try에서 throwExample의 메소드인 checkChoice를 실행하면
        // 에러(NotFunnyException)를 던지거나 집에 가고 싶다는 문자열을 출력한다.
        try {
            throwExample.checkChoice(choice);
        }
        // 예외가 발생했으니 catch 문 내의 문장이 실행됨
        // 결국 NotFunnyException 오류가 직접적으로 던져진 결과를 보여주진 않음
        catch (NotFunnyException e) {
            System.out.println("진심을 담아 선택해주세요.");
        }
    }
}

// RuntimeException을 상속받는 NotFunnyException 예외를 만듬
class NotFunnyException extends RuntimeException {
    NotFunnyException() {
        super("공부는 항상 재미없습니다.");
    }
}

/*
    throw : 직접 예외를 만들고 발생시킬 수 있음
    -> 프로그램이 내가 생각한 로직과 다르게 실행되는 것을 방지할 수 있음

    throws : 로직 실행 중 발생한 예외의 처리를 해당 로직 호출부에서 담당하도록 함
    -> 예외의 처리를 나중으로 미룸
 */