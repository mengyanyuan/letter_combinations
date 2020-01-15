package com.minicode.letter.combination;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author : 周世雄 <br>
 * @date : 2020/1/13 21:17 <br>
 * @E-mail : mengyanyuan@outlook.com
 * @description :
 */
public class Solution4 {

    public static final Map<Integer, String[]> DICT;

    static {
        DICT = new HashMap<>(16);
        DICT.put(0, new String[]{});
        DICT.put(1, new String[]{});
        DICT.put(2, new String[]{"a", "b", "c"});
        DICT.put(3, new String[]{"d", "e", "f"});
        DICT.put(4, new String[]{"g", "h", "i"});
        DICT.put(5, new String[]{"j", "k", "l"});
        DICT.put(6, new String[]{"m", "n", "o"});
        DICT.put(7, new String[]{"p", "q", "r", "s"});
        DICT.put(8, new String[]{"t", "u", "v"});
        DICT.put(9, new String[]{"w", "x", "y", "z"});
    }

    private static <T> Stream<T> cartesian(BinaryOperator<T> aggregator, Supplier<Stream<T>>... streams) {
        return Arrays.stream(streams)
                .reduce((s1, s2) -> () -> s1.get().flatMap(t1 -> s2.get().map(t2 -> aggregator.apply(t1, t2))))
                .orElse(Stream::empty).get();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Stream<String> result = cartesian(
                (a, b) -> a + b,
                () -> Arrays.stream(DICT.get(2)),
                () -> Arrays.stream(DICT.get(3))
        );
        result.forEach(System.out::println);
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

}
