
class Literals{
public static void main(String args[])
{
    // literals
    int num1 = 0b101; // b=> binary; 101=> 5 in binary
    int num2 = 0x7E; // x=> hexadecimal
    System.out.println(num1);
    System.out.println(num2);

    // type conversion and type-casting;
    byte b = 127; // 127 is the max value for byte
    int a = b;
    System.out.println(a);
    int a1 = 257;
    byte k = (byte)a1;
    System.out.println(k);    

    float f = 10.00f;
    int n = (int)f;
    System.out.println(n);

    byte one = 10;
    byte two = 30;
    int result = one * two; // here results goes out of bounds for byte ... so result gets automatic type-promotion to integer ... no need to typecast it.

    System.out.println(result);
}
}
