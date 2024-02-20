package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1,0};
        sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }

    private static int[] sort(int[] list){
        int min;
        int minIndex;
        // нужно найти минимальное значение
        // поменять с неотсортированным
        for (int j = 0; j < list.length; j++) {
            min = list[j];
            minIndex = j;
            for (int i = j+1; i < list.length; i++) {
                if(min>list[i]){
                    min=list[i];
                    minIndex = i;
                }
            }
            if(list[minIndex]<list[j]){
                int tmp = list[j];
                list[j] = list[minIndex];
                list[minIndex] = tmp;
            }
        }
        return list;
    }
}
