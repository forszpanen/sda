package javapoz20.patterns.decorator;

public class Decorator implements Producer {
    private LabelProducer labelProducer;

    public Decorator(LabelProducer labelProducer) {
        this.labelProducer = labelProducer;
    }

    public String createLabel() {
        return "Heheheheh " + labelProducer.createLabel();
    }
}
