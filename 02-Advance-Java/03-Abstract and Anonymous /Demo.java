abstract class A
{
    public abstract void show();
}

// class B extends A
// {
//     public void show()
//     {
//         System.out.println("in show B");
//     }
// }

public class Demo {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("anonymous show method");
            }
        };
        obj.show();
    }
}
