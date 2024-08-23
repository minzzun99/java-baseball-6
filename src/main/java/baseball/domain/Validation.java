package baseball.domain;

import java.util.HashSet;
import java.util.Set;

public class Validation {
    public static void validationInputNumber(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }

        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i) - '0';

            // 숫자가 1~9 범위에 있는지 확인
            if (number < 1 || number > 9) {
                throw new IllegalArgumentException();
            }

            numberSet.add(number);
        }

        // 중복 여부 확인
        if (numberSet.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public static void validationRestartInput(String input) {
        if (!(input.equals("1") || input.equals("2"))) {
            throw new IllegalArgumentException();
        }
    }
}
