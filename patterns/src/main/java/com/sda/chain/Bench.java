package com.sda.chain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Bench extends AbstractChainElement {
    private final Set<String> answerPossible;

    public Bench(String... answerPossible) {
        this.answerPossible = new HashSet<>(Arrays.asList(answerPossible));
    }

    @Override
    protected Optional<Result> solveImpl(Zadanie zadanie) {
        return Optional.empty();
    }
}
