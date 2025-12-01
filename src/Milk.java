public class Milk implements CoffeeDecorator {
    private Coffee coffee;              

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override public Coffee getCoffee() { return coffee; }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 25.00;
    }
}