package com.sda.prototype;

import java.util.Objects;

public class SimpleObject {
    private final String name;
    private int magicNumber;

    public SimpleObject(String name, int magicNumber) {
        this.name = name;
        this.magicNumber = magicNumber;
    }

    public String getName() {
        return name;
    }

    public int getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleObject that = (SimpleObject) o;
        return magicNumber == that.magicNumber &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magicNumber);
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "name='" + name + '\'' +
                ", magicNumber=" + magicNumber +
                '}';
    }

    public SimpleObject createFrom() {
        return new SimpleObject(name, magicNumber);
    }
}
