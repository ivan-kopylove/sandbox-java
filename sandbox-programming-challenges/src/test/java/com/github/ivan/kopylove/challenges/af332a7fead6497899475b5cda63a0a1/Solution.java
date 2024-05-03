package com.github.ivan.kopylove.challenges.af332a7fead6497899475b5cda63a0a1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/unique-morse-code-words/submissions/856022381/">804. Unique Morse Code Words</a>
 */
class Solution
{
    static String[] letters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words)
    {
        Map<Character, String> alphabet = new HashMap<>();
        Set<String> result = new HashSet<>();


        for (char i = 'a', j = 0; i <= 'z'; i++, j++)
        {
            alphabet.put(i, letters[j]);
        }

        String code = "";

        for (String letter : words)
        {
            for (char c : letter.toCharArray())
            {
                code += alphabet.get(c);
            }

            result.add(code);
            code = "";
        }

        return result.size();
    }
}