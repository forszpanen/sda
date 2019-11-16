package javapoz20.patterns.task1.notice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NoticeBoard {

    private static NoticeBoard instance;

    public static NoticeBoard getInstance() {
        if (instance == null) {
            instance = new NoticeBoard();
        }
        return instance;
    }

    private final List<Notice> notices = new ArrayList<>();

    public void add(Notice notice) {
        notices.add(notice);
    }

    public void remove(Notice notice) {
        notices.remove(notice);
    }

    public Iterator<Notice> list() {
        return notices.iterator();
    }

}
