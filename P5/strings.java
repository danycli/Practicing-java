package P5;

import java.util.*;

public class strings{
    public static void main(String[] args){
        //Method 1
        int [] numbers = new int[5];
        numbers [0] = 44;
        numbers [1] = 32;
        numbers [2] = 45;
        numbers [3] = 12;
        numbers [4] = 66;
        for(int i = 0; i<5; i++){
            System.out.println(numbers[i]);
        }
        //Method 2
        System.out.println(Arrays.toString(numbers));
        int [] birds = {3,4,2,5,6};
        int len = birds.length;
        System.out.println(len);
        System.out.println(Arrays.toString(birds));
    }
}