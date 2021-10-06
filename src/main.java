public class main {
    public static void main(String[] args) {
        IIceCream iceCream1 = new VanillaIceCreamDecorator(new ConeIceCream());
        System.out.println(iceCream1.toString());
        IIceCream iceCream2 = new ChocolateIceCreamDecorator(new VanillaIceCreamDecorator(new CupIceCream()));
        System.out.println(iceCream2);
    }
}
