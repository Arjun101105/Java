enum Laptop
{
    Mac(2000), XPS(2500), Inspiron, ThinkPad(1800);

    private int price;

    private Laptop()
    {   
        price = 500;
    }

    private Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {

        // Laptop lap = Laptop.Mac;
        // System.out.println(lap);

        // System.out.println(lap.getPrice());

        for(Laptop lap: Laptop.values())
        {
            System.out.println(lap + ": " + lap.getPrice());
        }
    }
}
