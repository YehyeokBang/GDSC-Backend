package EOF;

import java.util.Scanner;

// Scanner 클래스를 이용해 EOF 확인하는 방법
public class ScannerEOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        // 무한 반복하면서 입력한 값을 출력하다가 컨트롤 + D로
        // 파일의 끝을 알려주면 루프를 빠져나올 수 있음
        System.out.println("Scanner EOF");
    }
}
