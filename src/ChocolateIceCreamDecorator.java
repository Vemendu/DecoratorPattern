public class ChocolateIceCreamDecorator extends IceCreamDecorator{
    public ChocolateIceCreamDecorator(IIceCream iceCream) {
        super(iceCream);
    }

    public String addFlavour()
    {
        return ", with Chocolate topping";
    }

    public String toString()
    {
        return super.toString() + addFlavour();
    }
}
