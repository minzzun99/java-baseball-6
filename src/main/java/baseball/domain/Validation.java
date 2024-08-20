package baseball.domain;

import java.util.HashSet;
import java.util.Set;

public class Validation {
    public static void validationInputNumber(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("세자리의 숫자를 입력해주세요.");
        }

        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i) - '0';

            // 숫자가 1~9 범위에 있는지 확인
            if (number < 1 || number > 9) {
                throw new IllegalArgumentException("1 ~ 9 사이의 숫자를 입력해주세요.");
            }

            numberSet.add(number);
        }

        // 중복 여부 확인
        if (numberSet.size() != 3) {
            throw new IllegalArgumentException("중복되지 않은 숫자를 입력해주세요.");
        }
    }
}
