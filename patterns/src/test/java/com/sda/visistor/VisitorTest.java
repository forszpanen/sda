package com.sda.visistor;

import org.junit.Test;
import org.mockito.Mockito;

public class VisitorTest {

    @Test
    public void shouldVisitWorker() {
        final Element element = new Worker();
        final Visitor visitor = Mockito.mock(Visitor.class);

        element.accept(visitor);

        Mockito.verify(visitor).visitWorker(Mockito.any(Worker.class));
    }

    @Test
    public void shouldVisitCompany() {
        final Element element = new Company();
        final Visitor visitor = Mockito.mock(Visitor.class);

        element.accept(visitor);

        Mockito.verify(visitor).visitCompany(Mockito.any(Company.class));
    }

    @Test
    public void shouldVisitComplexStructure() {
        final Company company = new Company();
        final Worker worker1 = new Worker();
        final Worker worker2 = new Worker();
        company.add(worker1);
        company.add(worker2);

        final Visitor visitor = Mockito.mock(Visitor.class);

        company.accept(visitor);

        Mockito.verify(visitor).visitCompany(Mockito.eq(company));
        Mockito.verify(visitor).visitWorker(Mockito.eq(worker1));
        Mockito.verify(visitor).visitWorker(Mockito.eq(worker2));
    }
}
