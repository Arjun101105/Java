


public class Inheritances{
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4,5);
        int r2 =  obj.sub(7,3 );
        System.out.println(r1 + " " + r2);

        AdvCalc adv = new AdvCalc();
        int n1 = adv.multi(5,2);
        int n2 = adv.div(20, 2);

        System.out.println(n1 + " " + n2);

        VeryAdvCalc newCal = new VeryAdvCalc();
        double n3 = newCal.power(3, 2);
        System.out.println(n3);

    }
}