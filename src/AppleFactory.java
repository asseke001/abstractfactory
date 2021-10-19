public class AppleFactory extends AbstractFactory {
    @Override
    public Mobile getMobile(String model){
        if(model.equalsIgnoreCase("iphone")){
            return new Iphone();
        }
        return null;
    }
}

