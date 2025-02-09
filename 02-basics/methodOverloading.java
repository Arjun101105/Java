
class Calculator{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 5));
        System.out.println(cal.add(1,3,6));
    }
}
