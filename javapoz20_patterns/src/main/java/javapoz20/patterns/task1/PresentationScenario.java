package javapoz20.patterns.task1;

import javapoz20.patterns.task1.notice.*;

import java.math.BigDecimal;
import java.util.Iterator;

public class PresentationScenario {
    public static void main(String[] args) {
        Notice notice1 = Notice.createBuy("Bike", BigDecimal.ZERO).createNotice();
        Notice notice2 = Notice.createSale("LEGO", new BigDecimal(100)).createNotice();
        Notice notice3 = Notice.createGiveaway("Cat").createNotice();

        NoticeBoard.getInstance().add(notice1);
        NoticeBoard.getInstance().add(notice2);
        NoticeBoard.getInstance().add(notice3);
        NoticeBoard.getInstance().add(Notice.createSale("Szafa", new BigDecimal(50)).createNotice());

        PresentationStrategy presentationStrategy = new HtmlPresentationStrategy();
        Iterator<Notice> iterator = NoticeBoard.getInstance().list();
        while (iterator.hasNext()) {
            Notice notice = iterator.next();
            NoticePresenter noticePresenter1 = new NoticePresenter(notice);
            noticePresenter1.setStrategy(presentationStrategy);
            System.out.println(noticePresenter1.present());
        }
    }
}
