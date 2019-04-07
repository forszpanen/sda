package com.sda.chain;

import java.util.Optional;

public abstract class AbstractChainElement {
    private AbstractChainElement next;

    public void setNext(AbstractChainElement next) {
        this.next = next;
    }

    public Optional<Result> solve(Zadanie zadanie) {
        Optional<Result> myResult = solveImpl(zadanie);
        if (myResult.isPresent()) {
            return myResult;
        }
        if (next != null) {
            return next.solve(zadanie);
        }
        return Optional.empty();
    }

    protected abstract Optional<Result> solveImpl(Zadanie zadanie);
}
