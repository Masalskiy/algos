package recursion;

import java.util.ArrayList;
import java.util.List;

public class recCounter {
    public static void main(String[] args) {
        // countDown(10);
        List<Integer> l = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
            }
        };

        int res = recursiveSum(l);
        System.out.println(res);
    }
    
    private static void countDown(int i){
        System.out.println(i);
        if(i<=0) return;
        else countDown(i-1);
        System.out.println(i);
    }
    private static int recursiveSum(List<Integer> list){
        int listSize = list.size();
        int tmp = 0;
        if(list.isEmpty()) return 0;
        else{
            tmp = tmp + list.get(0) + recursiveSum(list.subList(1, listSize));
            return tmp;
        } 
    }

}
