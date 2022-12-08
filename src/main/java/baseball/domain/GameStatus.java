package baseball.domain;

public class GameStatus {
    private final int strike;
    private final int ball;

    public GameStatus(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
