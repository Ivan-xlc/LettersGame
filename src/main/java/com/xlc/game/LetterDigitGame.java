package com.xlc.game;

import com.xlc.common.LetterNumberMap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XLC
 * @create 2020-12-03 8:13
 */
public abstract class LetterDigitGame {

    //最终输出结果集合
    private List<String> outPutList = new ArrayList<String>();

    //字母字符串数组
    private String[] letters = LetterNumberMap.letters;

    /**
     * 根据数字获取对应的字母字符串
     * @param number 数字
     * @param letters 字母字符串数组
     * @return 映射的字母字符串
     */
    protected abstract String getOneLetterCombinationsByDigit(int number,String[] letters);

    /**
     * 根据数字获取对应的字母字符串
     * @param numberArr 数字数组
     * @return 字母组合字符串集合
     */
    public List<String> letterCombinations(int[] numberArr) {
        //如果数组为null或长度为0
        if(numberArr == null ||  numberArr.length == 0){
            return outPutList;
        }
        String[] letters = LetterNumberMap.letters;
        //生成所有字母组合添加到outPutList
        letterCombinations(outPutList,numberArr, 0, "");
        return outPutList;
    }

    /**
     *
     * @param outPutList 存放最后结果的list
     * @param digits 输入的数字数组
     * @param index 当前遍历digits的下标
     * @param cur 当前的字符串
     * @return
     */
    private void letterCombinations(List<String> outPutList, int[] digits, int index, String cur){
        if (index == digits.length){
            //说明遍历了一遍了，需要加入outPutList
            outPutList.add(cur);
            return;
        }
        int digit = digits[index];
        //获取数字所对应的字符串
        String temp = getOneLetterCombinationsByDigit(digit,letters);

        int tempLength = temp.length();
        //如果数组长为0,代表是数字0或1
        if (temp.length()==0){
            letterCombinations(outPutList, digits, index+1, cur);
        }
        for (int i = 0; i < tempLength; i++){
            String next = cur + temp.charAt(i);
            letterCombinations(outPutList,  digits, index+1, next);
        }
    }
}
