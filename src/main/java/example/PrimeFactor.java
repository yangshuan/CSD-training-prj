package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrimeFactor {
    public static List<Integer> breakdown(final int number) {
        int _number = number;
        List<Integer> result = new ArrayList<>();

        for (int factor = 2; factor <= _number / 2; factor++) {
            while (_number > factor && _number % factor == 0) {
                result.add(factor);
                _number /= factor;
            }
        }
        result.add(_number);

        return result;
    }
}
