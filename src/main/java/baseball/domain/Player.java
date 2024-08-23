package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // 사용자에게 입력 받은 세개의 숫자를 저장하는 객체
    private List<Integer> inputNumbers;

    public Player(String numberStr) {
        try {
            Validation.validationInputNumber(numberStr);
            this.inputNumbers = numberToList(numberStr);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    private static List<Integer> numberToList(String s) {
        List<Integer> numberList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            numberList.add(Character.getNumericValue(c));
        }
        return numberList;
    }

    public List<Integer> getInputNumbers() {
        return inputNumbers;
    }
}
