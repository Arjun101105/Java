
class Computer {

    public void playMusic() {
        System.out.println("playing music ...");
    }

    public String buyPen(int cost) {
        if (cost >= 10) {
            return "here's you pen";
        }else{
            return "paisa de madarchod";
        }
    }
}

public class method {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.buyPen(5));
    }
}
