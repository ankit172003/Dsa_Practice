package Alpha.ArrayList;

import java.util.ArrayList;

public class Container_with_most_water_bruteforce {

    public static int maxWater(ArrayList<Integer> height){
        int max_Water = Integer.MIN_VALUE;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int min_height = Math.min(height.get(j),height.get(i));
                int width = j-i;
                int water = min_height * width;

                max_Water = Math.max(water,max_Water);
            }
        }


        return max_Water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int water = maxWater(height);
        System.out.println("Maximum water container can store is = " +water);


    }
}
