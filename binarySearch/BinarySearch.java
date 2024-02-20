package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = new int[] {0,1,2};
        int result = binarySearch(list, 1);

        System.out.println(result);
    }
    
    public static Integer binarySearch(int[] list, int searchVal){
        if(list.length<=2){
            for (int index = 0; index < list.length; index++) {
                if(list[index] == searchVal) return index;
            }
            return null;
        }

        int low = 0;
        int hight = list.length-1;
        int middleIndex= 0;

        while(low <= hight){
            middleIndex = (hight+low)/2;
            if(list[middleIndex]==searchVal) return middleIndex;
            // массив  станет размерности low middleIndex  
            else if(list[middleIndex] > searchVal) hight = middleIndex;
            // массив станет размерности middleIndex hight
            else if(list[middleIndex] < searchVal) low=middleIndex;
        }
        return null;
    }
}
