package javapoz20.patterns.factory.finish;

import javapoz20.patterns.factory.interfaces.Cleaner;
import javapoz20.patterns.factory.interfaces.DishwasherFactory;
import javapoz20.patterns.factory.interfaces.Salt;
import javapoz20.patterns.factory.interfaces.Tablet;

public class FinishFactory implements DishwasherFactory {
    @Override
    public Tablet createTablet() {
        return new FinishTable();
    }

    @Override
    public Salt createSalt() {
        return new FinishSalt();
    }

    @Override
    public Cleaner createCleaner() {
        return new FinishCleaner();
    }
}
