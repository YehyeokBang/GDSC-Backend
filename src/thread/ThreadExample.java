package thread;

import java.util.ArrayList;

// Thread 클래스를 상속받음
public class ThreadExample extends Thread{
    private int order;

    public ThreadExample(int order) {
        this.order = order;
    }

    // 스레드의 작업
    public void run() {
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
        }
        System.out.println(this.order + "번째 스레드 종료합니다.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        // thread 10개를 만들고 ArrayList인 threadList에 넣어둠
        for(int i = 1; i <= 10; i++) {
            Thread thread = new ThreadExample(i);
            thread.start();
            threadList.add(thread);
        }

        // main이 먼저 종료되는 문제를 해결하기 위해
        // threadList에서 하나씩 가져와 종료될 때까지 기다림
        // 모든 thread가 종료될 때까지 기다린 후 main 메소드를 종료시킴
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
