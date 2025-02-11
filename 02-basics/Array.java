public class Array{
    public static void main(String[] args) {
        // int num[] = new int[5]; // array of size 5 => all elements are zero 


        // int num[] = {1, 2, 3, ....} 

        // System.out.println(num[1]);
        // num[1] = 10;
        // System.out.println(num[1]);
        // for(int i = 0; i<5; i++) System.out.println(num[i]);


        // multi-dimensional

        int num[][] = new int [3][4];

        // adding random values to the array
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                num[i][j] = (int)(Math.random()*10);
            }
        }

        // printing array
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[]: num){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("jagged array:");

        System.out.println();
        
        int jagged[][] = new int [3][];

        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];

        for(int i = 0; i < jagged.length; i++){
            for(int j = 0; j<jagged[i].length; j++){
                jagged[i][j] = (int)(Math.random()*10);
            }
        }

        for(int n[]: jagged){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
    }


}