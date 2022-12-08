package baseball.view;

import baseball.domain.GameStatus;

public class OutputView {
    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(GameStatus gameStatus) {
        if (gameStatus.getBall() == 0 && gameStatus.getStrike() == 0) {
            System.out.println("낫싱");
            return;
        }

        if (gameStatus.getStrike() == 0) {
            System.out.println(gameStatus.getBall() + "볼");
        }

        if (gameStatus.getBall() == 0) {
            System.out.println(gameStatus.getStrike() + "스트라이크");
        }

        if (gameStatus.getBall() != 0 && gameStatus.getStrike() != 0) {
            System.out.println(gameStatus.getBall() + "볼 " + gameStatus.getStrike() + "스트라이크");
        }
    }
    
    public static void printEndGame() {
        System.out.println("게임 종료");
    }
}
