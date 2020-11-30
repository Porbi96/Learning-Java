package pl.porbi.utilities;

import org.junit.Test;

import java.nio.file.Paths;

import static org.junit.Assert.*;

public class WordOccurencesTest {

    @Test
    public void countOccurencesInString() {
        String testString = "Ala ma kota, a kot ma Alę.";
        int occurences1 = WordOccurences.countOccurencesInString(testString, "ala", false);
        int occurences2 = WordOccurences.countOccurencesInString(testString, "Alę", true);
        int occurences3 = WordOccurences.countOccurencesInString(testString, "samba", false);
        assertEquals(1, occurences1);
        assertEquals(1, occurences2);
        assertEquals(0, occurences3);
    }

    @Test
    public void countOccurencesInFile() {
        String filepath = Paths.get("src/test/resources/testWordOccurrences.txt").toString();
        int occurences1 = WordOccurences.countOccurencesInFile(filepath, "Lorem", false);
        int occurences2 = WordOccurences.countOccurencesInFile(filepath, "Lorem", true);
        int occurences3 = WordOccurences.countOccurencesInFile(filepath, "samba", false);
        assertEquals(2, occurences1);
        assertEquals(1, occurences2);
        assertEquals(0, occurences3);
    }
}