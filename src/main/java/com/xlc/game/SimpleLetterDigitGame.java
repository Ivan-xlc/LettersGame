package com.xlc.game;

/**
 * @author XLC
 * @create 2020-12-03 8:35
 */
public class SimpleLetterDigitGame extends LetterDigitGame {

    @Override
    public String getOneLetterCombinationsByDigit(int digit, String[] letters) {
        int length = letters.length - 1;
        if (digit >= 0 && digit <= length) {
            return letters[digit];
        } else {
            throw new IllegalArgumentException("IllegalArgument param:" + digit + ", Please input digits from 0 to " + length);
        }
    }
}
