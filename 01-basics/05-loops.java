class Loop {
    public static void main(String[] args) {
        int i = 1;
        // while
        System.out.println("executing while loop:-");
        while(i <= 5){
            System.out.println(i+" hello world");
            i++;
        }

        // do while
        int j = 1;
        System.out.println("executing do-while loop:-");
        do{
            System.out.println(j);
            j++;
        }while(j>5);

        // for loop
        System.out.println("executing for loop:-");
        for(int k = 1; k<=5; k++){
           System.out.println(k);
        }
        
    }
}
