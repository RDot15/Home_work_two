
import java.util.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import java.util.Scanner;
public class HomeWork {

    public static void main(String[] args) {
        String string = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "            \"Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";
        printer(getCountWords(string));
    }


// метод реализующий вывод в консоль
    private static void printer(Map<String, Integer> map) {
        System.out.println("Количество вхождений слов в тексте:");
        for (String key: map.keySet()) {
            System.out.printf("%s - %d\n", key, map.get(key));
        }
    }

    private static Map<String, Integer> getCountWords(String str) {
        Map<String, Integer> map = new HashMap<>();
        str = str.toLowerCase().replaceAll("[.—:;,!?]", "");
        String[] words = str.split("\\s+");

        for (String item: words) {
            map.putIfAbsent(item, 0);
            map.put(item, map.get(item)+1);
        }
        return map;



    }
}













