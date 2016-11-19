package example;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by shuayang on 16/11/19.
 */
public class PrimeFactorTest {
    @Test
    public void test() throws Exception {
        assertEquals(Collections.singletonList(2), PrimeFactor.breakdown(2));
        assertEquals(Collections.singletonList(3), PrimeFactor.breakdown(3));
        assertEquals(Arrays.asList(2, 2), PrimeFactor.breakdown(4));
        assertEquals(Collections.singletonList(5), PrimeFactor.breakdown(5));
        assertEquals(Arrays.asList(2, 3), PrimeFactor.breakdown(6));
        assertEquals(Collections.singletonList(7), PrimeFactor.breakdown(7));
        assertEquals(Arrays.asList(2, 2, 2), PrimeFactor.breakdown(8));
        assertEquals(Arrays.asList(3, 3), PrimeFactor.breakdown(9));
        assertEquals(Arrays.asList(2, 5), PrimeFactor.breakdown(10));
        assertEquals(Collections.singletonList(11), PrimeFactor.breakdown(11));
        assertEquals(Arrays.asList(2, 2, 3), PrimeFactor.breakdown(12));
        assertEquals(Collections.singletonList(13), PrimeFactor.breakdown(13));
        assertEquals(Arrays.asList(2, 7), PrimeFactor.breakdown(14));
        assertEquals(Arrays.asList(3, 5), PrimeFactor.breakdown(15));
        assertEquals(Arrays.asList(2, 2, 2, 2), PrimeFactor.breakdown(16));
        assertEquals(Collections.singletonList(17), PrimeFactor.breakdown(17));
        assertEquals(Arrays.asList(2, 3, 3), PrimeFactor.breakdown(18));
        assertEquals(Collections.singletonList(19), PrimeFactor.breakdown(19));
        assertEquals(Arrays.asList(2, 2, 5), PrimeFactor.breakdown(20));
        assertEquals(Arrays.asList(3, 7), PrimeFactor.breakdown(21));
        assertEquals(Arrays.asList(2, 11), PrimeFactor.breakdown(22));
        assertEquals(Collections.singletonList(23), PrimeFactor.breakdown(23));
        assertEquals(Arrays.asList(2, 2, 2, 3), PrimeFactor.breakdown(24));
        assertEquals(Arrays.asList(5, 5), PrimeFactor.breakdown(25));
        assertEquals(Arrays.asList(2, 13), PrimeFactor.breakdown(26));
    }
}