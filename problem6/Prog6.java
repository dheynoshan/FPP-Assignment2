package problem6;

public class Prog6 {
    public static int min(int[] arrayOfInts){
        int min = arrayOfInts[0];
        for(int i=1; i< arrayOfInts.length; i++){
            if(arrayOfInts[i]<min){
                min=arrayOfInts[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println("Min value is: " + Prog6.min(arr));
    }
}
