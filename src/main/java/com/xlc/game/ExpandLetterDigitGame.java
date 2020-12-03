package com.xlc.game;

/**
 * @author XLC
 * @create 2020-12-03 8:55
 */
public class ExpandLetterDigitGame  extends LetterDigitGame {

    @Override
    protected String getOneLetterCombinationsByDigit(int digit, String[] letters) {
        if(digit < 0 || digit > 99){
            throw new IllegalArgumentException("IllegalArgument param:" + digit + ", Please input number from 0 to 99");
        }else if(digit <= 9){
            return letters[digit];
        }else {
            int fir = digit / 10;
            int sec = digit % 10;
            //由于fir与sec相同时,组合成的字母会重复,需要去重
            return fir == sec? letters[fir]: letters[fir] + letters[sec];
        }
    }
}
