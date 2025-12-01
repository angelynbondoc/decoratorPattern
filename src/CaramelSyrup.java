public class CaramelSyrup implements CoffeeDecorator {
    private Coffee coffee;       

    public CaramelSyrup(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override public Coffee getCoffee() { return coffee; }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 40.00;
    }
}