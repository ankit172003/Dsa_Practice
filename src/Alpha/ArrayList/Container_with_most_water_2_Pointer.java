package Alpha.ArrayList;

import java.util.ArrayList;

public class Container_with_most_water_2_Pointer {
    public static int maxWater(ArrayList<Integer> height){
        int max_water = Integer.MIN_VALUE;
        int Lp = 0;
        int Rp = height.size()-1;
        while(Lp<Rp){
            int heigth_to_consider = Math.min(height.get(Lp),height.get(Rp));
            int width = Rp-Lp;
            int water = heigth_to_consider*width;
            max_water = Math.max(max_water,water);
            if(height.get(Lp)<height.get(Rp)){
                Lp++;
            }
            else{
                /*
                 Basically is Rp heigth is less than Lp than we will Rp--
                 and will try to get it big as well so to get max_water
                 */
                Rp--;
            }
        }
        return max_water;
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
        System.out.println("Maximum amount of water store is container is = "+ water);

    }
}
