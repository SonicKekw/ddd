public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        Human productA1 = factory1.createHuman();
        NoHuman productB1 = factory1.createNoHuman();
        productA1.createHuman();
        productB1.createNoHuman();

        AbstractFactory factory2 = new ConcreteFactory2();
        Human productA2 = factory2.createHuman();
        NoHuman productB2 = factory2.createNoHuman();
        productA2.createHuman();
        productB2.createNoHuman();
    }
}