package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.RandomNumberGenerator;
import baseball.domain.Validation;
import baseball.model.GameResult;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    public void run() {
        InputView.printStartMsg();
        startGame();
    }

    public void startGame() {
        Computer computer = new Computer(new RandomNumberGenerator());
        while (true) {
            InputView.printInputNumberMsg();
            try {
                Player player = new Player(InputView.getInputNumber());
                GameResult gameResult = new GameResult(player, computer);
                OutputView.printResult(gameResult.getResult());
                if (gameResult.canFinished()) {
                    OutputView.printEndMsg();
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        InputView.printRestartOrExitMsg();
        try {
            String restartInput = InputView.getRestartOrExit();
            Validation.validationRestartInput(restartInput);
            if (restartInput.equals("1")) {
                startGame();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
