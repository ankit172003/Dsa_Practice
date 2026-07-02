package Alpha.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Basic_ArrayList {
    public static void swap (ArrayList<Integer> list,int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add element
        list.add(1);
        list.add(2);
        list.add(3);

        // This takes O(n) |
        list.add(3,16); // set at specific index

        System.out.println(list);
        System.out.println(list.get(2)); // Get element

        //Delete element
        list.remove(2);

        //set element 2- index , new value - 10
        list.set(1,10);// array size should have 2 index
        System.out.println(list);

        //contains
        System.out.println(list.contains(10));
        System.out.println(list.contains(15));

        // size
        System.out.println(list.size());

        //print reverse of ArrayList
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
            System.out.println();
        }

        //find max in ArrayList
        int max = Integer.MIN_VALUE;
        for (Integer i: list) {
//            if (i > max) {
//                max = i;
//            }
            //OR use
            max = Math.max(max,i);
        }
        System.out.println("largest element = " + max);

        //swap 2 Numbers
        int idx1 = 0, idx2 = 2;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);

        //sorting in ArrayList
        Collections.sort(list);//asc
        System.out.println(list);
        //reverse sort
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);




    }
}

