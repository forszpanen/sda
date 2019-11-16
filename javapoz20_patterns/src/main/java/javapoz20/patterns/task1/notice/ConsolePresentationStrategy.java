package javapoz20.patterns.task1.notice;

public class ConsolePresentationStrategy implements PresentationStrategy {
    @Override
    public String accept(Notice notice) {
        return notice.getTitle() + " " +
                notice.getType() +
                (notice.getPrice() != null ? " " + notice.getPrice() : "");
    }

}
