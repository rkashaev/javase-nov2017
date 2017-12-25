package lesson171222;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpExamples {
    public static void main(String[] args) {
        String[] strings = "Мама    мыла\nраму".split("\\s+");
        System.out.println(Arrays.toString(strings));

        Pattern p = Pattern.compile("J(\\w*)", Pattern.CASE_INSENSITIVE);
        String text = "Java is fun; JavaScript is funny.; JFunny ; just do it";
        Matcher m = p.matcher(text);

        System.out.println(text);

        while (m.find()) {
            System.out.printf("Found '%s' at position %d-%d ", m.group(0), m.start(0), m.end(0));

            if (m.start(0) < m.end(0)) {
                System.out.println("Suffix is " + m.group(1));
            }


        }
    }
}
