package Game;

import java.util.Scanner;

public class inputTime extends Thread {
    private Scanner sc = new Scanner(System.in);
    private String answer;
    private boolean isAnswered = false;
    private boolean isTimeout = false;

    @Override
    public void run() {
        try {
            Thread.sleep(5000); // 5초 대기 후
            if (!isAnswered) {
                isTimeout = true; // 시간이 초과되면 true
                System.out.println("시간이 초과되었습니다. 답을 입력할 수 없습니다.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 사용자로부터 답을 입력받는 메서드
    public void getAnswer() {
        System.out.print("정답을 입력하세요: ");
        answer = sc.nextLine();
        isAnswered = true; // 사용자가 답을 입력한 상태로 설정
    }

    // 사용자가 입력한 답을 반환하는 메서드
    public String getAnswerValue() {
        return answer;
    }

    // 사용자가 답을 입력했는지 여부 확인
    public boolean isAnswered() {
        return isAnswered;
    }

    // 시간이 초과되었는지 확인
    public boolean isTimeout() {
        return isTimeout;
    }
}
