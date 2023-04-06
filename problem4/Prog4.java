package problem4;

public class Prog4 {
    public static void main(String[] args){
        float a = 1.27F;
        float b = 3.881F;
        float c = 9.6F;

        int sumOfFloats = (int) (a+b+c);
        int sumAfterRounding = Math.round(a) + Math.round(b) + Math.round(c);

        System.out.println("Sum of floats: " + sumOfFloats);
        System.out.println("Sum after rounding: " + sumAfterRounding);

    }
}
