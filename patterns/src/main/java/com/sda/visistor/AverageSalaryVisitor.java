package com.sda.visistor;

import java.math.BigDecimal;

public class AverageSalaryVisitor implements Visitor {
    public BigDecimal getAvgSalary() {
        return null;
    }

    @Override
    public void visitWorker(Worker worker) {

    }

    @Override
    public void visitCompany(Company company) {

    }
}
