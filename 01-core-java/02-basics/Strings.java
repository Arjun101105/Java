

public class Strings {
    public static void main(String[] args) {
        String name = new String("arjun");
        name = name + " nair";
        // System.out.println(name);

        // string buffer
        StringBuffer sb = new StringBuffer("arjun");
        System.out.println("capacity is: " + sb.capacity());
        System.out.println("length of sb is: " + sb.length());

        sb.append(" nair");
        System.out.println(sb);


        
    }
}
