package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberGenerator {
    public List<Integer> generateRandomNumbers(int start, int end, int size) {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < size) {
            int number = Randoms.pickNumberInRange(start, end);
            numberSet.add(number);
        }
        return numberSet.stream().toList();
    }
}
