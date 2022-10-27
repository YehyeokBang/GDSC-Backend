package thread;

import java.util.ArrayList;

public class RunnableExample implements Runnable {
    private int order;

    public RunnableExample(int order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println(this.order + "번쨰 스레드 시작합니다.");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
        }
        System.out.println(this.order + "번째 스레드 종료합니다.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new RunnableExample(i));
            thread.start();
            threadList.add(thread);
        }

        for(int i = 0; i < threadList.size(); i++) {
            Thread thread = threadList.get(i);
            try {
                thread.join();
            }
            catch (Exception e) {
            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}

/*
    Thread 클래스를 상속받는다면 자바이지만 역설적이게도
    상속을 통한 여러 이점을 누릴 수 없게 되버림
    그래서 이를 보완하기 위해 Runnable 인터페이스를
    사용해서 스레드를 구현함

    사용법은 thread 객체를 생성하는 문법 외에는 모두 같음
 */
