package problem1;
import java.lang.Math;

public class Prog1 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1, 9);
        int y = RandomNumbers.getRandomInt(3, 14);

        System.out.println("PI to the power of " + x + "= " + Math.pow(Math.PI, x));
        System.out.println("PI to the power of " + y + "= " + Math.pow(Math.PI, y));
    }

}
