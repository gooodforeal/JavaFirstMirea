package ru.mirea.task24;
import java.util.regex.Pattern;


public class IPHandler {
    private final String REGEX = "(([0-1]?[0-9]{1,2}\\.)|(2[0-4][0-9]\\.)|(25[0-5]\\.)){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
    private Pattern PATTERN = Pattern.compile(REGEX);
    public boolean isValid(String s) {
        return PATTERN.matcher(s).matches();
    }
}