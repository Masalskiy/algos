package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1,0};

        for (int i : pureSort(list)) {
            System.out.println(i);
        }

        System.out.println();
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println();
        sort(list);//функция с побочным эффектом
        for (int i : list) {
            System.out.println(i);
        }

    }

    private static int[] pureSort(int[] list){
        int min;
        int minIndex;
        int[] sList = list.clone();//sorted list

        for (int j = 0; j < sList.length; j++) {
            min = sList[j];
            minIndex = j;
            // поиск минимального значения в массиве
            for (int i = j+1; i < sList.length; i++) {
                if(min>sList[i]){
                    min=sList[i];
                    minIndex = i;
                }
            }
            if(sList[minIndex]<sList[j]){
                swap(sList, minIndex, j);
            }
        }
        return sList;
    }

    private static int[] sort(int[] list){
        int min;
        int minIndex;
        // нужно найти минимальное значение
        // поменять с неотсортированным
        for (int j = 0; j < list.length; j++) {
            min = list[j];
            minIndex = j;
            // поиск минимального значения в массиве
            for (int i = j+1; i < list.length; i++) {
                if(min>list[i]){
                    min=list[i];
                    minIndex = i;
                }
            }
            if(list[minIndex]<list[j]){
                swap(list, minIndex, j);
            }
        }
        return list;
    }

    private static int[] swap(int[] list, int firstIndex, int secondIndex){
        int tmp = list[firstIndex];
        list[firstIndex] = list[secondIndex];
        list[secondIndex] = tmp;
        return list;
    }
}
