package Arrays;

import java.util.ArrayList;


public class Arrays {

    public static void main(String[] args) {
        int[] array = {0,1,0,1,0,1,99};
        int c = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    c++;
                }
            }
            if(c==1){
                // System.out.println(array[i]);
                list.add(array[i]);
            }
            c=0;
        }
        System.out.println(list);
    }
}
