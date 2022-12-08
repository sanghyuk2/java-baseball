package baseball.validator;

public class ValidateNumber implements Validator{
    @Override
    public void validate(String input) {
        if (!input.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException("[ERROR] 숫자만 입력해 주세요.");
        }

        if (input.length() != 3) {
            throw new IllegalArgumentException("[ERROR] 3자리 숫자만 입력해 주세요.");
        }
    }
}
