package javapoz20.patterns.coffemachine;

import java.util.ArrayList;

public class CoffeeMachine {
    private ItalianExpress express;
    private MilkCarton milkCarton;
    private SugarCan sugarCan;

    private CoffeeMachine(ItalianExpress express, MilkCarton milkCarton, SugarCan sugarCan) {
        this.express = express;
        this.milkCarton = milkCarton;
        this.sugarCan = sugarCan;
    }

    public static CoffeeMachine createCoffeeMachine() {
        return new CoffeeMachine(new ItalianExpress(), new MilkCarton(), new SugarCan());
    }

    public Coffee createEspresso() {
        Coffee coffee = new Coffee(new ArrayList<>());
        express.createEspresso(coffee);
        return coffee;
    }

    public Coffee createMachiatto() {
        Coffee machiatto = createEspresso();
        milkCarton.addMilk(machiatto);
        return machiatto;
    }

    public Coffee createLatte() {
        Coffee coffee = createEspresso();
        milkCarton.addMilk(coffee);
        milkCarton.addMilk(coffee);
        milkCarton.addMilk(coffee);
        milkCarton.addMilk(coffee);
        milkCarton.addMilk(coffee);
        return coffee;
    }
}
