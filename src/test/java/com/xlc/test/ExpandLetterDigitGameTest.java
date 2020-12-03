package com.xlc.test;

import com.xlc.game.ExpandLetterDigitGame;
import org.junit.Test;

import java.util.List;

/**
 * @author XLC
 * @create 2020-12-03 9:24
 */
public class ExpandLetterDigitGameTest {

    /**
     * 输入一个0-9数字
     */
    @Test
    public void testDigit() {
        int[] number = {4};
        System.out.println("\r\nInput: arr[] = {4}");
        ExpandLetterDigitGame game = new ExpandLetterDigitGame();
        List<String> letterCombinations = game.letterCombinations(number);
        System.out.print("Output: ");
        for (String s : letterCombinations) {
            System.out.print(s + " ");
        }
    }

    /**
     * 输入一个10-99的个位和十位不同的数字
     */
    @Test
    public void testNumber() {
        int[] number = {34};
        System.out.println("\r\nInput: arr[] = {34}");
        ExpandLetterDigitGame game = new ExpandLetterDigitGame();
        List<String> letterCombinations = game.letterCombinations(number);
        System.out.print("Output: ");
        for (String s : letterCombinations) {
            System.out.print(s + " ");
        }
    }

    /**
     * 输入一个10-99的个位和十位相同的数字
     */
    @Test
    public void testNumber2() {
        int[] number = {33};
        System.out.println("\r\nInput: arr[] = {33}");
        ExpandLetterDigitGame game = new ExpandLetterDigitGame();
        List<String> letterCombinations = game.letterCombinations(number);
        System.out.print("Output: ");
        for (String s : letterCombinations) {
            System.out.print(s + " ");
        }
    }

    /**
     * 输入多个正常数字
     */
    @Test
    public void testMore() {
        int[] number = {2,34};
        System.out.println("\r\nInput: arr[] = {2,34}");
        ExpandLetterDigitGame expandLetterDigitGame = new ExpandLetterDigitGame();
        List<String> letterCombinations = expandLetterDigitGame.letterCombinations(number);
        System.out.print("Output: ");
        for (String s : letterCombinations) {
            System.out.print(s + " ");
        }
    }

    /**
     * 输入空数组
     */
    @Test
    public void testNullArr() {
        int[] number = {};
        System.out.println("\r\nInput: arr[] = {}");
        ExpandLetterDigitGame expandLetterDigitGame = new ExpandLetterDigitGame();
        List<String> letterCombinations = expandLetterDigitGame.letterCombinations(number);
        System.out.print("Output: ");
        for (String s : letterCombinations) {
            System.out.print(s + " ");
        }
    }

    /**
     * 输入没有字母映射的特殊数字
     */
    @Test
    public void testNoMapNumber() {
        int[] number = {10};
        System.out.println("\r\nInput: arr[] = {10}");
        ExpandLetterDigitGame expandLetterDigitGame = new ExpandLetterDigitGame();
        List<String> letterCombinations = expandLetterDigitGame.letterCombinations(number);
        System.out.print("Output: ");
        for (String s : letterCombinations) {
            System.out.print(s + " ");
        }
    }

    /**
     * 输入没有字母映射的特殊数字和有映射的数字
     */
    @Test
    public void testNoMapNumberAndNormal() {
        int[] number = {24,1,3};
        System.out.println("\r\nInput: arr[] = {24,1,3}");
        ExpandLetterDigitGame expandLetterDigitGame = new ExpandLetterDigitGame();
        List<String> letterCombinations = expandLetterDigitGame.letterCombinations(number);
        System.out.print("Output: ");
        for (String s : letterCombinations) {
            System.out.print(s + " ");
        }
    }

    /**
     * 测试左边界数字
     */
    @Test
    public void testLeftBound() {
        int[] number = {-1,43,5};
        System.out.println("\r\nInput: arr[] = {-1,43,5}");
        ExpandLetterDigitGame expandLetterDigitGame = new ExpandLetterDigitGame();
        try {
            List<String> letterCombinations = expandLetterDigitGame.letterCombinations(number);
            System.out.print("Output: ");
            for (String s : letterCombinations) {
                System.out.print(s + " ");
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
        int[] number = {4,5,100};
        System.out.println("\r\nInput: arr[] = {4,5,100}");
        ExpandLetterDigitGame expandLetterDigitGame = new ExpandLetterDigitGame();
        try {
            List<String> letterCombinations = expandLetterDigitGame.letterCombinations(number);
            System.out.print("Output: ");
            for (String s : letterCombinations) {
                System.out.print(s + " ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
