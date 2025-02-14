class A
{
    public void show()
    {
        System.out.println("in show A");
    }

    class B
    {
        public void config()
        {
            System.out.println("in config B");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }    
}
