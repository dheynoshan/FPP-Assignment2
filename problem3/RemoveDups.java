package problem3;

import java.util.Arrays;

public class RemoveDups {
    public static String[] removeDuplicates(String[] arr){
        if(arr.length == 0)
            return null;

        String[] temp = new String[arr.length];
        int count = 0;
        int index = 0;
        boolean found = false;

        while(count<arr.length){
            for(int i=0; i<=index; i++){
                if(arr[count]==temp[i]){
                    found=true;
                }
            }
            if(!found){
                temp[index++] = arr[count];
                found = false;
            }
            count++;
        }
        String[] returnString = new String[index];
        System.arraycopy(temp,0,returnString,0,index);
        return returnString;
    }

    public static void main(String[] args){
        String[] arr = {"horse", "dog", "cat", "horse", "dog"};
        System.out.println(Arrays.toString(RemoveDups.removeDuplicates(arr)));
    }

}
