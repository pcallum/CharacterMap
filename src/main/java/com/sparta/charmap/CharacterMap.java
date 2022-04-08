package com.sparta.charmap;

import java.util.*;

public class CharacterMap {
    public Map characterMap(String str) {
        Map<Character, Integer> charMap = new HashMap();
        for(Character ch: str.toLowerCase().toCharArray()) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
            System.out.println(charMap);
        }

        return charMap;
    }
}
