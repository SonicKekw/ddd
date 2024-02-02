class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new ConcreteProductMechnik();
    }

    @Override
    public NoHuman createNoHuman() {
        return new ConcreteProductElf();
    }
}