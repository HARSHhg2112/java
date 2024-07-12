import java.util.*;
public class cointainsmostwater {
    public static int storewater(ArrayList<Integer> height){
        int maxwater=0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-1;
               int currwater=ht*width;
                maxwater=Math.max(maxwater,currwater);
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(4);
        System.out.println(storewater(height));
        
    }
    
}
