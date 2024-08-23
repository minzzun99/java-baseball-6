package baseball.domain;

import java.util.List;

public class Computer {
    private static final int START_RANGE = 1;       // 랜덤 숫자 시작 범위
    private static final int END_RANGE = 9;         // 랜덤 숫자 끝 범위
    private static final int RANDOM_NUMBER_SIZE = 3;        // 랜덤 숫자의 개수
    private final List<Integer> randomNumbers;       //랜던 숫자 저장

    // 컴퓨터 객체 생성
    public Computer(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumbers = randomNumberGenerator.generateRandomNumbers(START_RANGE, END_RANGE, RANDOM_NUMBER_SIZE);
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    /*// 랜덤 숫자 생성 테스트
    public static void main(String[] args) {
        RandomNumberGenerator rmg = new RandomNumberGenerator();
        Computer computer = new Computer(rmg);
        computer.randomNumbers.stream().forEach(System.out::println);
    }*/
}
