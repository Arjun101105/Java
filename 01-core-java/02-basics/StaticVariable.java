class Mobile
{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " ; " + price +  " ; " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " ; " + obj.price +  " ; " + name);
        // cannot refer brand and price as they are not static 
        // we need the object to refer brand and price 
    }

}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "samsung";
        obj1.price = 50000;
        // obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Nokia 3310";
        obj2.price = 2000;

        obj1.show();
        obj2.show();

        System.out.println();
        
        // obj2.name = "dabba phone"; // name for all mobile objects changes as it is `static`
 
        obj1.show();
        obj2.show();

        // Mobile.show(); Cannot make a static reference to the non-static method show() from the type Mobile

        Mobile.show1(obj1);
    }
}
