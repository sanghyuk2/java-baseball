package baseball.view;

import baseball.validator.ValidateNumber;
import baseball.validator.ValidateRestartNumber;
import baseball.validator.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public static List<Integer> readUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String userNumber = getValidNumber(new ValidateNumber());
        return Arrays.stream(userNumber.split("")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static String readRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return getValidNumber(new ValidateRestartNumber());
    }

    private static String getValidNumber(Validator validator) {
        String input = readLine();
        validator.validate(input);
        return input;
    }


}
