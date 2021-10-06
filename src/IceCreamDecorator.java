public class IceCreamDecorator implements IIceCream{
    private IIceCream iceCream;
    public IceCreamDecorator(IIceCream iceCream)
    {
        this.iceCream=iceCream;
    }

    @Override
    public String toString() {
        return iceCream.toString();
    }
}
