package javapoz20.patterns.task1.notice;

public class HtmlPresentationStrategy implements PresentationStrategy {
    @Override
    public String accept(Notice notice) {
        return "<html><body>" +
                "<h1>" +
                notice.getTitle() +
                "<h1>" +
                "<p>" +
                notice.getDescription() +
                "</p>" +
                "</body></html>";
    }
}
