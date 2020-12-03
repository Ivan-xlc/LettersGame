package com.xlc.test;

import com.xlc.game.SimpleLetterDigitGame;
import org.junit.Test;

import java.util.List;

/**
 * @author XLC
 * @create 2020-12-03 8:48
 */
public class SimpleLetterDigitGameTest {
    /**
     * 输入一个正常数字
     */
    @Test
    public void testOne() {
        int[] number = {4};
        SimpleLetterDigitGame simpleLetterDigitGame = new SimpleLetterDigitGame();
        List<String> letterCombinations = simpleLetterDigitGame.letterCombinations(number);
        System.out.println("\r\nInput: arr[] = {4}");
        System.out.print("Output: ");
        for (String one : letterCombinations) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入多个正常数字
     */
    @Test
    public void testMore() {
        int[] number = {2,3};
        SimpleLetterDigitGame simpleLetterDigitGame = new SimpleLetterDigitGame();
        List<String> letterCombinations = simpleLetterDigitGame.letterCombinations(number);
        System.out.println("\r\nInput: arr[] = {2,3}");
        System.out.print("Output: ");
        for (String one : letterCombinations) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入空数组
     */
    @Test
    public void testNullArr() {
        int[] number = {};
        SimpleLetterDigitGame simpleLetterDigitGame = new SimpleLetterDigitGame();
        List<String> letterCombinations = simpleLetterDigitGame.letterCombinations(number);
        System.out.println("\r\nInput: arr[] = {}");
        System.out.print("Output: ");
        for (String one : letterCombinations) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入没有字母映射的特殊数字
     */
    @Test
    public void testNoMapNumber() {
        int[] number = {1};
        SimpleLetterDigitGame simpleLetterDigitGame = new SimpleLetterDigitGame();
        List<String> letterCombinations = simpleLetterDigitGame.letterCombinations(number);
        System.out.println("\r\nInput: arr[] = {1}");
        System.out.print("Output: ");
        for (String one : letterCombinations) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入没有字母映射的特殊数字和有映射的数字
     */
    @Test
    public void testNoMapNumberAndNormal() {
        int[] number = {2,1,3};
        SimpleLetterDigitGame simpleLetterDigitGame = new SimpleLetterDigitGame();
        List<String> letterCombinations = simpleLetterDigitGame.letterCombinations(number);
        System.out.println("\r\nInput: arr[] = {2,1,3}");
        System.out.print("Output: ");
        for (String one : letterCombinations) {
            System.out.print(one + " ");
        }
    }

    /**
     * 测试左边界数字
     */
    @Test
    public void testLeftBound() {
        int[] number = {-1,4,5};
        SimpleLetterDigitGame simpleLetterDigitGame = new SimpleLetterDigitGame();
        try {
            List<String> letterCombinations = simpleLetterDigitGame.letterCombinations(number);
            System.out.println("\r\nInput: arr[] = {-1,4,5}");
            System.out.print("Output: ");
            for (String one : letterCombinations) {
                System.out.print(one + " ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }

    /**
     * 测试右边界数字
     */
    @Test
    public void testRightBound() {
        int[] number = {4,5,10};
        SimpleLetterDigitGame simpleLetterDigitGame = new SimpleLetterDigitGame();
        try {
            List<String> letterCombinations = simpleLetterDigitGame.letterCombinations(number);
            System.out.println("\r\nInput: arr[] = {4,5,10}");
            System.out.print("Output: ");
            for (String one : letterCombinations) {
                System.out.print(one + " ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
