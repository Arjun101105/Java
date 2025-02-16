enum Status{
 // named constants 

    Running, Failed, Pending, Success;

}   

public class Demo{
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);

        Status t = Status.Pending;
        System.out.println(t);

        System.out.println(t.ordinal()); // pending is at index 2 ... so ordinal should print => 2

        // we can also print all the values inside of status
        Status [] ss = Status.values();

        for(Status st: ss){
            System.out.print(st + " ");
        }
        System.out.println();
    }
}