package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral;

public class MirrorTest {

    private Mirror mirror;

    @BeforeEach
    public void initialize() {
        mirror = new Mirror();
    }

    @Test public void empty() {
        String mirrorEnd = mirror.mirrorEnds("");
        Assertions.assertEquals("", mirrorEnd);
    }

    @Test public void singleCharacterWith() {
        String mirrorEnd = mirror.mirrorEnds("a");
        Assertions.assertEquals("a", mirrorEnd);
    }

    @Test public void twoCharacterWith() {
        String mirrorEnd = mirror.mirrorEnds("aa");
        Assertions.assertEquals("aa", mirrorEnd);
    }

    @Test public void twoCharacterNone() {
        String mirrorEnd = mirror.mirrorEnds("ab");
        Assertions.assertEquals("", mirrorEnd);
    }

    @Test public void threeCharacterWith() {
        String mirrorEnd = mirror.mirrorEnds("aba");
        Assertions.assertEquals("aba", mirrorEnd);
    }

    @Test public void threeCharacterNone() {
        String mirrorEnd = mirror.mirrorEnds("abc");
        Assertions.assertEquals("", mirrorEnd);
    }

    @Test public void fourCharacterWith() {
        String mirrorEnd = mirror.mirrorEnds("abba");
        Assertions.assertEquals("abba", mirrorEnd);
    }

    @Test public void fourCharacterWith2() {
        String mirrorEnd = mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", mirrorEnd);
    }

    @Test public void fourCharacterNone() {
        String mirrorEnd = mirror.mirrorEnds("abcd");
        Assertions.assertEquals("", mirrorEnd);
    }

    @Test public void fiveCharacterWith() {
        String mirrorEnd = mirror.mirrorEnds("abcba");
        Assertions.assertEquals("abcba", mirrorEnd);
    }

    @Test public void fiveCharacterWith2() {
        String mirrorEnd = mirror.mirrorEnds("abcda");
        Assertions.assertEquals("a", mirrorEnd);
    }

    @Test public void fiveCharacterNone() {
        String mirrorEnd = mirror.mirrorEnds("xbcba");
        Assertions.assertEquals("", mirrorEnd);
    }
}
