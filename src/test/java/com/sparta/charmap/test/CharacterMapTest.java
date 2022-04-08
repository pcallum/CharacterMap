package com.sparta.charmap.test;

import java.util.*;
import com.sparta.charmap.CharacterMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CharacterMapTest<result, expected> {
    private static CharacterMap charMap;
    @BeforeAll
    public static void setUp(){
        charMap = new CharacterMap();
    }

    @Test
    public void testNormalString() {
        Map result = charMap.characterMap("Callum");
        Map<Character, Integer> expected = new HashMap();
        expected.put('c', 1);
        expected.put('a', 1);
        expected.put('l', 2);
        expected.put('u', 1);
        expected.put('m', 1);
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testEmptyString() {
        Map result = charMap.characterMap("");
        Map<Character, Integer> expected = new HashMap();
        Assertions.assertEquals(result, expected);
    }
}
