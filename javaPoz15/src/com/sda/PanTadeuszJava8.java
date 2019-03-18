package com.sda;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PanTadeuszJava8 {
    public static void main(String[] args) throws IOException {
        final File file = new File("/home/konrad/pan-tadeusz.txt");
        final String text = FileUtils.readFileToString(file, Charset.defaultCharset());

        Stream
                .of(text.split("[ \t\n,.;:\"'\\-()/…!?«»]+"))
                .map(String::toLowerCase)
                .map(String::trim)
                .filter(s -> s.length() >= 3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, (t1, t2) -> {
                    if (t1 > t2) {
                        return -1;
                    } else if (t2 > t1) {
                        return 1;
                    }
                    return 0;
                })).limit(5)
                .forEach(System.out::println);
    }
}
