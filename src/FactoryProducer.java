public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isApple)
    {
        if(isApple)
        {
            return new AppleFactory();
        }
        else
        {
            return new AndroidFactory();
        }
    }
}