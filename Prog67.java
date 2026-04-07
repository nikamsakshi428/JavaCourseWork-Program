import java.util.regex.*;

public class Prog67 {
    public static void main(String[] args) {
        String text = "sahil123";
        String pattern = "sahil\\d+"; // sahil followed by digits

        boolean match = Pattern.matches(pattern, text);
        System.out.println("Match found: " + match);
    }
}