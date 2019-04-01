package com.sda.composite;

import org.junit.Test;
import org.mockito.Mockito;

public class CompositeTest {
    @Test
    public void shouldDrawRect() {
        final Rect rect = Mockito.spy(new Rect());

        rect.draw();

        Mockito.verify(rect).draw();
    }

    @Test
    public void shouldDrawCircle() {
        final Circle circle = Mockito.spy(new Circle());

        circle.draw();

        Mockito.verify(circle).draw();
    }

    @Test
    public void shouldDrawPicture() {
        final Picture picture = new Picture();

        Circle circle = Mockito.spy(new Circle());
        Rect rect = Mockito.spy(new Rect());
        Rect rect2 = Mockito.spy(new Rect());
        picture.add(circle);
        picture.add(rect);
        picture.add(rect2);
        picture.draw();

        Mockito.verify(circle).draw();
        Mockito.verify(rect).draw();
        Mockito.verify(rect2).draw();
    }

    @Test
    public void shouldDrawPicture2() {
        final Picture picture = new Picture();

        Circle circle = Mockito.spy(new Circle());
        Rect rect = Mockito.spy(new Rect());
        Rect rect2 = Mockito.spy(new Rect());
        picture.add(circle);
        picture.add(rect);
        picture.add(rect2);
        picture.remove(rect);
        picture.draw();

        Mockito.verify(circle).draw();
        Mockito.verify(rect, Mockito.never()).draw();
        Mockito.verify(rect2).draw();
    }

    @Test
    public void shouldDrawPictureInPicture() {
        final Picture picture = new Picture();
        final Picture picture2 = new Picture();

        Circle circle = Mockito.spy(new Circle());
        Rect rect = Mockito.spy(new Rect());
        Rect rect2 = Mockito.spy(new Rect());
        picture.add(circle);
        picture2.add(rect);
        picture2.add(rect2);
        picture.add(picture2);
        picture.draw();

        Mockito.verify(circle).draw();
        Mockito.verify(rect).draw();
        Mockito.verify(rect2).draw();
    }
}
