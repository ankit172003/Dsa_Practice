package Alpha.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Lonely_Numbers {

    public static ArrayList<Integer> findLonelyNumbers(ArrayList<Integer> list){

        Collections.sort(list); // sorted array

        ArrayList<Integer> lonely_list = new ArrayList<>();

        // logic to element from 2nd to 2nd last
        for(int i=1; i<list.size()-1;i++){
            if(list.get(i) != list.get(i+1) && list.get(i) != list.get(i-1)
                    && list.get(i+1) != list.get(i)+1 && list.get(i-1) != list.get(i)-1){
                lonely_list.add(list.get(i));

            }
        }

        // logic if only one number in array
        if(list.size()==1){
            lonely_list.add(list.get(0));
        }

        // logic to check 1st and last numbers in array
        if (list.size() >1){
            if (list.get(0)+1 != list.get(1) && list.get(0) != list.get(1) ){
                lonely_list.add(list.get(0));
            }

            if(list.get(list.size()-1)-1 != list.get(list.size()-2) && list.get(list.size()-1) != list.get(list.size()-2)){
                lonely_list.add(list.get(list.size()-1));
            }
        }

        return lonely_list;

    }

    public static void main(String[] args) {
        // = ,+1,-1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        System.out.println(findLonelyNumbers(list));

    }
}
