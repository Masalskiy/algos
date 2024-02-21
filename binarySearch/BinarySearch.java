package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = new int[] { 0,1,2,3,4,5,6,6,7,8,9,10 };

        int result;
        result = binarySearch(list, 0);
        if (result == -1 || result == 0)
            System.out.println("sucsess binarySearch");

        result = recursiveBinarySearch(list, 0, list.length-1, 0);
        if (result == -1 || result == 0)
            System.out.println("sucsess recursiveBinarySearch " + result);
    }

    private static int binarySearch(int[] list, int searchVal) {
        int low = 0;
        int hight = list.length - 1;
        int middleIndex = 0;

        while (low <= hight) {
            middleIndex = (hight + low) / 2;
            if (list[middleIndex] == searchVal)
                return middleIndex;
            // массив поиска станет размерности low middleIndex
            else if (list[middleIndex] < searchVal)
                low = middleIndex + 1;
            // массив поиска станет размерности middleIndex hight
            else
                hight = middleIndex - 1;
        }
        return -1;
    }

    // l - left, r - right, s - search
    private static int recursiveBinarySearch(int[] list, int l, int r, int s) {
        if (l <= r) {
            int mid = (r + l) / 2;
            if (list[mid] == s)
                return mid;
                
            if (list[mid] < s)
               return recursiveBinarySearch(list, mid + 1, r, s);
            
            return recursiveBinarySearch(list, l, mid - 1, s);
        }
        return -1;
    }
}
