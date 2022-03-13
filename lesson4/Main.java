package lesson4;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1\n");
        Set<String> setWords = new LinkedHashSet<>();
        setWords.add("Солнце");
        setWords.add("Луна");
        setWords.add("Земля");
        setWords.add("Марс");
        setWords.add("Венера");
        setWords.add("Нептун");
        setWords.add("Плутон");
        setWords.add("Юпитер");
        setWords.add("Земля");
        setWords.add("Солнце");
        System.out.println(setWords);

        TelBook phoneTableClass = new TelBook();
        phoneTableClass.add("111","aaa");
        phoneTableClass.add("222","aaa");
        phoneTableClass.add("333","bbb");
        phoneTableClass.add("444","ccc");
        phoneTableClass.add("555","ddd");

        System.out.println(TelBook.get("aaa"));
        System.out.println(TelBook.get("eee"));
    }

}
