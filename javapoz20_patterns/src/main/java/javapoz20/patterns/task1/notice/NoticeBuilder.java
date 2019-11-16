package javapoz20.patterns.task1.notice;

import java.math.BigDecimal;

public class NoticeBuilder {
    private String title;
    private String type;
    private String description;
    private BigDecimal price;
    private Contact contact;

    NoticeBuilder(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public NoticeBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public NoticeBuilder withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public NoticeBuilder withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public Notice createNotice() {
        return new Notice(title, type, description, price, contact);
    }
}