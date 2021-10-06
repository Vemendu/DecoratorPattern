public class VanillaIceCreamDecorator extends IceCreamDecorator{

    public VanillaIceCreamDecorator(IIceCream iceCream) {
        super(iceCream);
    }

    public String addFlavour()
    {
        return ", with Vanilla topping";
    }

    public String toString()
    {
        return super.toString() + addFlavour();
    }
}
