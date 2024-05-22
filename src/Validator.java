import java.util.regex.Pattern;

public abstract class Validator {
    private static final Pattern PATTERN = Pattern.compile("\\w{1,20}");
    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!PATTERN.matcher(login).matches()){
            throw new WrongLoginException("Логин не пордходит под условие");
        }
        if (!PATTERN.matcher(password).matches()){
            throw new WrongPasswordException("Пароль не подходит под условие");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароль не подходит под условие");
        }
    }
}
