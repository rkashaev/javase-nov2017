package lesson171222;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) throws Exception {
        ResourceProperty rp;

        rp = new ResourceProperty(new Locale("ru", "BY"));
        System.out.println(rp.get("hello"));

        rp = new ResourceProperty(new Locale("en", "US"));
        System.out.println(rp.get("hello"));

        rp = new ResourceProperty(new Locale("en", "UK"));
        System.out.println(rp.get("hello"));

        rp = new ResourceProperty(new Locale("ru", "RU"));
        System.out.println(rp.get("hello"));


        URL res = ResourceBundleExample.class.getResource("context.xml");

        Path path = Paths.get(res.toURI());
        Files.lines(path).forEach(System.out::println);

    }
}


class ResourceProperty {
    private ResourceBundle bundle;

    public ResourceProperty(Locale locale) {
        bundle = ResourceBundle.getBundle("lesson171222.values", locale);
    }

    public String get(String key) {
        return bundle.getString(key);
    }
}