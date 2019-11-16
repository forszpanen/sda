package javapoz20.patterns.task1.notice;

import java.math.BigDecimal;

public final class Notice {
    private final String title;
    private final String type;
    private final String description;
    private final BigDecimal price;
    private final Contact contact;

    Notice(String title, String type, String description, BigDecimal price, Contact contact) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.price = price;
        this.contact = contact;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Contact getContact() {
        return contact;
    }

    public static NoticeBuilder createSale(String title, BigDecimal price) {
        return new NoticeBuilder(title, "SALE").withPrice(price);
    }

    public static NoticeBuilder createBuy(String title, BigDecimal price) {
        return new NoticeBuilder(title, "BUY").withPrice(price);
    }

    public static NoticeBuilder createGiveaway(String title) {
        return new NoticeBuilder(title, "GIVEAWAY");
    }
}
