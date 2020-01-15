import com.minicode.letter.combination.ILetterCombination;
import com.minicode.letter.combination.impl.LetterCombinationImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author : zhoushixiong <br>
 * @date : 2020/1/13 22:46 <br>
 * @E-mail : mengyanyuan@outlook.com
 * @description : All tests include a comparison of the efficiency of backtracking and divide-and-conquer algorithms
 */
public class SolutionTest {
    /**
     * Normal test
     */
    @Test
    public void testNormal() {
        int arr[] = {2, 3};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Anomaly test: the first number is 0
     */
    @Test
    public void testZoro1() {
        int arr[] = {0, 3};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Exception test: input contains 0
     */
    @Test
    public void testZoro2() {
        int arr[] = {3, 0};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Exception test: input contains both 0 and 1
     */
    @Test
    public void testZeroAndOne() {
        int arr[] = {0, 1};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Normal test: new requirements
     */
    @Test
    public void testNewRequirements1() {
        int arr[] = {9, 23};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Exception test: input contains both 0 and 1 in new requirement
     */
    @Test
    public void testZeroAndOneInNewRequirement() {
        int arr[] = {9, 21, 99};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Normal test: new requirements
     */
    @Test
    public void testNewRequirements2() {
        int arr[] = {9, 23, 99};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Extended testing, testing for higher digit cases
     */
    @Test
    public void testNewRequirements3() {
        int arr[] = {945, 23, 99};
        ILetterCombination letterCombination1 = new LetterCombinationImpl(arr);
        long timePoint1 = System.nanoTime();
        List<String> result1 = letterCombination1.convert();
        ILetterCombination letterCombination2 = new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        List<String> result2 = letterCombination2.convertDistribute();
        long timePoint3 = System.nanoTime();

        System.out.printf("Output1:%s\n\tSize:%d\n\tCost:%d ns\n\n", result1, result1.size(), timePoint2 - timePoint1);
        System.out.printf("Output2:%s\n\tSize:%d\n\tCost:%d ns\n\n", result2, result2.size(), timePoint3 - timePoint2);
    }

    /**
     * Test comparison of constructors using arrays with stream conversion vs. arrays using loop conversion
     */
    @Test
    public void testStreamVSLoop() {
        int arr[] = {945, 23, 99, 33, 4, 3, 5, 24, 235, 234, 56234, 234, 52, 235, 562};
        long timePoint1 = System.nanoTime();
        new LetterCombinationImpl(arr);
        long timePoint2 = System.nanoTime();
        new LetterCombinationImpl(arr, true);
        long timePoint3 = System.nanoTime();

        System.out.printf("Cost:%d ns\n\n", timePoint2 - timePoint1);
        System.out.printf("Cost:%d ns\n\n", timePoint3 - timePoint2);
    }

}
