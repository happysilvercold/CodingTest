package com.coding.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {

    public String sortChar(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    @Override
    public int compare(String s1, String s2) {
        return sortChar(s1).compareTo(sortChar(s2));
    }
}
