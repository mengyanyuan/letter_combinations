package com.minicode.letter.combination;

import java.util.List;

/**
 * @author zhoushixiong
 */
public interface ILetterCombination {

    /**
     * Alphanumeric mapping dictionary
     */
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    /**
     * Convert the number of digits entered into all possible letter combinations
     *
     * @return
     */
    List<String> convert();

    /**
     * Divide numbers into letters with a divide-and-conquer strategy
     *
     * @return
     */
    List<String> convertDistribute();
}
