import java.util.regex.Pattern;

public abstract class Validator {
    private static final Pattern PATTERN = Pattern.compile("\\w{1,20}");
    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        System.out.println();
        if (!PATTERN.matcher(login).matches()){
            throw new WrongLoginException("Логин не пордходит под условие");
        }
        System.out.println("Верный логин");
        if (!PATTERN.matcher(password).matches()){
            throw new WrongPasswordException("Пароль не подходит под условие");
        }
        System.out.println("Верный пароль");
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Не удалось подтвердить пароль");
        }
        System.out.println("Пароль подтвердждён");
    }
}
