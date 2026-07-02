package Alpha.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Pair_sum_Brute_Force {

    public static String pairSum(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return "Pair :- ("+ list.get(i) +" , "+ list.get(j)+")";
                }
            }
        }
        return "No pair possible";
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 10;

        System.out.println(pairSum(list,target));
    }
}
