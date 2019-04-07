package com.sda.visistor;

import java.math.BigDecimal;

public class AverageSalaryVisitor implements Visitor {
    private BigDecimal sum = BigDecimal.ZERO;
    private int counter = 0;

    public BigDecimal getAvgSalary() {
        return sum.divide(BigDecimal.valueOf(counter));
    }

    @Override
    public void visitWorker(Worker worker) {
        sum = sum.add(worker.getSalary());
        counter++;
    }

    @Override
    public void visitCompany(Company company) {
        // No salary in company
    }
}
