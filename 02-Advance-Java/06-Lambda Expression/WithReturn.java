
@FunctionalInterface
interface A
{
    int add(int m, int n);
}


public class WithReturn {
    public static void main(String[] args) {
        A obj = (m, n) -> m+n;
        System.out.println("sum is: " + obj.add(5,5));
    }   
}
