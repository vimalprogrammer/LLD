public abstract class SyrupDecorator implements  IceCream{
    IceCream iceCream;

    public SyrupDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}
