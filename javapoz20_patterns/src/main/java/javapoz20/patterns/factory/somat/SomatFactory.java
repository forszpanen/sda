package javapoz20.patterns.factory.somat;

import javapoz20.patterns.factory.interfaces.Cleaner;
import javapoz20.patterns.factory.interfaces.DishwasherFactory;
import javapoz20.patterns.factory.interfaces.Salt;
import javapoz20.patterns.factory.interfaces.Tablet;

public class SomatFactory implements DishwasherFactory {
    @Override
    public Tablet createTablet() {
        return new SomatTable();
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
