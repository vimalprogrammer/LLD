public class ChocolatewSyrup extends SyrupDecorator{

    public ChocolatewSyrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 50;
    }

    @Override
    public void getDescription() {
        iceCream.getDescription();
        System.out.println("Cocholate syrup");
    }
}
