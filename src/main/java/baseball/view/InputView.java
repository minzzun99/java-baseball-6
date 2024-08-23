package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String GAME_START_MSG = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_MSG = "숫자를 입력해주세요 : ";

    private static final String RESTART_OR_EXIT_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    // 게임 시작 메시지를 출력하는 메서드
    public static void printStartMsg() {
        System.out.println(GAME_START_MSG);
    }

    // 숫자를 입력 받는 메시지 출력하는 메서드
    public static void printInputNumberMsg() {
        System.out.println(INPUT_MSG);
    }

    // 게임 종료 여부를 묻는 메시지를 출력하는 메서드
    public static void printRestartOrExitMsg() {
        System.out.println(RESTART_OR_EXIT_MSG);
    }

    // 사용자에게 숫자를 입력받는 메서드
    public static String getInputNumber() {
        return Console.readLine();
    }

    // 재시작 여부를 입력받는 메서드
    public static String getRestartOrExit() {
        return Console.readLine();
    }
}
