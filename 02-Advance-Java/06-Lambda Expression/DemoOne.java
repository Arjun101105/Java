
@FunctionalInterface
interface A
{
    void show(); // public abstract by default
}

@FunctionalInterface
interface B
{
    void display(int n);
}

public class DemoOne {
    public static void main(String[] args) {

        A obj  = new A(){
            public void show(){
                System.out.println("in show A");
            }
        };
        obj.show();


        // using lambda expression 

        A obj2 = () ->
        {
            System.out.println("in show obj2");
        };
        obj2.show();
        
        B num = n -> System.out.println("entered number is: " + n);
        num.display(5);
    }
}
