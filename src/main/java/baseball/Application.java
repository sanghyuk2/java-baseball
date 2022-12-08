package baseball;

import baseball.domain.BaseballGame;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        do {
            BaseballGame baseballGame = new BaseballGame();
            baseballGame.start();
        } while (BaseballGame.wantRestart());
        OutputView.printEndGame();
    }
}
