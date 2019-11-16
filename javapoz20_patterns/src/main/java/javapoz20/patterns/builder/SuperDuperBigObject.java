package javapoz20.patterns.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SuperDuperBigObject {
    private String name;
    private String version;
    private String nickname;
    private BigDecimal size;
    private BigDecimal volume;
    private int a, b, c;
    private List<Object> objectList;

    SuperDuperBigObject(String name, String version, String nickname, BigDecimal size, BigDecimal volume, int a, int b, int c, List<Object> objectList) {
        this.name = name;
        this.version = version;
        this.nickname = nickname;
        this.size = size;
        this.volume = volume;
        this.a = a;
        this.b = b;
        this.c = c;
        this.objectList = objectList;
    }

    public static void main(String[] args) {
        SuperDuperBigObject object =
                new SuperDuperBigObjectBuilder("", "aa", "aa")
                        .withA(10)
                        .withB(12)
                        .withName("Name")
                        .withObjectList(new ArrayList<>())
                        .createSuperDuperBigObject();
    }
}
