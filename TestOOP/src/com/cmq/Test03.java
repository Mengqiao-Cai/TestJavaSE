package com.cmq;

import java.util.HashMap;

/**
 * @author: cmq
 * @date: 7/26/2024 - 07 - 26 - 12:28 PM
 * @version: 1.0
 */
//
//Given a string s, find the length of the longest 
//        substring without repeating characters.
//
//         
//        Example 1:
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

// sliding window for finding longest substring
//    curIndex -> interate from 0->s.length(), start: start index of current substring
//hashmap -> Character-index, renew the res (compare length), start -> hashmap[char]+1



//dzxabca -> [curIndex] c, [curHead] d; [curIndex] a [curHead] d
public class Test03 {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(longestSub(s1));
        System.out.println(longestSub(s2));
        System.out.println(longestSub(s3));
    }
    public static Integer longestSub(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int curIndex = 0;
        int curHead = 0;
        int res = -1;
        while (curIndex<s.length()) {
            Character curChar = s.charAt(curIndex);
            if (!map.containsKey(curChar)) {
                map.put(curChar, curIndex);
                //curIndex++;
                int curLen = curIndex - curHead;
                if (curLen > res) {
                    res = curLen;
                }
            } else {
                int curLen = curIndex - curHead - 1;
                if (curLen > res) {
                    res = curLen;
                }

                int repeatIndex = map.get(curChar);
                for (int i=curHead;i<=repeatIndex;i++) {
                    map.remove(s.charAt(i));
                }
                curHead = repeatIndex + 1;
                //curIndex++;
            }
            curIndex++;
        }
        return res;
    }
}
