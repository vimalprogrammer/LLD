public abstract class ScoopDecorator implements IceCream{
    IceCream iceCream;

    public ScoopDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}
