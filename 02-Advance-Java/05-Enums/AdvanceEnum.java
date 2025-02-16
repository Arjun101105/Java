enum Status
{
    Running, Failed, Success, Pending
}

public class AdvanceEnum {
    public static void main(String[] args) {

        // using if-else:

        Status s = Status.Running;

        if(s == Status.Running)
            System.out.println("up and running");
        else if(s == Status.Failed)
            System.out.println("try again later");
        else if(s == Status.Pending)
            System.out.println("pls wait");
        else System.out.println("success");

        // using switch case:

        Status t = Status.Pending;

        switch (t) {
            case Running:
                System.out.println("up and running");
                break;
            case Failed:
                System.out.println("failed .. pls try again ");
                break;
            case Pending:
                System.out.println("pls wait .. pending");
                break;
            default: System.out.println("success");
                break;
        }
    }
}
