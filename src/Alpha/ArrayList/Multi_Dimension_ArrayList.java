package Alpha.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Multi_Dimension_ArrayList {
    public static void main(String[] args) {
        //Create Multi-Dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        //Create list with value of Table of 1
        ArrayList<Integer> list1 = new ArrayList<>();

        //Create list with value of Table of 2
        ArrayList<Integer> list2 = new ArrayList<>();

        //Create list with value of Table of 3
        ArrayList<Integer> list3 = new ArrayList<>();

        //Simple way to add 5 values in all list
        for(int j=1; j<=5; j++){
            list1.add(j*1);
            list2.add(j*2);
            list3.add(j*3);
        }

        //Add list's to mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        //Print using loop
        for(ArrayList<Integer> i:mainList){
            System.out.println(i);
        }
    }
}
