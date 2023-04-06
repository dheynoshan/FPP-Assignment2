package problem5;

import java.util.Arrays;

public class Prog5 {
    int num = 0;
    public int[] combine(int[] a, int[] b){
        int[] output = new int[a.length + b.length];
        for(int i=0; i<a.length; i++){
            output[i] = a[i];
        }
        for(int i=a.length; i<output.length; i++){
            output[i] = b[num++];
        }
        return output;
    }

    public static void main(String[] args){
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        Prog5 pr = new Prog5();
        System.out.println(Arrays.toString(pr.combine(a,b)));
    }
}
