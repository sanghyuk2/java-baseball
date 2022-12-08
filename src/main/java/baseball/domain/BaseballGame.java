package baseball.domain;

import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private final NumberGenerator numberGenerator;
    private final Referee referee;

    public BaseballGame() {
        this.numberGenerator = new NumberGenerator();
        this.referee = new Referee();
    }

    public void start() {
        OutputView.printStartMessage();
        do {
            referee.makeJudgement(numberGenerator.makeComputerNumber(), InputView.readUserNumber());
            OutputView.printResult(referee.getGameStatus());
        } while (!isThreeStrike());
    }

    private boolean isThreeStrike() {
        return referee.isThreeStrike();
    }

    public static boolean wantRestart() {
        return InputView.readRestart().equals("1");
    }
}
