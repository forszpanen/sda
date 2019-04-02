package com.sda.prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ComplexObject {
    private final String name;
    private final Set<Integer> magicNumbers;

    public ComplexObject(String name, Set<Integer> magicNumbers) {
        this.name = name;
        this.magicNumbers = magicNumbers;
    }

    public String getName() {
        return name;
    }

    public Set<Integer> getMagicNumbers() {
        return magicNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexObject that = (ComplexObject) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(magicNumbers, that.magicNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magicNumbers);
    }

    public void addMagicNumber(int number) {
        magicNumbers.add(number);
    }

    public ComplexObject createFrom() {
        return new ComplexObject(name, new HashSet<>(magicNumbers));
    }
}
