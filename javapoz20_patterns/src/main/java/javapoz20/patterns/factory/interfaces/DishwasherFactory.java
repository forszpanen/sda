package javapoz20.patterns.factory.interfaces;

public interface DishwasherFactory {
    Tablet createTablet();
    Salt createSalt();
    Cleaner createCleaner();
}
