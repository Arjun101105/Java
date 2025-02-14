abstract class Car {
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("playing music . . .");
    }
}

abstract class Adas extends Car
{
    public abstract void adas();
}

class Tesla extends Adas
{
    public void adas()
    {
        System.out.println("welcome to tesla auto-pilot");
    }
    public void drive()
    {   
        System.out.println("you are driving a tesla");
    }
}

class Bugatti extends Car
{   
    public void drive()
    {
        System.out.println("driving . . .");
    }
}

public class AbstractKW {

    public static void main(String[] args) {

        // Car maruti = new Car(); // *** // we cannot create object of an abstract class

        Car tate = new Bugatti();
        Adas tesla = new Tesla();

        tate.drive();
        tate.playMusic();

        tesla.drive();
        tesla.adas();
    }
}