import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo
{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = null;
        try{

            System.out.println("using buffer reader: ");        
    
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }finally{
            bf.close();
        }

        
        // try(Scanner sc = new Scanner(System.in);)
        // {

        //     System.out.println("using scanner: ");
        //     int num2 = sc.nextInt();
        //     System.out.println(num2);
        // }
    }


}