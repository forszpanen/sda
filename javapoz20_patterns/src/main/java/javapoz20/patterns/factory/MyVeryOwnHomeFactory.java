package javapoz20.patterns.factory;

import javapoz20.patterns.factory.finish.FinishTable;
import javapoz20.patterns.factory.interfaces.Cleaner;
import javapoz20.patterns.factory.interfaces.DishwasherFactory;
import javapoz20.patterns.factory.interfaces.Salt;
import javapoz20.patterns.factory.interfaces.Tablet;
import javapoz20.patterns.factory.somat.SomatCleaner;
import javapoz20.patterns.factory.somat.SomatSalt;

public class MyVeryOwnHomeFactory implements DishwasherFactory {
    @Override
    public Tablet createTablet() {
        return new FinishTable();
    }

    @Override
    public Salt createSalt() {
        return new SomatSalt();
    }

    @Override
    public Cleaner createCleaner() {
        return new SomatCleaner();
    }
}
