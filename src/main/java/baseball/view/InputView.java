package baseball.view;

public class InputView {
    private static final String GAME_START_MSG = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_MSG = "숫자를 입력해주세요 : ";

    private static final String RESTART_OR_EXIT_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    // 입력을 처리
    public static void printStart() {
        System.out.println(GAME_START_MSG);
    }

    public static void printInputNumber() {
        System.out.println(INPUT_MSG);
    }

    public static void printRestartOrExit() {
        System.out.println(RESTART_OR_EXIT_MSG);
    }
}
