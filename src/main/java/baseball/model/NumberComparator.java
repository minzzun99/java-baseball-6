package baseball.model;

import java.util.List;

public class NumberComparator {
    // computer의 숫자와 player의 숫자를 비교해서 GameResult로 전달
    public static int[] compareNumbers(List<Integer> playerNumbers, List<Integer> computerNumbers) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < playerNumbers.size(); i++) {
            if (playerNumbers.get(i).equals(computerNumbers.get(i))) {
                strike++;
            } else if (computerNumbers.contains(playerNumbers.get(i))) {
                ball++;
            }
        }

        return new int[]{strike, ball};
    }
}
