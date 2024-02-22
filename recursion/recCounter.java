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

        // int res = recursiveSum(l);
        // System.out.println(res);

        // int res = countSizeArr(new int[] {0,1,2,3,4}, 0);
        // System.out.println(res);
        int[] arr = new int[] {0,1,2,3,4};
        int m = findMax(arr, arr.length);
        System.out.println(m);
    }

    private static int findMax(int[] list, int l) {
        if(l==1){
            return list[0];
        }
        else{
            int curr = findMax(list, l-1);
            if(curr>list[l-1])
                return curr;
            else 
                return list[l-1];
        }
    }
    
    private static void countDown(int i){
        System.out.println(i);
        if(i<=0) return;
        else countDown(i-1);
        System.out.println(i);
    }

    private static int recursiveSum(List<Integer> list){
        int tmp = 0;
        if(list.isEmpty()) return 0;
        else{
            tmp = tmp + list.get(0) + recursiveSum(list.subList(1, list.size()));
            return tmp;
        } 
    }

    private static int countSizeArr(int[] arr, int l){
        int size = 0;
        if(l==(arr.length-1)){
            return 1;
        }
        else {
            size = size + 1 + countSizeArr(arr, l+1) ;
            return size;
        }
    }
}
