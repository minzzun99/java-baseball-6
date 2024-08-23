package baseball.model;

import baseball.domain.Computer;
import baseball.domain.Player;
import java.util.List;

// NumberComparator에서 받아온 결과를 바탕으로 종합 결과를 저장
public class GameResult {
    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";
    private final int strikeCount;
    private final int ballCount;

    public GameResult(Player player, Computer computer) {
        List<Integer> playerNumbers = player.getInputNumbers();
        List<Integer> computerNumbers = computer.getRandomNumbers();

        int[] result = NumberComparator.compareNumbers(playerNumbers, computerNumbers);
        this.strikeCount = result[0];
        this.ballCount = result[1];
    }

    public String getResult() {
        StringBuilder sb = new StringBuilder();
        if (strikeCount == 0 && ballCount == 0) {
            sb.append(NOTHING);
        } else if (strikeCount == 3) {
            sb.append(strikeCount).append(STRIKE);
        } else {
            if (strikeCount == 0) {
                sb.append(ballCount).append(BALL);
            } else if (ballCount == 0) {
                sb.append(strikeCount).append(STRIKE);
            } else {
                sb.append(ballCount).append(BALL).append(' ').append(strikeCount).append(STRIKE);
            }
        }
        return sb.toString();
    }

    public boolean canFinished() {
        return strikeCount == 3;
    }
}
