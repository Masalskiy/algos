//https://leetcode.com/problems/power-of-two/?envType=daily-question&envId=2024-02-19
public class Power_of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        System.out.println(n%2);
        
        if(n==1){
            return true;
        }
        else if(n%2!=0){
            return false;
        }
        else{
            return isPowerOfTwo(n/2);
        }
    }
}
