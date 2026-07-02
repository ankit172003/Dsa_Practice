package Alpha.ArrayList;

import java.util.ArrayList;

public class Pair_Sum_Array_Rotated {

    public static String pairSum(ArrayList<Integer> list, int target){
        int left =0, right = list.size()-1;

        // check pivot rotaion of array
        for(int i=0;i<list.size()-1;i++){
            if(!(list.get(i) < list.get(i+1))){
              left = i+1; // smallest
              right = i; // largest
            }
        }

        while (list.get(right) > list.get(left)){
            if(list.get(left) + list.get(right) == target){
                return "Pair is ("+left+" , "+ right+")";
            } else if (list.get(left) + list.get(right) < target) {
                if(left == list.size()-1){
                    left = 0;
                }
                else{
                    left++;
                }
            }
            else if (list.get(left) + list.get(right) > target) {
                if (right == 0){
                    right = list.size()-1;
                }
                else{
                    right--;
                }
            }
        }
        return "no such pair";
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 17;

        System.out.println(pairSum(list,target));
    }
}
