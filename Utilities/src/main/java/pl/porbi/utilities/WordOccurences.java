package pl.porbi.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordOccurences {

    public static int countOccurencesInString(String str, String word, boolean caseSensitive) {
        String helper = str.replaceAll("\r\n", " ").replaceAll("[^A-Za-z0-9ąęśżźć ]", "");
        if (!caseSensitive) {
            helper = helper.toLowerCase();
            word = word.toLowerCase();
        }
        String[] words = helper.split(" ");

        int cnt = 0;
        for (String w : words) {
            if (word.equals(w)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int countOccurencesInFile(String filePath, String word, boolean caseSensitive) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return countOccurencesInString(content, word, caseSensitive);
    }
}
