package com.sda.templatemethod;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public abstract class Encoder {


    public String encode(String string) {
        try {
            byte[] digest = MessageDigest.getInstance(getAlgorithmName()).digest(string.getBytes());
            return Base64.getEncoder().encodeToString(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return string;
    }

    protected abstract String getAlgorithmName();
}
