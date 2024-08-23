package baseball.view;

public class OutputView {
    private static final String END_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void printEndMsg() {
        System.out.println(END_MSG);
    }
}
