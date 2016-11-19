package example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TennisTest {
    private Tennis tennis;

    @Before
    public void setUp() throws Exception {
        tennis = new Tennis();
    }

    @Test
    public void test() throws Exception {
        assertEquals("LOVE ALL", tennis.score(0, 0));
        assertEquals("FIFTEEN LOVE", tennis.score(1, 0));
        assertEquals("THIRTY LOVE", tennis.score(2, 0));
        assertEquals("FORTY LOVE", tennis.score(3, 0));
        assertEquals("A WIN", tennis.score(4, 0));

        assertEquals("FIFTEEN ALL", tennis.score(1, 1));
        assertEquals("THIRTY FIFTEEN", tennis.score(2, 1));
        assertEquals("FORTY FIFTEEN", tennis.score(3, 1));
        assertEquals("A WIN", tennis.score(4, 1));

        assertEquals("THIRTY ALL", tennis.score(2, 2));
        assertEquals("FORTY THIRTY", tennis.score(3, 2));
        assertEquals("A WIN", tennis.score(4, 2));

        assertEquals("DEUCE", tennis.score(3, 3));
        assertEquals("A ADVANTAGE", tennis.score(4, 3));
        assertEquals("A WIN", tennis.score(5, 3));

        assertEquals("DEUCE", tennis.score(4, 4));
        assertEquals("DEUCE", tennis.score(5, 5));

        assertEquals("A ADVANTAGE", tennis.score(5, 4));


        assertEquals("LOVE FIFTEEN", tennis.score(0, 1));
        assertEquals("LOVE THIRTY", tennis.score(0, 2));
        assertEquals("LOVE FORTY", tennis.score(0, 3));
        assertEquals("B WIN", tennis.score(0, 4));

        assertEquals("FIFTEEN THIRTY", tennis.score(1, 2));
        assertEquals("FIFTEEN FORTY", tennis.score(1, 3));
        assertEquals("B WIN", tennis.score(1, 4));

        assertEquals("THIRTY FORTY", tennis.score(2, 3));
        assertEquals("B WIN", tennis.score(2, 4));

        assertEquals("B ADVANTAGE", tennis.score(3, 4));
        assertEquals("B WIN", tennis.score(3, 5));

        assertEquals("B ADVANTAGE", tennis.score(4, 5));
    }
}