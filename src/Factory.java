public class Factory {
    public static void main(String[] args)
    {
        AbstractFactory mobileFactory1 = FactoryProducer.getFactory(false);
        Mobile samsung = mobileFactory1.getMobile("Samsung");
        samsung.brandName();
        Mobile nokia =  mobileFactory1.getMobile("Nokia");
        nokia.brandName();
        AbstractFactory mobileFactory2 = FactoryProducer.getFactory(true);
        Mobile iphone = mobileFactory2.getMobile("iphone");
        iphone.brandName();
    }
}
