package homeworks.java.cosmo.string;

import java.util.Locale;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String[] result = input.split(" ");
        String word1 = result[2].replace("?","").replaceFirst("д","Д");
        String word2 = result[1];
        String word3 = result[0].toLowerCase();
        System.out.println(word1 + " " + word2 + " " + word3 + "?");
    }
}