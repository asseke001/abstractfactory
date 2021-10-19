public class AndroidFactory extends AbstractFactory {
    @Override
    public Mobile getMobile(String brand)
    {
        if(brand.equalsIgnoreCase("Samsung"))
        {
            return new Samsung();
        }
        else if(brand.equalsIgnoreCase("Nokia"))
        {
            return new Nokia();
        }
        return null;
    }
}
