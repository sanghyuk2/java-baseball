package baseball.validator;

public class ValidateRestartNumber implements Validator {
    @Override
    public void validate(String input) {
        if (!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException("[ERROR] 1과 2 중 하나를 선택해주세요.");
        }
    }
}
