class Calculator
{
    int a;
    public int add(int n1,int n2)
    {
        int result = n1+n2;
        return result;
    }
}


public class Demo {
    public static void main(String a[]) {
        int num1 = 5;
        int num2 = 5; 
        
        // int result = num1 + num2;
        // System.out.println(result);

        Calculator calc = new Calculator();

        int result = calc.add( num1,  num2);
        System.out.println(result);
    }
}
