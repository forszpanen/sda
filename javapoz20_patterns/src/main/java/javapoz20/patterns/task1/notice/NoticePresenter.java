package javapoz20.patterns.task1.notice;

public class NoticePresenter {
    private final Notice notice;
    private PresentationStrategy strategy;

    public NoticePresenter(Notice notice) {
        this.notice = notice;
    }

    public void setStrategy(PresentationStrategy strategy) {
        this.strategy = strategy;
    }

    public String present() {
        return strategy.accept(notice);
    }
}
