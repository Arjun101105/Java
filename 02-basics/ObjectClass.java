class Laptop
{
    String model;
    int price;


    public String toString()
    {
        return model + " :" + price;
    }
}


public class ObjectClass {
    public static void main(String[] args) {
        Laptop dell = new Laptop();
        dell.model = "inspiron";
        dell.price = 60000;
        System.out.println(dell);
    }
}
