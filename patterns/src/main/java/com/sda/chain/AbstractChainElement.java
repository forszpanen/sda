package com.sda.chain;

import java.util.Optional;

public abstract class AbstractChainElement {
    private AbstractChainElement next;

    public void setNext(AbstractChainElement next) {
        this.next = next;
    }

    public Optional<Result> solve(Zadanie zadanie) {
        return solveImpl(zadanie);
    }

    protected abstract Optional<Result> solveImpl(Zadanie zadanie);
}
