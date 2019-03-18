package com.sda;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestGC {
    public static void main(String[] args) throws InterruptedException {
        final Set<byte[]> byteSet = new HashSet<>();
        while(true){
            byte[] bytes = new byte[1024 * 1024 * 100];
            new Random().nextBytes(bytes);
            byteSet.add(bytes);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
