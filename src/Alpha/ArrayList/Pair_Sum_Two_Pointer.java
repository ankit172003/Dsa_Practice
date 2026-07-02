package Alpha.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pair_Sum_Two_Pointer {

    public static String twoPair(ArrayList<Integer> list, int target){
        int i = 0;
        int j = list.size()-1;

        while(i<j){
            if(list.get(i) + list.get(j) == target){
                return "Pair is ("+ list.get(i)+ ","+ list.get(j) +")";
            }
            else if(list.get(i) + list.get(j) < target){
                i++;
            }
            else if(list.get(i) + list.get(j) > target){
                j--;
            }
        }
        return "no such pair to achieve target";
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 8;

        System.out.println(twoPair(list,target));
    }
}
