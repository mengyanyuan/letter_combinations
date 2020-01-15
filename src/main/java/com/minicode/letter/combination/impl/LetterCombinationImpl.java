package com.minicode.letter.combination.impl;

import com.minicode.letter.combination.ILetterCombination;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author zhoushixiong
 */
public class LetterCombinationImpl implements ILetterCombination {

    /**
     * Digits from [0, 9],(Note that 0 and 1 do not map to any letters)
     */
    private String digits;

    public LetterCombinationImpl(int[] digits) {
        this.digits = arrayToString(digits);
    }

    public LetterCombinationImpl(int[] digits, boolean useStream) {
        if (useStream) {
            this.digits = arrayToStringByStream(digits);
        } else {
            this.digits = arrayToString(digits);
        }
    }

    @Override
    public List<String> convert() {
        List<String> result = new LinkedList<>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        combine(result, digits, 0, "");
        return result;
    }


    @Override
    public List<String> convertDistribute() {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        conbineDistrubute(result, digits, "");
        return result;
    }

    /**
     * Convert a type of int array to a string
     *
     * @param array origin number array
     * @return the string consist of the origin array's elements
     */
    @NotNull
    private String arrayToString(int[] array) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            stringBuffer.append(array[i]);
        }
        return stringBuffer.toString();
    }

    /**
     * Convert a type of int array to a string by stream
     *
     * @param array origin number array
     * @return the string consist of the origin array's elements
     */
    @NotNull
    private String arrayToStringByStream(int[] array) {
        return Arrays.stream(array).mapToObj(item -> "" + item).reduce((last, curr) -> last + curr).get();
    }

    /**
     * Use a divide-and-conquer strategy
     */
    public void conbineDistrubute(List<String> res, String digits, String str) {
        if (digits.length() > 2) {
            List<String> leftList = new ArrayList<>();
            List<String> rightList = new ArrayList<>();
            String leftStr = digits.substring(0, digits.length() / 2);
            conbineDistrubute(leftList, leftStr, str);
            String rightStr = digits.substring(digits.length() / 2);
            conbineDistrubute(rightList, rightStr, str);
            merge(res, leftList, rightList);
        } else {
            combine(res, digits, 0, "");
        }
    }

    private void merge(List<String> res, List<String> a, List<String> b) {
        if (a.size() != 0 && a.size() != 0) {
            a.forEach(aItem -> {
                b.forEach(bItem -> {
                    res.add(aItem + bItem);
                });
            });
        }
    }

    /**
     * Recursive generation of combinations using backtracking
     *
     * @param result    result
     * @param digits number list of inputed
     * @param index  index
     * @param tmp
     */
    private void combine(List<String> result, String digits, int index, String tmp) {
        if (index == digits.length()) {
            result.add(String.valueOf(tmp));
            return;
        }
        int num = digits.charAt(index) - '0';
        for (int i = 0; i < map[num].length(); i++) {
            combine(result, digits, index + 1, tmp + map[num].charAt(i));
        }
        return;
    }

    /**
     * Merge two collections
     *
     * @param aggregator
     * @param streams
     * @param <T>
     * @return
     */
    private <T> Stream<T> cartesian(BinaryOperator<T> aggregator, Supplier<Stream<T>>... streams) {
        return Arrays.stream(streams)
                .reduce((s1, s2) -> () -> s1.get().flatMap(t1 -> s2.get().map(t2 -> aggregator.apply(t1, t2))))
                .orElse(Stream::empty).get();
    }
}
