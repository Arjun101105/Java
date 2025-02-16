
interface A {
    // all methods are public-abstract by default 
    // variables are final and static

    int age = 19;
    String city = "mumbai";
    String name ="arjun";
    void show();
    void config();
}  

interface clg {
    String clgName();
}

class B implements A,clg
{
    public void show()
    {
        System.out.println("show B");
    }
    public void config()
    {
        System.out.println("config B");
    }
    public String clgName()
    {
       return "VCET";
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.name + " : " + A.age + ", " + A.city);
        System.out.println("clg: "+obj.clgName());
    }    
}
