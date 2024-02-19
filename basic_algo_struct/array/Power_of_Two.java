//https://leetcode.com/problems/power-of-two/?envType=daily-question&envId=2024-02-19
public class Power_of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo_v2(-2));
    }

    // 16/2=8/2=4/2=2/2=1
    public static boolean isPowerOfTwo(int n) {
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
    // при возведении в квадрат получаем только положительные числа
    //16 ->  10000 16-1=15->01111
    // 8  -> 01000 8-1=7 -> 00111 res 01000 & 00111 = 0
    // 4  -> 00100 4-1=3 -> 00011
    // 2  -> 00010 2-1=1 -> 00001
    // 0  -> 00000 0-1=-1

    //15 –> 01111 
    //14 -> 01110
    //res-> 01110
    //
    public static boolean isPowerOfTwo_v2(int n) {
        if(n<=0){
            return false;
        }
        else {
            return (n & (n-1)) == 0;
        }
    }

}
