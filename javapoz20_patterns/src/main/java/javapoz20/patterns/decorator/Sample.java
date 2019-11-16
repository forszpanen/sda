package javapoz20.patterns.decorator;

public class Sample {
    public static void main(String[] args) {
        Producer labelProducer = new LabelProducer();
        System.out.println(labelProducer.createLabel());
        Producer labelProducerDecorator = new Decorator((LabelProducer) labelProducer);
        System.out.println(labelProducerDecorator.createLabel());
    }
}
