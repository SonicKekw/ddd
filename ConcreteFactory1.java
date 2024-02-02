class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new ConcreteProductLuchnik();
    }

    @Override
    public NoHuman createNoHuman() {
        return new ConcreteProductOrk();
    }
}
