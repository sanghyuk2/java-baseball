package baseball.domain;

import java.util.List;

public class Referee {
    private int count = 0;
    private int strike = 0;
    private int ball = 0;

    public GameStatus getGameStatus() {
        return new GameStatus(strike, ball);
    }

    public void makeJudgement(List<Integer> computerNumber, List<Integer> userNumber) {
        reset();
        countAll(computerNumber, userNumber);
        countStrike(computerNumber, userNumber);
        countBall();
    }

    private void countAll(List<Integer> computerNumber, List<Integer> userNumber) {
        for (Integer number : userNumber) {
            if (computerNumber.contains(number)) {
                count++;
            }
        }
    }

    private void countStrike(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int i = 0; i < userNumber.size(); i++) {
            if (userNumber.get(i).equals(computerNumber.get(i))) {
                strike++;
            }
        }
    }

    private void countBall() {
        ball = count - strike;
    }

    public boolean isThreeStrike() {
        return strike == 3;
    }


    public void reset() {
        count = 0;
        strike = 0;
        ball = 0;
    }
}
