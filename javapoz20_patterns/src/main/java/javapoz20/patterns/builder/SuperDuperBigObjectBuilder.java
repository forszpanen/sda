package javapoz20.patterns.builder;

import java.math.BigDecimal;
import java.util.List;

public class SuperDuperBigObjectBuilder {
    private String name;
    private String version;
    private String nickname;
    private BigDecimal size;
    private BigDecimal volume;
    private int a;
    private int b;
    private int c;
    private List<Object> objectList;

    public SuperDuperBigObjectBuilder(String s, String aa, String aa1) {
        name = s;
        version = aa;
        nickname = aa1;
        size = BigDecimal.TEN;
    }

    public SuperDuperBigObjectBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public SuperDuperBigObjectBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    public SuperDuperBigObjectBuilder withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public SuperDuperBigObjectBuilder withSize(BigDecimal size) {
        this.size = size;
        return this;
    }

    public SuperDuperBigObjectBuilder withVolume(BigDecimal volume) {
        this.volume = volume;
        return this;
    }

    public SuperDuperBigObjectBuilder withA(int a) {
        this.a = a;
        return this;
    }

    public SuperDuperBigObjectBuilder withB(int b) {
        this.b = b;
        return this;
    }

    public SuperDuperBigObjectBuilder withC(int c) {
        this.c = c;
        return this;
    }

    public SuperDuperBigObjectBuilder withObjectList(List<Object> objectList) {
        this.objectList = objectList;
        return this;
    }

    public SuperDuperBigObject createSuperDuperBigObject() {
        return new SuperDuperBigObject(name, version, nickname, size, volume, a, b, c, objectList);
    }
}