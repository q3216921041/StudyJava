package 算法_1;

/**
 * @Auther: Qiu
 * @Email : 3216921041@qq.com
 * @Date: 2020/5/23 12:24
 * @Version:1.8
 * @Software: IntelliJ IDEA
 * @Description:
 */
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        System.out.println("a".substring(1).length());
        System.out.println(letterCombinations("22"));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> strgroup = new ArrayList<String>();
        if (digits.length() == 0) {
            return strgroup;
        }
        while (digits != "") {
            String letter = getletter(digits.substring(0, 1));
            for (int i = 0; i < strgroup.toArray().length; i++) {
                strgroup.set(i, strgroup.get(i) + letter.substring(0, 1));
                for (int j = 1; j < letter.length(); j++) {
                    strgroup.add(strgroup.get(i) + letter.substring(j, j + 1));
                }

            }
            if (strgroup.toArray().length == 0) {
                for (int i = 0; i < letter.length(); i++) {
                    strgroup.add(letter.substring(i, i + 1));
                }
            }
            digits =digits.substring(1);
        }
        return strgroup;
    }

    private static String getletter(String num) {
        switch(num){
            case "2" : return "abc";
            case "3" : return "def";
            case "4" : return "ghi";
            case "5" : return "jkl";
            case "6" : return "mno";
            case "7" : return "pqrs";
            case "8" : return "tuv";
            case "9" : return "wxyz";
        }
        return "";
    }
}
// @lc code=end


