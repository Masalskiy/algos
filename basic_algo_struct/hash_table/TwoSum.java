package basic_algo_struct.hash_table;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        int[] mass = { 2, 7, 11, 15 };
        twoSum(mass, 0);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            // из target вычитаем значение
            // проверяем есть ли разность в хеш таблице. вычитаемое значение не в счет
            int substract = target - nums[i];
            if(numMap.containsKey(substract) && numMap.get(substract)!=i){
                return new int[] {numMap.get(substract), i};
            }
        }
        return new int[2];
    }

    public static int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int substract = target - nums[i];
            if(numMap.containsKey(substract)){
                return new int[]{numMap.get(substract), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
