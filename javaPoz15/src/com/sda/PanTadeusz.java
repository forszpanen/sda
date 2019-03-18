package com.sda;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PanTadeusz {
    public static void main(String[] args) throws IOException {
        final File file = new File("/home/konrad/pan-tadeusz.txt");
        System.in.read();
        final String text = FileUtils.readFileToString(file, Charset.defaultCharset());
        System.in.read();
        final String[] words = text.split("[ \t\n,.;:\"'\\-()/…!?«»]+");
        System.in.read();
        final String[] lowerCaseWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            lowerCaseWords[i] = words[i].toLowerCase();
        }
        System.in.read();
        final Map<String, Integer> result = new HashMap<>();
        for (String word : lowerCaseWords) {
            if (word.trim().length() <= 3) {
                continue;
            }
            int number = 1;
            if (result.containsKey(word)) {
                number += result.get(word);
            }
            result.put(word, number);
        }
        System.in.read();
        final List<Map.Entry<String, Integer>> list = new ArrayList<>(result.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("5 most common words");
        int top = 5;
        while (top-- > 0)
            System.out.println(list.get(list.size() - top - 1));
    }
}

